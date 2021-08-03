package com.example.sqliteapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class ListActivity extends AppCompatActivity  {


    public static void open(Context context)
    {
        Intent i = new Intent(context, ListActivity.class);
        context.startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView rv = findViewById(R.id.recyclerView);
        DBHelper helper = new DBHelper(this.getApplicationContext());
        Log.d("TAG GSLKDJF",helper.getUsers().toString());
        rv.setAdapter(new ListAdapter(helper.getUsers()));
        rv.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onStart() {
        super.onStart();
        DBHelper helper = new DBHelper(this.getApplicationContext());

        Log.d("TAG GSLKDJF",helper.getUsers().toString());
    }


}