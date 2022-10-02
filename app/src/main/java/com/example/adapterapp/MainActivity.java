package com.example.adapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<NumberView> mainActivity = new ArrayList<NumberView>();
        mainActivity.add(new NumberView(R.raw.aa,"1","one"));
        mainActivity.add(new NumberView(R.raw.aa,"2","two"));
        mainActivity.add(new NumberView(R.raw.aa,"3","three"));
        mainActivity.add(new NumberView(R.raw.aa,"4","four"));
        mainActivity.add(new NumberView(R.raw.aa,"5","five"));
        mainActivity.add(new NumberView(R.raw.aa,"6","six"));
        mainActivity.add(new NumberView(R.raw.aa,"7","seven"));
        mainActivity.add(new NumberView(R.raw.aa,"8","eight"));
        mainActivity.add(new NumberView(R.raw.aa,"9","nine"));
        mainActivity.add(new NumberView(R.raw.aa,"10","ten"));
        mainActivity.add(new NumberView(R.raw.aa,"11","eleven"));
        mainActivity.add(new NumberView(R.raw.aa,"12","twelve"));
        mainActivity.add(new NumberView(R.raw.aa,"13","thirteen"));

        NumbersViewAdapter numArray = new NumbersViewAdapter(this, mainActivity);
        ListView numbersListView = findViewById(R.id.list_item);

        numbersListView.setAdapter(numArray);

    }
}