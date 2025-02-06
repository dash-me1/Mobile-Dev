package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by ID
        rel = findViewById(R.id.rel);
        RadioGroup radioGroup = findViewById(R.id.rgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButton) {
                    rel.setBackgroundColor(Color.RED); // Red
                } else if (checkedId == R.id.radioButton2) {
                    rel.setBackgroundColor(Color.BLUE); // Blue
                } else if (checkedId == R.id.radioButton3) {
                    rel.setBackgroundColor(Color.GREEN); // Green
                } else if (checkedId == R.id.radioButton4) {
                    rel.setBackgroundColor(Color.WHITE); // White
                }
            }
        });
    }
}
