package com.example.loginmysql;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtPassword;
    TextView txtMensaje;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario= (EditText) findViewById(R.id.txtEmail);
        edtPassword= (EditText) findViewById(R.id.txtPassword);
        txtMensaje= (TextView) findViewById(R.id.mensaje);
        btnLogin= (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarUsuario("https://jsonplaceholder.typicode.com/users");
            }
        });
    }

    private void validarUsuario(String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(!response.isEmpty()&&!response.equals("[]")){

                    //txtMensaje.setText(response.toString());
                    //
                    // Intent intent = new Intent(getApplicationContext(),PaginaPrincipal.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o Contraseña Icorrectos!!", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
                txtMensaje.setText("Error "+error.toString());

            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String,String>();

                parametros.put("nomLogin", edtUsuario.getText().toString());
                parametros.put("claveLogin",edtPassword.getText().toString());

                return parametros;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}