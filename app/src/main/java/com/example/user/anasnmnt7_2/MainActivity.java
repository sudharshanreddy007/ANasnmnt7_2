package com.example.user.anasnmnt7_2;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private static final int PICK_CONTACT=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        //Intent is an abstract description of an operation to be performed
        //Pick an item from the data, returning what was selected.
        //Constants for the contacts table, which contains a record per aggregate of raw contacts representing the same person.
        //CONTENT_URI:The content:// style URI for this table
        startActivityForResult(i,PICK_CONTACT);
        //By the help of android startActivityForResult() method, we can get result from another activity.
    }
}
