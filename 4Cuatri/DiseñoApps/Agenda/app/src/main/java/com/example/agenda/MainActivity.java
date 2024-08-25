package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt_nombre, txt_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_nombre = (EditText) findViewById(R.id.txtNombre);
        txt_datos = (EditText) findViewById(R.id.txtDatos);
    }

    //boton guardar
    public void Guardar (View view){
        String nombre = txt_nombre.getText().toString();
        String datos = txt_datos.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("Agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor objEditor = preferencias.edit();
        //para editar y guardar
        objEditor.putString(nombre, datos);
        objEditor.commit();
        //mensaje
        Toast.makeText(this, "El contacto ha sido guardado", Toast.LENGTH_SHORT).show();
    }

    //boton buscar
    public void Buscar (View view){
        String nombreB = txt_nombre.getText().toString();

        //metodo para buscar en archivo Agenda
        SharedPreferences preferenciasB = getSharedPreferences("Agenda", Context.MODE_PRIVATE);
        //recuperar valores
        String datosB = preferenciasB.getString(nombreB, "");

        if(datosB.length() == 0){
            //no encontro nada
            Toast.makeText(this, "No se encontro ningun registro", Toast.LENGTH_SHORT).show();
        }else{
            //encontro datos
            txt_datos.setText(datosB);
            Toast.makeText(this, "Se encontraron los registros", Toast.LENGTH_SHORT).show();
        }
    }
}