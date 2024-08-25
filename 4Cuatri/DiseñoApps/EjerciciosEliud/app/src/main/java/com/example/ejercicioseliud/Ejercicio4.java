package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Ejercicio4 extends AppCompatActivity {

    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        //---CheckBox---
        CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);
        checkBox.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    Toast.makeText(getBaseContext(),
                            "CheckBox is checked",
                            Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getBaseContext(),
                            "CheckBox is unchecked",
                            Toast.LENGTH_LONG).show();
            }
        });

        salir=(Button) findViewById(R.id.btnSalir4);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio4.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
}