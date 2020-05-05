package com.thrivikraman.sreejith.dev.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.thrivikraman.sreejith.dev.recyclerviewexample.Adapters.RecycleAdapter;
import com.thrivikraman.sreejith.dev.recyclerviewexample.Sample_Data_Model.contacts;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView R_List;


    public ArrayList<contacts> contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        R_List = findViewById(R.id.recycle_list);

        R_List.setHasFixedSize(true);

        contact = contacts.createContactList(10);
        

        RecycleAdapter recycleAdapter = new RecycleAdapter(contact);
        R_List.setAdapter(recycleAdapter);
        R_List.setLayoutManager(new LinearLayoutManager(this));

    }


}
