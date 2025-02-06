package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        Button btn = findViewById(R.id.btnid);
//        TextView txt = findViewById(R.id.textid);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count++;
//                txt.setText(""+count);
//
//            }
//        });




//        RelativeLayout rel = findViewById(R.id.rel);
//        RadioGroup radioGroup = findViewById(R.id.rgroup);
//        TextView txt = findViewById(R.id.radioButton4);
//
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radioButton4) {
//                    rel.setBackgroundColor(Color.RED);
//                    txt.setTextColor(Color.WHITE);
//                }
//            }
//        });


        CheckBox check1 = findViewById(R.id.checkBox);
        CheckBox check2 = findViewById(R.id.checkBox2);
        CheckBox check3 = findViewById(R.id.checkBox3);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Selected = "Selected Fruits :";

                if (check1.isChecked()){
                    Selected+="Apple ";
                }
                if (check2.isChecked())
                    Selected+= "Banana ";
                if (check3.isChecked())
                    Selected+= "Orange ";
                if(Selected.equals("Selected Fruits :"))
                    Selected+="You dont like any fruits";

                Toast.makeText(getApplicationContext(),Selected,Toast.LENGTH_SHORT).show();
            }

        });
       }
}