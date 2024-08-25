package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio10_4 extends AppCompatActivity {

    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio104);

        salir=(Button) findViewById(R.id.btnS4);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio10_4.this, Ejercicio10.class);
                startActivity(ejer);
            }
        });
    }
}