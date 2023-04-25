package com.dk.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FramentManagerExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frament_manager_example);


        Button btFirstFragment = findViewById(R.id.btFirstFragment);
        Button btSecondFragment = findViewById(R.id.btSecondFragment);

        btFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment firstFragment = new FirstFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
                fragmentTransaction.commit();

            }
        });


        btSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment secondFragment = new SecondFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer,secondFragment);
                fragmentTransaction.commit();

            }
        });
    }
}