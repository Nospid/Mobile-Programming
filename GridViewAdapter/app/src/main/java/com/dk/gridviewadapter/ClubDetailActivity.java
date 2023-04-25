package com.dk.gridviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ClubDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_detail);


        String[] clubName = {"Gravity Lounge and Bar","KARMA","Prive Nepal","Matrix Arena"};
        String[] clubAddress = {"Lakeside Rd 977","Lakeside","Barani Chowk","Street no.26"};
        String[] clubType = {"Night Bar","Dance CLub","Lonuge and bar","Night Club"};
        String[] clubtonightEvents={"GBob and Yoddha on the Floor to bang the night","DJ santosh performance"," Live Music by 'The Element Band'  from 8pm to 12pm","Glow in the dark party with neon face painting and blacklight drinks from 10pm to 2 pm",};
        int[] clubimages={R.drawable.image,R.drawable.karma,R.drawable.privenepal,R.drawable.matric};

        GridView gvClubList = findViewById(R.id.lvClubs);
        GridAdapter adapter = new GridAdapter(this,clubName,clubType,clubAddress,clubimages);
        gvClubList.setAdapter(adapter);
        gvClubList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ClubDetailActivity.this,ClubActivity.class);
                intent.putExtra("CLUB_NAME",clubName[i]);
                intent.putExtra("CLUBTYPE",clubType[i]);
                intent.putExtra("CLUBADDRESS",clubAddress[i]);
                intent.putExtra("CLUBTONIGHTEVENT",clubtonightEvents[i]);
                intent.putExtra("CLUBIMAGE",clubimages[i]);

                startActivity(intent);
            }
        });
    }
}