package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;

public class Week4a extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    EditText editTextName, editDate, editDegree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4a);

        // Initialize EditText fields
        editTextName = findViewById(R.id.etname);
        editDegree = findViewById(R.id.etDegree);
        editDate = findViewById(R.id.etDOB);

        // Set onClickListener for Date Picker
        editDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
    }

    // Show Date Picker Dialog
    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dp = new DatePickerDialog(this, this, year, month, day);
        dp.show();
    }

    // Handle date selection
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        String date = day + "/" + (month + 1) + "/" + year;
        editDate.setText(date);
    }

    // Handle button click to send data to SecondActivity
    public void ViewText(View v) {
        String sendName = editTextName.getText().toString();
        String sendDate = editDate.getText().toString();
        String sendDegree = editDegree.getText().toString();

        Intent sendIntent = new Intent(Week4a.this, Week4b.class);
        sendIntent.putExtra("keyname", sendName);
        sendIntent.putExtra("keydate", sendDate);
        sendIntent.putExtra("keyDegree", sendDegree);

        startActivity(sendIntent);
    }
}
