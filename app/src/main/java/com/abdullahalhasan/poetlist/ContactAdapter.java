package com.abdullahalhasan.poetlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ABDULLAH AL HASAN on 7/17/2016.
 */
public class ContactAdapter extends ArrayAdapter {

    private Contact contact;
    private ArrayList<Contact> contactList;
    private Context context;
    private TextView nameTV;
    private TextView phoneNoTV;



    public ContactAdapter(Context context,ArrayList<Contact> contactList) {
        super(context, R.layout.row_layout,contactList);
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_layout,null);
        nameTV=(TextView) convertView.findViewById(R.id.nameTV);
        phoneNoTV = (TextView) convertView.findViewById(R.id.phoneNoTV);

        nameTV.setText(contactList.get(position).getName());
        phoneNoTV.setText(contactList.get(position).getPhoneNo());

        return convertView;
    }
}
