package com.example.sw21;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class Visability {
    static boolean  passvisible = true;

    public static void visability(EditText editText) {


        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                final int Right = 2;
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= editText.getRight() - editText.getCompoundDrawables()[Right].getBounds().width()) {
                        int selection = editText.getSelectionEnd();
                        if (passvisible) {
                            //set drawable image here
                            editText.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.baseline_visibility_off_24, 0);
                            //for hid pass
                            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passvisible = false;


                        } else {
                            //set drawable image here|
                            editText.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.baseline_visibility_24, 0);

                            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passvisible = true;
                        }
                        editText.setSelection(selection);


                    }
                }
                return false;
            }
        });
    }

}