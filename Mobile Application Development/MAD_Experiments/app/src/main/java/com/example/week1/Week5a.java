package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.week1.R;

public class Week5a extends AppCompatActivity {

    EditText etName, etAddress, etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5a);

        // Initialize EditText fields
        etName = findViewById(R.id.etName);
        etAddress = findViewById(R.id.etAdd);
        etPhone = findViewById(R.id.etPhn);
    }

    public void Send(View view) {
        // Create Student object
        Student student = new Student();
        student.name = etName.getText().toString();
        student.address = etAddress.getText().toString();
        student.phone = etPhone.getText().toString(); // Fixed "tostring()" to "toString()"

        // Create Intent
        Intent intent = new Intent(Week5a.this, Week5b.class);
        intent.putExtra("KEY", student); // Pass Student object

        // Start new activity
        startActivity(intent);
    }
}
