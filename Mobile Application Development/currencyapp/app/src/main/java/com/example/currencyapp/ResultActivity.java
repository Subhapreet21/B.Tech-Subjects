package com.example.currencyapp;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultText = findViewById(R.id.result_text);
        String convertedAmount = getIntent().getStringExtra("converted_amount");
        resultText.setText(convertedAmount);

        // Apply dynamic styling programmatically (if needed)
        GradientDrawable background = new GradientDrawable();
        background.setCornerRadius(25f);
        background.setColor(getResources().getColor(android.R.color.darker_gray));
        resultText.setBackground(background);
    }
}