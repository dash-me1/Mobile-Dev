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

        RadioGroup radioGroup = findViewById(R.id.rgroup);

        RelativeLayout relativeLayout = findViewById(R.id.rel);

        TextView txt = findViewById(R.id.radioButton3);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton3){
                    relativeLayout.setBackgroundColor(Color.BLUE);
                    txt.setTextColor(Color.WHITE);

                } else if (checkedId == R.id.radioButton4) {
                    relativeLayout.setBackgroundColor(Color.RED);

                } else if (checkedId == R.id.radioButton5) {
                    relativeLayout.setBackgroundColor(Color.YELLOW);

                }

                else {
                    relativeLayout.setBackgroundColor(Color.WHITE);
                }
            }
        });
    }
}