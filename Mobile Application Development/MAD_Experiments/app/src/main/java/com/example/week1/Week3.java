package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Week3 extends AppCompatActivity {

    EditText etName, etPassword, etPhone;
    RadioButton rbMale, rbFemale;
    CheckBox cbJava, cbPython, cbMeanstack;
    Spinner spcities;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        etPhone = findViewById(R.id.etPhone);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        cbJava = findViewById(R.id.cbJava);
        cbPython = findViewById(R.id.cbPython);
        cbMeanstack = findViewById(R.id.cbMeanstack);
        spcities = findViewById(R.id.spcities);
        btnSubmit = findViewById(R.id.butn);

        // Set the button click listener
        btnSubmit.setOnClickListener(this::getValue);
    }

    public void getValue(View v) {
        String name = etName.getText().toString();
        String password = etPassword.getText().toString();
        String phone = etPhone.getText().toString();

        // Get gender
        String gender = "";
        if (rbMale.isChecked()) {
            gender = rbMale.getText().toString();
        } else if (rbFemale.isChecked()) {
            gender = rbFemale.getText().toString();
        }

        // Get interests
        String interest = "";
        if (cbJava.isChecked()) {
            interest += cbJava.getText().toString() + " ";
        }
        if (cbPython.isChecked()) {
            interest += cbPython.getText().toString() + " ";
        }
        if (cbMeanstack.isChecked()) {
            interest += cbMeanstack.getText().toString();
        }

        // Get selected city
        String city = spcities.getSelectedItem().toString();

        // Create the final result string
        String result = name + "\n" + password + "\n" + phone + "\n" + gender + "\n" + interest + "\n" + city;

        // Show a toast message
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}
