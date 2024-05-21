package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Bind layout
        setContentView(R.layout.facebook);

        //Bind view (element in HTML)
        Button signInBtn = (Button) findViewById(R.id.signInBtn);

        //Set event on click for button
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.onSignIn(v);
            }
        });
    }

    public void onSignIn(View v) {
        String rightPassword = "123456";
        String username = "admin";

        //Get EditText content
        EditText passwordInputField = (EditText) findViewById(R.id.password);
        String inputtedPassword = (String) passwordInputField.getText().toString();

        //Business logic
        if (rightPassword.equals(inputtedPassword)) {
            Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }
    
}