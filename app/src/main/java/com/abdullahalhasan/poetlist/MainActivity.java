package com.abdullahalhasan.poetlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    EditText nameET;
    EditText phoneNoET;
    Contact contact;
    ContactAdapter adapter;
    ArrayList<Contact> contactList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameET = (EditText) findViewById(R.id.nameET);
        phoneNoET = (EditText) findViewById(R.id.phoneNoET);
        listView = (ListView) findViewById(R.id.list);
        contactList = new ArrayList<>();

    }

    public void addNew(View view) {
        String name = nameET.getText().toString();
        String phoneNo = phoneNoET.getText().toString();

        contact = new Contact(name,phoneNo);
        contactList.add(contact);
        adapter = new ContactAdapter(MainActivity.this,contactList);
        listView.setAdapter(adapter);
        nameET.getText().clear();
        phoneNoET.getText().clear();

    }
}
