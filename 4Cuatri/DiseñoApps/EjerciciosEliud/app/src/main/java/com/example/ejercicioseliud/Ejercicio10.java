package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ejercicio10 extends AppCompatActivity {

    Button eje10_1, eje10_2, eje10_3, eje10_4, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);
        eje10_1=(Button) findViewById(R.id.btnE1);
        eje10_2=(Button) findViewById(R.id.btnE2);
        eje10_3=(Button) findViewById(R.id.btnE3);
        eje10_4=(Button) findViewById(R.id.btnE4);
        salir=(Button) findViewById(R.id.btnSalir10);

        eje10_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio10.this, Ejercicio10_1.class);
                startActivity(ejer);
            }
        });
        eje10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio10.this, Ejercicio10_2.class);
                startActivity(ejer);
            }
        });
        eje10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio10.this, Ejercicio10_3.class);
                startActivity(ejer);
            }
        });
        eje10_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio10.this, Ejercicio10_4.class);
                startActivity(ejer);
            }
        });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio10.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
}