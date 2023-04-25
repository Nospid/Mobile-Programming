package com.dk.registerform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btMenu = findViewById(R.id.btMenu);

        Button btShow = findViewById(R.id.btItem);

        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popupMenu = new PopupMenu(DetailActivity.this,btShow);
                popupMenu.inflate(R.menu.pop_up_menu);

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if (menuItem.getItemId() == R.id.option_1){
                            Toast.makeText(DetailActivity.this,"Copy is selected",Toast.LENGTH_SHORT).show();
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });



        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });


        Log.v("DILIP","onCreate Called");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("DILIP","onStart Called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.v("DILIP","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("DILIP","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("DILIP","onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("DILIP","onDestroy Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("DILIP","onRestart Called");
    }
}