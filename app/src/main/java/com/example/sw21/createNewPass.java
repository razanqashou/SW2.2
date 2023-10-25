package com.example.sw21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class createNewPass extends AppCompatActivity {
EditText newpass,confirmNewpass;
boolean  passvisible;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_pass);

        newpass=findViewById(R.id.passwordForgot);
        confirmNewpass=findViewById(R.id.confirmPassForgot);
        visability ();
    }

    public void visability () {

        newpass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                final int Right = 2;
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= newpass.getRight() - newpass.getCompoundDrawables()[Right].getBounds().width()) {
                        int selection = newpass.getSelectionEnd();
                        if (passvisible) {
                            //set drawable image here
                           newpass.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.baseline_visibility_off_24, 0);
                            //for hid pass
                           newpass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passvisible = false;


                        } else {
                            //set drawable image here|
                           newpass.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.baseline_visibility_24, 0);

                           newpass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passvisible = true;
                        }
                       newpass.setSelection(selection);

                    }
                }
                return false;
            }

        });

       confirmNewpass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                final int Right = 2;
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= confirmNewpass.getRight() - confirmNewpass.getCompoundDrawables()[Right].getBounds().width()) {
                        int selection = confirmNewpass.getSelectionEnd();
                        if (passvisible) {
                            //set drawable image here
                           confirmNewpass.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.baseline_visibility_off_24, 0);
                            //for hid pass
                          confirmNewpass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passvisible = false;


                        } else {
                            //set drawable image here|
                            confirmNewpass.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.baseline_visibility_24, 0);

                            confirmNewpass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passvisible = true;
                        }
                       confirmNewpass.setSelection(selection);

                    }
                }
                return false;
            }

        });


    }

}