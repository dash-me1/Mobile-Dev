package com.example.listener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button  btn =findViewById(R.id.btnid);

        TextView txt = findViewById(R.id.textid);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText("Hello Android studio");
            }
        });
    }
}