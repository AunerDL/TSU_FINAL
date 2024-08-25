package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio13 extends AppCompatActivity {

    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13);

        salir=(Button) findViewById(R.id.btnSalir13);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio13.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
}