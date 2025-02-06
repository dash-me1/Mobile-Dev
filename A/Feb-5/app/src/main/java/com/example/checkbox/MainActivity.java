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

        CheckBox check1 = findViewById(R.id.checkBox1);
        CheckBox check2 = findViewById(R.id.checkBox2);
        CheckBox check3 = findViewById(R.id.checkBox3);
        Button btn = findViewById(R.id.button10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Checked = "Your Fruits are :";
                if(check1.isChecked()){
                    Checked+="Apple ";
                }
                if(check2.isChecked()){
                    Checked+="Mango ";
                }
                if(check3.isChecked()){
                    Checked+="Banana";
                }
                if(Checked.equals("Your Fruits are :")){
                    Checked="You don't like these fruits";
                }

                Toast.makeText(getApplicationContext(),Checked,Toast.LENGTH_SHORT).show();

            }
        });

    }
}