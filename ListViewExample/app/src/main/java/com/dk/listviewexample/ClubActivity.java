package com.dk.listviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);


        List<Club> clubList = new ArrayList<>();

        clubList.add(new Club("Lime n Lemon","Rock","Bharatpur",0));
        clubList.add(new Club("LOD","Dance","KTM",1000));
        clubList.add(new Club("Club16","Dance","PKR",500));

//        Club cl1 = new Club();
//        cl1.setName("Catwalk");
//        cl1.setAddress("Pokhara");
//        cl1.setType("Dance");
//        cl1.setEntryFree(1000);
//
//        clubList.add(cl1);


        RecyclerView rvList = findViewById(R.id.rvClubs);
        ClubRecyclerAdapter adapter = new ClubRecyclerAdapter(this,clubList);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        rvList.setAdapter(adapter);

    }
}




















//1. Create an app that shows list of night club in Pokhara which includes club name, club type, club address
//and club photo.
//Also create a club detail activity which will show the tonights event detail along with club detail when
//clicked on any club items in the list






