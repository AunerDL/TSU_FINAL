package com.example.ejercicioseliud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;
public class Ejercicio1 extends Activity {

    Button salir;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
//---Button view---
        Button btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "boton 3 fue precionado!",
                        Toast.LENGTH_SHORT).show();
            }
        });
//---the two buttons are wired to the same event handler---
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(btnListener);
        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(btnListener);

        salir=(Button) findViewById(R.id.btnSalir1);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio1.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }


    //---create an anonymous class to act as a button click listener---
    private OnClickListener btnListener = new OnClickListener() {
        public void onClick(View view)
        {
            Toast.makeText(getBaseContext(),
                    ((Button) view).getText() + " fue precionado!",
                    Toast.LENGTH_LONG).show();
        }
    };
    public void onClick(View view) {
        Button btn = (Button) view;
        Toast.makeText(this, btn.getText() + " fue precionado!",
                Toast.LENGTH_SHORT).show();
    }
    public void onToggle(View view) {
        ToggleButton btn = (ToggleButton) view;
        Toast.makeText(this, "Modo Toggle: " + btn.isChecked(),
                Toast.LENGTH_SHORT).show();
    }
}