package com.uttt.listview;

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
    private String nombre []={"Jose","Brian","Trujillo","Guerrero","Saul"};
    private String edades []={"Tiene 20","Tiene 22","Tiene 29","Tiene 21","Tiene 27"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView) findViewById(R.id.txtView);
        lv1=(ListView) findViewById(R.id.LvwLista);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.list_item_geekipedia,nombre);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de "+lv1.getItemAtPosition(i)+"es "+edades[i]+" años");
            }
        });
    }
}