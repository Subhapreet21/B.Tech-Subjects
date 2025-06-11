package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Week4b extends AppCompatActivity {

    TextView tvDOB2, tvDegree2, tvName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4b); // Corrected layout reference

        // Initialize TextView elements
        tvName2 = findViewById(R.id.tvName2);
        tvDOB2 = findViewById(R.id.tvDob2);
        tvDegree2 = findViewById(R.id.tvDegree2);

        // Get data from Intent
        Intent getData = getIntent();
        if (getData.getExtras() != null) {  // Check for null to prevent crashes
            String receivename = getData.getStringExtra("keyname"); // Corrected key retrieval
            String receivedate = getData.getStringExtra("keydate");
            String receivedegree = getData.getStringExtra("keyDegree");

            // Set the received data to TextViews
            tvDOB2.setText(receivedate);
            tvDegree2.setText(receivedegree);
            tvName2.setText(receivename);
        }
    }
}
