package com.dk.fragmentexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_example);

        Button btShow = findViewById(R.id.btShow);

        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogExampleActivity.this);
                builder.setTitle("Confirm");
                builder.setMessage("Do you wan to exit this app?");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogExampleActivity.this,"Ok Clicked",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogExampleActivity.this,"Cancel Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                builder.create().show();

            }
        });
    }
}