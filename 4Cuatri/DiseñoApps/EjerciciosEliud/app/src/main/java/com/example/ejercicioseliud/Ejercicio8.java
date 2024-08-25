package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;
public class Ejercicio8 extends AppCompatActivity {

    Button salir;

    TimePicker timePicker;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);

        salir=(Button) findViewById(R.id.btnSalir8);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio8.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    public void btnClick(View view) {
        NumberFormat formatter = new DecimalFormat("00");
        Toast.makeText(getBaseContext(),
                "Time selected:" +timePicker.getCurrentHour() +
                        ":" + formatter.format(timePicker.getCurrentMinute()),
                Toast.LENGTH_SHORT).show();
    }
}