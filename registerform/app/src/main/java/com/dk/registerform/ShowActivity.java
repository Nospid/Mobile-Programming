package com.dk.registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);



        String name = getIntent().getStringExtra("NAME");
      String email = getIntent().getStringExtra("ADDRESS");
      String password = getIntent().getStringExtra("PASSWORD");

      String gender = getIntent().getStringExtra("GENDER");
        String address = getIntent().getStringExtra("ADDRESS");

        TextView txt = findViewById(R.id.tvShowPage);
        txt.setText("Name=" + name + "\n" + "Address=" + address + "\n"+ "Email="+email +"\n"+ "Gender=" + gender);

    }
}