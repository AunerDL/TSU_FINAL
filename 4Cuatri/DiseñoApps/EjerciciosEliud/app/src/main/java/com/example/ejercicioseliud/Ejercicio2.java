package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio2 extends AppCompatActivity {

    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        Button btn = (Button)findViewById(R.id.imageTextButton6);
        btn.setText("Android");
        btn.setCompoundDrawablesRelativeWithIntrinsicBounds(
                0,
                R.drawable.usuario,
                0,
                0
        );
        salir=(Button) findViewById(R.id.btnSalir2);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio2.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
}