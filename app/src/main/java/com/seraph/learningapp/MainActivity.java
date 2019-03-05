package com.seraph.learningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> restaurants = new ArrayList<>();
        restaurants.add("Carambola");

        ListView list = findViewById(R.id.list);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this,R.layout.list_item_layout, restaurants);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int u, long l) {
                if (u == 0) {
                    Intent myintent1 = new Intent(view.getContext(), Carambola.class);
                    startActivityForResult(myintent1, 0);
                }
            }
        });

    }
}
