package com.dk.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_club);

        EditText etClubName = findViewById(R.id.etClubName);
        EditText etClubType = findViewById(R.id.etClubType);
        EditText etClubAddress = findViewById(R.id.etClubAddress);


        Button btSave = findViewById(R.id.btSave);
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String clubName = etClubName.getText().toString();
                String clubType = etClubType.getText().toString();
                String clubAddress = etClubAddress.getText().toString();

                ClubDBOpenHelper clubDBOpenHelper = new ClubDBOpenHelper(AddClubActivity.this);
                clubDBOpenHelper.insertClubDetail(clubName,clubAddress,clubType);

            }
        });
    }
}