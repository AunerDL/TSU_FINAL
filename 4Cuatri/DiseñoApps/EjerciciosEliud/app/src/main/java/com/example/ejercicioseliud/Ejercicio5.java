package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class Ejercicio5 extends AppCompatActivity {

    Button salir;
    LinearLayout rating;
    CheckBox star;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);
//---get the layout containing the stars---
        rating = (LinearLayout) findViewById(R.id.ratings);
        for (int i = 1; i <= 5; i++) {
            star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);
        }

        salir=(Button) findViewById(R.id.btnSalir5);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio5.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    private OnClickListener starsListener = new OnClickListener() {
        public void onClick(View view) {
//---get the tag of the star selected---
            int tag = Integer.valueOf((String) view.getTag());
//---check all the stars up to the one touched---
            for (int i = 1; i <= tag; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }
//---uncheck all remaining stars---
            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };
}