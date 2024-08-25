package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    //Vectores lista de nombres
    private String nombres [] = {"Tmamo","Yukko","Sandy","Angel","Jorelin",
            "Luis","Zoe","Rick","Sam"};
    //Vector de lista de edades
    private String edades [] = {"20","18","29","35","70","28","45","10","50"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tx1);
        lv1 = (ListView) findViewById(R.id.lv1);

        //mandamos a llamar la lista creada en nuestro arreglo
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, nombres);
        lv1.setAdapter(adapter);

        //muestra mensaje con edad al precionar
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i] + " años");
            }
        });
    }
}