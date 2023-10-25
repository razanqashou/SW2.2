package com.example.sw21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signuppage extends AppCompatActivity {

    EditText passwordSingUp, confirmPasswordEditText;
    boolean passvisible;
    Button signUpButton;
    TextView forloginpage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);

        passwordSingUp = findViewById(R.id.passwordSignUp);
        confirmPasswordEditText = findViewById(R.id.confirmPass);

        minnumpass();
        forloginpage = findViewById(R.id.lginLink);

        forloginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsingup = new Intent(signuppage.this, Loginpage.class);
                startActivity(intentsingup);
            }

        });

Visability.visability(passwordSingUp);
Visability.visability(confirmPasswordEditText);


    }
    public void minnumpass() {
       Integer inputText = passwordSingUp.getText().toString().length();
        if (inputText <4) {
            passwordSingUp.setError("4 char minimum!");

        } else {
            passwordSingUp.setError(null);
        }
    }
}
