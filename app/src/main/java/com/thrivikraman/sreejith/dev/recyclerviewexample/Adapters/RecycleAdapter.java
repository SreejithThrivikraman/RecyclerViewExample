package com.thrivikraman.sreejith.dev.recyclerviewexample.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.thrivikraman.sreejith.dev.recyclerviewexample.GlobalApplication;
import com.thrivikraman.sreejith.dev.recyclerviewexample.Interfaces.RecyclerViewItemClick;
import com.thrivikraman.sreejith.dev.recyclerviewexample.R;
import com.thrivikraman.sreejith.dev.recyclerviewexample.Sample_Data_Model.contacts;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.LocationViewHolder>  {


    private List<contacts> mContacts;
    private static RecyclerViewItemClick mItemClick;

    // Get the global application context.
    Context context = GlobalApplication.getAppContext();

    // Pass in the contact array into the constructor
    public RecycleAdapter(List<contacts> contacts, RecyclerViewItemClick itemClick) {
        mContacts = contacts;
        this.mItemClick = itemClick;
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
        ImageView contact_image = viewHolder.ContImage;

        locationName.setText(cont.getName());


        // Image loader - Universal image loader configuration
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context).build();
        ImageLoader.getInstance().init(config);

        // load image.
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(cont.getImage(), contact_image);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder
    {
        public TextView LocationName;
        public ImageView ContImage;

        public LocationViewHolder(@NonNull View itemView) {
            super(itemView);

            LocationName = itemView.findViewById(R.id.locationtitle);
            ContImage = itemView.findViewById(R.id.locimage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mItemClick.onClick(getAdapterPosition());
                }
            });


        }


    }
}
