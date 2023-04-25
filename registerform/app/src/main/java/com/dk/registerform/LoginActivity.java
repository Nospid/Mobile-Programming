package com.dk.registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btLogin = findViewById(R.id.btLogin);

        Button btRegister = findViewById(R.id.btRegister);

        EditText etUsername = findViewById(R.id.etUsername);


        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,HomeActivity.class);
                i.putExtra("NAME",etUsername.getText().toString());
           startActivity(i);
            }
        });





    }
}