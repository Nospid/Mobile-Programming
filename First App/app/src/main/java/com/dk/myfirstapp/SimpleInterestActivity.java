package com.dk.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class  SimpleInterestActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_simple_interest);

        Button btCalculate = findViewById(R.id.btShow);

        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });


    }
    private void showDialog(){
        AlertDialog.Builder builder =new  AlertDialog.Builder(SimpleInterestActivity.this);

        View view = getLayoutInflater().inflate(R.layout.activity_simple_interest,null);

        builder.setView(view);
        builder.create().show();


        EditText etPrinciple = view.findViewById(R.id.etp);
        EditText etRate = view.findViewById(R.id.etr);
        EditText etTime = view.findViewById(R.id.ett);

        Button btCalculate = view.findViewById(R.id.btcalculate);
        TextView tvcalculate = view.findViewById(R.id.tvcalculate);


        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String principleText = etPrinciple.getText().toString();
                String rateText = etRate.getText().toString();
                String timeText=etTime.getText().toString();

                int calculate = (Integer.parseInt(principleText) * Integer.parseInt(rateText) * Integer.parseInt(timeText))/100;
                tvcalculate.setText("Simple Interset is :" +calculate);
            }
        });


    }

}

