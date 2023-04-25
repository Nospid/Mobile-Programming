package com.dk.registerform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);


        Button btRegister = findViewById(R.id.btRegister);

        EditText etName = findViewById(R.id.etName);
        EditText etAddress = findViewById(R.id.etAddress);
        EditText etPassword = findViewById(R.id.etPassword);
        EditText etEmail = findViewById(R.id.etEmail);
        RadioGroup rgGender = findViewById(R.id.rgGender);
        RadioButton rbMale = findViewById(R.id.rbMale);
        RadioButton rbFemale = findViewById(R.id.rbFemale);

         btRegister.setOnClickListener(new View.OnClickListener()
         {
             @Override
             public void onClick(View view) {

                 Intent i = new Intent(InputActivity.this, ShowActivity.class);
                 i.putExtra("NAME", etName.getText().toString());
                 i.putExtra("ADDRESS", etAddress.getText().toString());
                 i.putExtra("EMAIL", etEmail.getText().toString());
                 i.putExtra("PASSWORD", etPassword.getText().toString());

                 int selectedGenderId = rgGender.getCheckedRadioButtonId();
                 if (selectedGenderId == R.id.rbMale) {
                     String gender = "Male";
                     i.putExtra("GENDER", gender);
                 } else if (selectedGenderId == R.id.rbFemale) {
                     String gender = "Female";
                     i.putExtra("GENDER", gender);
                 }
                 startActivity(i);
             }
         });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.setting){
            Toast.makeText(this,"Setting Clicked",Toast.LENGTH_SHORT).show();

        }else if (item.getItemId() == R.id.logout){
            Toast.makeText(this,"Logout Clicked",Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}