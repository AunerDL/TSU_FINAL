package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio14 extends AppCompatActivity {

    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio14);

        salir=(Button) findViewById(R.id.btnSalir14);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio14.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
}