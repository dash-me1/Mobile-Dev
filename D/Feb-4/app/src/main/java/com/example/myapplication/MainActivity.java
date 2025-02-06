package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.rel);
        RadioGroup radioGroup = findViewById(R.id.radiogrp);
        TextView txt = findViewById(R.id.radioButton4);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId==R.id.radioButton2){
                    relativeLayout.setBackgroundColor(Color.YELLOW);
                } else if (checkedId == R.id.radioButton3) {
                    relativeLayout.setBackgroundColor(Color.RED);

                }
                else{
                    relativeLayout.setBackgroundColor(Color.BLUE);
                    txt.setTextColor(Color.WHITE);
                }
            }
        });



       }
}