package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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

        Button btn = findViewById(R.id.buttonid);
        CheckBox check1 = findViewById(R.id.checkBox1);
        CheckBox check2 = findViewById(R.id.checkBox2);
        CheckBox check3 = findViewById(R.id.checkBox3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String checked = "Your fruits are :";

                if(check1.isChecked()){
                    checked+= "Orange ";
                }
                if(check2.isChecked()){
                    checked+="Apple ";
                }
                if(check3.isChecked()){
                    checked+="Mango ";
                }
                if(checked.equals("Your fruits are :")){
                    checked= "You don't like fruits";
                }

                Toast.makeText(getApplicationContext(),checked,Toast.LENGTH_SHORT).show();
            }
        });

    }
}