package com.dk.registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        EditText etShare = findViewById(R.id.etShare);
        Button btClear = findViewById(R.id.btClear);

        Button btShare = findViewById(R.id.btShare);


        btClear.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                etShare.setText("");
            }
        });


        btShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,etShare.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }
        });

    }


}