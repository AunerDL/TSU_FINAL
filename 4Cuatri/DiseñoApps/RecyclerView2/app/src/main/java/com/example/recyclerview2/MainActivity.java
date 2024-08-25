package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //llamado de metodo init
        init();

    }

    public void init(){
        elements=new ArrayList<>();
        //agrgar arreglo
        elements.add(new ListElement("#ff0303" ,"Alan" ,"Tampico" ,"Activo"));
        elements.add(new ListElement("#8400ff" ,"Uriel" ,"Tampico" ,"Inactivo"));
        elements.add(new ListElement("#00fff6" ,"Damian" ,"Tampico" ,"Activo"));
        elements.add(new ListElement("#0028ff" ,"Garcia" ,"Tampico" ,"Activo"));
        elements.add(new ListElement("#00ff28" ,"YO" ,"Tampico" ,"Inactivo"));


        ListAdapter listAdapter =new ListAdapter(elements, this);
        RecyclerView recyclerView=findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }
}