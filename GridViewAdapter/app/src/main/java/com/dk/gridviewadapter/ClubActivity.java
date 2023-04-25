package com.dk.gridviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubActivity extends AppCompatActivity {

    TextView etClubname,etClubaddress,etClubtype,etClubTonightEvent;
    ImageView image1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);





            String clubname = getIntent().getStringExtra("CLUB_NAME");
            String clubtype = getIntent().getStringExtra("CLUBTYPE");
            String clubaddress = getIntent().getStringExtra("CLUBADDRESS");
            String clubtonightEvent=getIntent().getStringExtra("CLUBTONIGHTEVENT");
            int clubimagesrc=getIntent().getIntExtra("CLUBIMAGE",0);




            etClubname = findViewById(R.id.tvClubname);
            etClubtype = findViewById(R.id.tvClubtype);
            etClubaddress = findViewById(R.id.tvAddress);
            etClubTonightEvent=findViewById(R.id.tvTonightEvents);
            image1 = findViewById(R.id.ivimage);

            etClubname.setText(clubname);
            etClubaddress.setText("Address : "+clubaddress);
            etClubtype.setText(clubtype);
            etClubTonightEvent.setText("Tonight Events : "+clubtonightEvent);

            image1.setImageResource(clubimagesrc);

        }
    }

