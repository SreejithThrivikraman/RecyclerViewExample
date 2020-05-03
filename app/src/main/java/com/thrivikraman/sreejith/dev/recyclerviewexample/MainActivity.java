package com.thrivikraman.sreejith.dev.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.thrivikraman.sreejith.dev.recyclerviewexample.Adapters.RecycleAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView R_List;

    protected ArrayList<String> locationNames = new ArrayList<>();
    protected ArrayList<String> imageNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        R_List = findViewById(R.id.recycle_list);

        R_List.setHasFixedSize(true);


        // initialize arraylist
        locationNames = new ArrayList<String>(  Arrays.asList(getResources().getStringArray(R.array.locations)));

        RecycleAdapter recycleAdapter = new RecycleAdapter(getApplicationContext(),imageNames,locationNames);
        R_List.setAdapter(recycleAdapter);
        R_List.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }


}
