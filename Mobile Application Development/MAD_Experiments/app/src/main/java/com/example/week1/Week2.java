package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class Week2 extends AppCompatActivity {
    private TextView textViewName;
    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week2);

        editTextName = findViewById(R.id.editTextName);
        textViewName = findViewById(R.id.textViewName);
    }

    public void SayHello(View view) {
        String name = editTextName.getText().toString().trim();
        textViewName.setText("Hi " + name);
    }
}


