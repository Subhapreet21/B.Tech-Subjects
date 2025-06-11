package com.example.week1; // Change this to your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Week5b extends AppCompatActivity {

    TextView NameReceived, AddressReceived, PhoneReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5b);

        // Initialize TextViews
        NameReceived = findViewById(R.id.tvname2);
        AddressReceived = findViewById(R.id.tv2);
        PhoneReceived = findViewById(R.id.tvP2);

        // Get the Intent and retrieve the Student object
        Intent intent = getIntent();
        Student student2 = (Student) intent.getSerializableExtra("KEY");

        // Set text if student2 is not null to avoid NullPointerException
        if (student2 != null) {
            NameReceived.setText(student2.name);
            AddressReceived.setText(student2.address);
            PhoneReceived.setText(student2.phone);
        }
    }
}
