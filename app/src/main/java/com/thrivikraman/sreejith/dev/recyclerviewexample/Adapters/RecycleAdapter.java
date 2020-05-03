package com.thrivikraman.sreejith.dev.recyclerviewexample.Adapters;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thrivikraman.sreejith.dev.recyclerviewexample.R;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.LocationViewHolder>  {

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder locationViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
