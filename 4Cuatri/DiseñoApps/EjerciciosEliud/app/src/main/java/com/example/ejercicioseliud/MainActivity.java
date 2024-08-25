package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button eje1, eje2, eje3, eje4, eje5, eje6, eje7, eje8, eje9, eje10;
    Button eje11, eje12, eje13, eje14, eje15, eje16, eje17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eje1=(Button) findViewById(R.id.btnEje1);
        eje2=(Button) findViewById(R.id.btnEje2);
        eje3=(Button) findViewById(R.id.btnEje3);
        eje4=(Button) findViewById(R.id.btnEje4);
        eje5=(Button) findViewById(R.id.btnEje5);
        eje6=(Button) findViewById(R.id.btnEje6);
        eje7=(Button) findViewById(R.id.btnEje7);
        eje8=(Button) findViewById(R.id.btnEje8);
        eje9=(Button) findViewById(R.id.btnEje9);
        eje10=(Button) findViewById(R.id.btnEje10);
        eje11=(Button) findViewById(R.id.btnEje11);
        eje12=(Button) findViewById(R.id.btnEje12);
        eje13=(Button) findViewById(R.id.btnEje13);
        eje14=(Button) findViewById(R.id.btnEje14);
        eje15=(Button) findViewById(R.id.btnEje15);
        eje16=(Button) findViewById(R.id.btnEje16);
        eje17=(Button) findViewById(R.id.btnEje17);


        eje1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio1.class);
                startActivity(ejer);
            }
        });
        eje2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio2.class);
                startActivity(ejer);
            }
        });
        eje3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio3.class);
                startActivity(ejer);
            }
        });
        eje4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio4.class);
                startActivity(ejer);
            }
        });
        eje5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio5.class);
                startActivity(ejer);
            }
        });
        eje6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio6.class);
                startActivity(ejer);
            }
        });
        eje7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio7.class);
                startActivity(ejer);
            }
        });
        eje8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio8.class);
                startActivity(ejer);
            }
        });
        eje9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio9.class);
                startActivity(ejer);
            }
        });
        eje10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio10.class);
                startActivity(ejer);
            }
        });
        eje11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio11.class);
                startActivity(ejer);
            }
        });
        eje12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio12.class);
                startActivity(ejer);
            }
        });
        eje13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio13.class);
                startActivity(ejer);
            }
        });
        eje14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio14.class);
                startActivity(ejer);
            }
        });
        eje15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio15.class);
                startActivity(ejer);
            }
        });
        eje16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio16.class);
                startActivity(ejer);
            }
        });
        eje17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(MainActivity.this, Ejercicio17.class);
                startActivity(ejer);
            }
        });
    }
}