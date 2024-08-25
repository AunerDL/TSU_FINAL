package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Ejercicio17 extends AppCompatActivity {

    Button salir;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17);
        MyPageAdapter adapter = new MyPageAdapter();
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
//---starts with the second page---
        viewPager.setCurrentItem(1);

        salir=(Button) findViewById(R.id.btnSalir17);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio17.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    public void onClick(View view) {
        int buttonTag = Integer.valueOf(view.getTag().toString());
        Toast.makeText(this, "Button " + Integer.toString(buttonTag)+
                " clicked", Toast.LENGTH_LONG).show();
    }

}