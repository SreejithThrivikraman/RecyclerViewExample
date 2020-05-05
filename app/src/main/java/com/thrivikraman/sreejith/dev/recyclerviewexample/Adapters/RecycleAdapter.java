package com.thrivikraman.sreejith.dev.recyclerviewexample.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thrivikraman.sreejith.dev.recyclerviewexample.R;
import com.thrivikraman.sreejith.dev.recyclerviewexample.Sample_Data_Model.contacts;
import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.LocationViewHolder>  {


    private List<contacts> mContacts;

    // Pass in the contact array into the constructor
    public RecycleAdapter(List<contacts> contacts) {
        mContacts = contacts;
    }



    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.itemlayout,parent,false);

        LocationViewHolder viewHolder = new LocationViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.LocationViewHolder viewHolder, int position) {


        contacts cont = mContacts.get(position);
        TextView locationName =  viewHolder.LocationName;
        locationName.setText(cont.getName());

    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder
    {
        public TextView LocationName;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);

            LocationName = itemView.findViewById(R.id.locationtitle);

        }
    }
}
