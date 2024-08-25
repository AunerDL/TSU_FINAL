package com.example.ejercicioseliud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
public class Ejercicio3 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        Button salir;

//---RadioButton---
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
                if (rb1.isChecked()) {
                    Toast.makeText(getBaseContext(),
                            "Opcion 1 checada!",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getBaseContext(),
                            "Opcion 2 checada!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        salir=(Button) findViewById(R.id.btnSalir3);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio3.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
}