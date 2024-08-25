package com.uttt.activity_main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Usuario> listaUsuarios;
    private RequestQueue rq;
    private RecyclerView rv1;
    private AdaptadorUsuario adaptadorUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaUsuarios = new ArrayList<>();
        rq = Volley.newRequestQueue(this);
        for (int f=0; f<10; f++)
            cargarPersona();
        rv1 = findViewById(R.id.rv1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv1.setLayoutManager(linearLayoutManager);
        adaptadorUsuario = new AdaptadorUsuario();
        rv1.setAdapter(adaptadorUsuario);
    }

    // En el método cargarPersona
    private void cargarPersona() {
        String url = "https://randomuser.me/api/";
        JsonObjectRequest requerimiento = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String valor = response.get("results").toString();
                    JSONArray arreglo = new JSONArray(valor);
                    JSONObject object = new JSONObject(arreglo.get(0).toString());
                    String mail = object.getString("email");
                    String nombre = object.getJSONObject("name").getString("last");
                    String foto=object.getJSONObject("picture").getString("large");

                    Usuario usuario = new Usuario(nombre, mail, foto);
                    listaUsuarios.add(usuario);
                    adaptadorUsuario.notifyItemRangeInserted(listaUsuarios.size(), 1);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        rq.add(requerimiento);
    }


    private class AdaptadorUsuario extends RecyclerView.Adapter<AdaptadorUsuario.AdaptadorUsuarioHolder> {


        @NonNull
        @Override
        public AdaptadorUsuarioHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdaptadorUsuarioHolder(getLayoutInflater().inflate(R.layout.layout_targeta, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull AdaptadorUsuarioHolder holder, int position) {
            holder.imprimir(position);
        }

        @Override
        public int getItemCount() {
            return listaUsuarios.size();
        }

        class AdaptadorUsuarioHolder extends RecyclerView.ViewHolder {
            TextView tvNombre, tvMail;
            ImageView ivFoto;

            public AdaptadorUsuarioHolder(@NonNull View itemView) {
                super(itemView);
                tvNombre = itemView.findViewById(R.id.tvNombre);
                tvMail = itemView.findViewById(R.id.tvMail);
                ivFoto = itemView.findViewById(R.id.ivFoto);
            }

            public void imprimir(int position) {
                tvNombre.setText("Nombre: " + listaUsuarios.get(position).getNombre());
                tvMail.setText("Mail: " + listaUsuarios.get(position).getMail());
                recuperarImagen(listaUsuarios.get(position).getFoto(),ivFoto);
            }

            private void recuperarImagen(String foto, ImageView iv) {
                ImageRequest peticion = new ImageRequest(foto,
                        new Response.Listener<Bitmap>() {
                            @Override
                            public void onResponse(Bitmap response) {
                                iv.setImageBitmap(response);
                            }
                        },
                        0,
                        0,
                        null,
                        null,
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {

                            }
                        });
                rq.add(peticion);
            }
        }
    }
}