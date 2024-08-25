package com.uttt.recybeview;

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

        init();

    }
    public void init(){
        elements=new ArrayList<>();
        elements.add(new ListElement("#775447","Alan","Mexico","Activo"));
        elements.add(new ListElement("#775447","Uriel","Mexico","Activo"));
        elements.add(new ListElement("#775447","Damian","Mexico","Activo"));
        elements.add(new ListElement("#775447","Garcia","Mexico","Activo"));
        elements.add(new ListElement("#775447","YO","Mexico","Activo"));

        ListAdaptador listAdaptador=new ListAdaptador(elements,this);
        RecyclerView recyclerView= findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdaptador);
    }
}