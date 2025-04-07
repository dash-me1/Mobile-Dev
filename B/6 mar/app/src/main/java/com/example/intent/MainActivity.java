package com.example.intent;

import static com.example.intent.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
        EditText text1 = findViewById(R.id.data1);
        TextView txt = findViewById(R.id.first);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = text1.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                startActivity(intent);
            }
        });


    }
}