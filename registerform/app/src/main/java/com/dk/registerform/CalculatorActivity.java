package com.dk.registerform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    Button btcalculate;

    EditText number1 ,number2 ;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


         btcalculate = findViewById(R.id.btcalculate);
         number1 = findViewById(R.id.etfirstnumber);
         number2 = findViewById(R.id.etsecondnumber);
         tvresult = findViewById(R.id.tvresult);



        btcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
     registerForContextMenu(btcalculate);



            }
        });


    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calculator_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        int  n = Integer.parseInt(number1.getText().toString());
        int n1 = Integer.parseInt(number2.getText().toString());


        if(item.getItemId()==R.id.sum){

            int sum=n+n1;

            tvresult.setText("Sum is :"+sum);

        } else if (item.getItemId()==R.id.subtract) {
            int diff=n-n1;
            tvresult.setText("Difference is :"+diff);


        }else if(item.getItemId()==R.id.multiply){
            int product=n*n1;
            tvresult.setText("Product is :"+product);

        }


        return super.onContextItemSelected(item);
    }

}