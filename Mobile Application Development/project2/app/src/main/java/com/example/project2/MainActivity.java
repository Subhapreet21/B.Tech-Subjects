package com.example.project2;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Switch stateSwitch;
    TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stateSwitch = findViewById(R.id.stateSwitch);
        statusText = findViewById(R.id.statusText);

        stateSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                statusText.setText("Current State: ON");
            } else {
                statusText.setText("Current State: OFF");
            }
        });
    }
}
