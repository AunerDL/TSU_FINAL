package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class Ejercicio9 extends AppCompatActivity {

    Button salir;

    DatePicker datePicker;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        salir=(Button) findViewById(R.id.btnSalir9);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio9.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    public void btnClick(View view) {
        Toast.makeText(getBaseContext(),
                "Date selected:" + (datePicker.getMonth() + 1) +
                        "/" + datePicker.getDayOfMonth() +
                        "/" + datePicker.getYear(),
                Toast.LENGTH_SHORT).show();
    }
}