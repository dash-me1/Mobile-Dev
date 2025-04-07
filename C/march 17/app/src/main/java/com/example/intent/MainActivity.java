package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        EditText edit = findViewById(R.id.dataInput);
        Button btn = findViewById(R.id.button);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

          String data =  edit.getText().toString();
          Intent intent = new Intent(MainActivity.this,MainActivity2.class);
          intent.putExtra("stringdata",data);
          startActivity(intent);

           }
       });

    }
}