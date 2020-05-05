package com.thrivikraman.sreejith.dev.recyclerviewexample.Sample_Data_Model;



import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contacts {

    private String mName;
    private String mImage;



    public contacts(String Name, String Image) {
        this.mName = Name;
        this.mImage = Image;

    }

    public String getName()
    {
        return mName;
    }

    public String getImage()
    {
        return mImage;
    }

    public static ArrayList<contacts> createContactList(int numContacts, List<String> image_list)
    {
        ArrayList<contacts> contactNames = new ArrayList<>();


        for (int i =0; i < numContacts; i++ )
        {
            contactNames.add(new contacts("Person " + i, image_list.get(i)));
        }

        return contactNames;
    }


}
