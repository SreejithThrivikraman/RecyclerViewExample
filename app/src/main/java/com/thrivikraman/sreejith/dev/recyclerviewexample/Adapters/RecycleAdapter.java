package com.thrivikraman.sreejith.dev.recyclerviewexample.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thrivikraman.sreejith.dev.recyclerviewexample.R;

import java.util.ArrayList;
import java.util.Arrays;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.LocationViewHolder>  {


    private ArrayList<String> locationName = new ArrayList<>();
    private ArrayList<String> imageName = new ArrayList<>();
    private Context mContext;

    public RecycleAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> locationNames)
    {
        locationName = locationNames;
        mContext = context;

    }


    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);
        LocationViewHolder viewHolder = new LocationViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder locationViewHolder, int position) {

        locationViewHolder.LocationName.setText(locationName.get(position));

    }

    @Override
    public int getItemCount() {
        return imageName.size();
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder
    {
        public TextView LocationName;
        public ImageView LocationImage;
        public ConstraintLayout parentLayout;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);

            LocationName = itemView.findViewById(R.id.image);
            LocationImage = itemView.findViewById(R.id.locationtitle);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}
