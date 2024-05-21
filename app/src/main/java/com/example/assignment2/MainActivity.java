package com.example.assignment2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facebook);
        Button signInBtn = (Button) findViewById(R.id.signInBtn);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.onSignIn(v);
            }
        });
    }

    public void onSignIn(View v) {
        EditText userInputField = (EditText) findViewById(R.id.user);
        EditText passwordInputField = (EditText) findViewById(R.id.password);
        String username = (String) userInputField.getText().toString();
        String password = (String) passwordInputField.getText().toString();
        if (username.equals("admin") && password.equals("123456")) {
            Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }
    
}