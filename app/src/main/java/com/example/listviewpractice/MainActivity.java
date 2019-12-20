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

        ContactList = new ArrayList<Contact>();
        ContactList.add(new Contact("Sumaiya Rashid","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Asad Jawaid","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Maram Sharfuddin","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Baber Akram","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Faiza Baber","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Komal Anees","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Moiz Baig","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Wahaj Baig","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Tasneem Zaki","+923332849115",R.drawable.screenshot));
        ContactList.add(new Contact("Tooba Zafar","+923332849115",R.drawable.screenshot));

        CustomAdapter adapter = new CustomAdapter(this, ContactList);
        list.setAdapter(adapter);
    }
}
