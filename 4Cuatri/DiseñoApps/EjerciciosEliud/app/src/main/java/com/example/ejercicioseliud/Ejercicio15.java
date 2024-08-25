package com.example.ejercicioseliud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Ejercicio15 extends AppCompatActivity {

    Button salir;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio15);
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnCreateContextMenuListener(this);

        salir=(Button) findViewById(R.id.btnSalir15);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio15.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    //---Options Menu---
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main15, menu);
        return true;
    }
    public void onGroupItemClick (MenuItem item) {
        if (item.isChecked()) {
            item.setChecked(false);
        } else {
            item.setChecked(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG).show();
        return true;
    }
    //---Context Menu---
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
                                    ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.activity_main15, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG).show();
        return true;
    }
}