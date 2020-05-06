package com.thrivikraman.sreejith.dev.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.thrivikraman.sreejith.dev.recyclerviewexample.Adapters.RecycleAdapter;
import com.thrivikraman.sreejith.dev.recyclerviewexample.Interfaces.RecyclerViewItemClick;
import com.thrivikraman.sreejith.dev.recyclerviewexample.Sample_Data_Model.contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewItemClick{

    RecyclerView R_List;
    List<String> image_list = new ArrayList<>();

    public ArrayList<contacts> contact;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create global configuration and initialize ImageLoader with this config

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(config);


        R_List = findViewById(R.id.recycle_list);

        R_List.setHasFixedSize(true);



        // loading image resources
        image_list = Arrays.asList(getResources().getStringArray(R.array.image_uri_list));
        contact = contacts.createContactList(10,image_list);

        RecycleAdapter recycleAdapter = new RecycleAdapter(contact,this);
        R_List.setAdapter(recycleAdapter);
        R_List.setLayoutManager(new LinearLayoutManager(this));



    }


    @Override
    public void onClick(int position) {
        Toast.makeText(this, image_list.get(position),Toast.LENGTH_SHORT).show();

    }
}
