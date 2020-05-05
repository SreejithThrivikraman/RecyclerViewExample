package com.thrivikraman.sreejith.dev.recyclerviewexample.Sample_Data_Model;

import java.util.ArrayList;

public class contacts {

    private String mName;
    private String mPhone;

    public contacts(String Name, String Phone) {
        this.mName = Name;
        this.mPhone = Phone;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhone()
    {
        return mPhone;
    }

    public static ArrayList<contacts> createContactList(int numContacts)
    {
        ArrayList<contacts> contactNames = new ArrayList<>();

        for (int i =1; i <= numContacts; i++ )
        {
            contactNames.add(new contacts("Person " + i, "Number " +i+i+i+i));
        }

        return contactNames;
    }
}
