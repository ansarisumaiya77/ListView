package com.example.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contact> {

    public CustomAdapter(@NonNull Context context, ArrayList<Contact> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listView = convertView;
        if (listView == null)
        {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.resouce_file, parent,false);
        }
        Contact contact = getItem(position);
        TextView nameView = (TextView) listView.findViewById(R.id.name);
        nameView.setText(contact.getName());
        TextView numberView = (TextView) listView.findViewById(R.id.number);
        numberView.setText(contact.getNumber());
        ImageView imageView = (ImageView) listView.findViewById(R.id.img);
        imageView.setImageResource(contact.getImage());
        return listView;
    }
}
