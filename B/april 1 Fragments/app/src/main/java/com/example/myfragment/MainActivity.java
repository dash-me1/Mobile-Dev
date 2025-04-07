package com.example.myfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);
        LinearLayout linearLayout = findViewById(R.id.frag);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputFragment inputFragment = new InputFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frag,inputFragment);
                fragmentTransaction.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OutputFragment outputFragment = new OutputFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frag,outputFragment);
                fragmentTransaction.commit();
            }
        });




         }
}