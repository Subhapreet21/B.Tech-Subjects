package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Week6 extends AppCompatActivity {

    EditText Mobile, Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week6);

        // Initialize EditText fields
        Mobile = findViewById(R.id.etMobile);
        Message = findViewById(R.id.etText);
    }

    public void SendSMS(View view) {
        String MobNum = Mobile.getText().toString();
        String TxtMes = Message.getText().toString();

        if (!MobNum.isEmpty() && !TxtMes.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", MobNum, null));
            intent.putExtra("sms_body", TxtMes);
            startActivity(intent);
        }
    }
}
