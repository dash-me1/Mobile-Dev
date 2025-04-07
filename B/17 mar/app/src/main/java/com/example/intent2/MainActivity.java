package com.example.intent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText txt = findViewById(R.id.text1);
        Button btn = findViewById(R.id.button1);



       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String data= txt.getText().toString();
               Intent intent = new Intent(MainActivity.this,MainActivity2.class);
               intent.putExtra("textdata",data);
               startActivity(intent);

           }
       });

    }
}