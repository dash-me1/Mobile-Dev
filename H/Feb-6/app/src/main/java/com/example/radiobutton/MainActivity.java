package com.example.radiobutton;

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

   RelativeLayout relative = findViewById(R.id.rel);
        RadioGroup radioGroup = findViewById(R.id.rgroup);
        TextView txt = findViewById(R.id.radioButton2);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton2){
                    relative.setBackgroundColor(Color.BLUE);
                    txt.setTextColor(Color.WHITE);
                } else if (checkedId == R.id.radioButton3) {
                    relative.setBackgroundColor(Color.YELLOW);

                }
                else{
                    relative.setBackgroundColor(Color.WHITE);
                }

            }
        });

    }
}