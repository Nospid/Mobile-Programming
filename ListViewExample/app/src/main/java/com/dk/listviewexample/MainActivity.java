package com.dk.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] restaurantList = {"Baishnab","Purano Tandoori","Bhetghat","KFC","Diyalo Food Land","Siraichuli","Wood n Garden","Halal Biryani","Burger House","Kathmandu Bakery","Black Forest","Biryani Moments",
        "Belna","Chiya Durbar","Beer Durbar","GOD","Dsir Cafe","Moda","Khanki","Tandoori Palace","Hotel Breeze","LICT Cafe","Lime & Lemon","Sungava","Jamghat"};

        ListView lvRestaurants = findViewById(R.id.lvRestaurants);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,restaurantList);


        lvRestaurants.setAdapter(adapter);
    }
}