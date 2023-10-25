package com.example.sw21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Loginpage extends AppCompatActivity {
EditText username,password;
TextView newaccount,forgotpass;
boolean passvisible;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        username=findViewById(R.id.usereditbox);
        password=findViewById(R.id.passeditbox);
        newaccount=findViewById(R.id.createnewaccount);
        forgotpass=findViewById(R.id.forgetPassword);
        Visability.visability(password);


       newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsingup=new Intent(Loginpage.this,signuppage.class);
                startActivity(intentsingup);

            }
        });

       forgotpass.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent forgot=new Intent(Loginpage.this,Forgotpasswordpage.class);
               startActivity(forgot);
           }
       });
           }


    }
