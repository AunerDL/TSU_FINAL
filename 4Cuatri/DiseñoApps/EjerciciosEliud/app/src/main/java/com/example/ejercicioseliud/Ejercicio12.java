package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Ejercicio12 extends AppCompatActivity {

    Button salir;
    int count = 1;
    FrameLayout frame;
    ImageView imageview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio12);
        frame = (FrameLayout) findViewById(R.id.framelayout);

        salir=(Button) findViewById(R.id.btnSalir12);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio12.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    public void btnClick(View view) {
//---hide the current one---
        imageview = (ImageView) frame.findViewWithTag(String.valueOf(count));
        imageview.setVisibility(android.view.View.INVISIBLE);
//---go to the next image---
        count++;
        if (count>3) count = 1;
//---show the next image---
        imageview = (ImageView) frame.findViewWithTag(String.valueOf(count));
        imageview.setVisibility(android.view.View.VISIBLE);
    }
}