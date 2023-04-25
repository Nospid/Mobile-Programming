package com.dk.fragmentexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomDialogExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_example);

        Button btSum = findViewById(R.id.btShow);
        btSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }



    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(CustomDialogExampleActivity.this);
        builder.setTitle("Calculator");
        View view = getLayoutInflater().inflate(R.layout.dialog_fragment_example,null);
        builder.setView(view);
        builder.create().show();

        EditText etFirst = view.findViewById(R.id.et1);
        EditText etSecond = view.findViewById(R.id.et2);

        Button btSum = view.findViewById(R.id.btSum);

        TextView tvSum = view.findViewById(R.id.tvSum);


        btSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstText = etFirst.getText().toString();
                String secondText = etSecond.getText().toString();

                int sum = Integer.parseInt(firstText) + Integer.parseInt(secondText);


                tvSum.setText(sum+"");
            }
        });







    }
}