package com.example.myapplication;

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
        CheckBox check1 = findViewById(R.id.check1);
        CheckBox  check2 = findViewById(R.id.check2);
        CheckBox check3 = findViewById(R.id.check3);
       Button submitButton = findViewById(R.id.submit);

        // Set onClickListener for the Submit Button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedFruits = "Selected Fruits: ";

                // Check which CheckBoxes are selected
                if (check1.isChecked()) {
                    selectedFruits += "Apple ";
                }
                if (check2.isChecked()) {
                    selectedFruits += "Orange ";
                }
                if (check3.isChecked()) {
                    selectedFruits += "Mango ";
                }

                // If no fruit is selected, show a different message
                if (selectedFruits.equals("Selected Fruits: ")) {
                    selectedFruits = "No fruits selected.";
                }

                // Show the selected fruits in a Toast message
                Toast.makeText(getApplicationContext(), selectedFruits, Toast.LENGTH_SHORT).show();
            }
        });

    }
}