package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Contact> ContactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView);

        ContactList = new ArrayList<>();
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115"));

        CustomAdapter adapter = new CustomAdapter(this, ContactList);
        list.setAdapter(adapter);
    }
}
