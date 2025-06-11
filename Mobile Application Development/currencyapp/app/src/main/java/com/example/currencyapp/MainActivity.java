package com.example.currencyapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    private Spinner fromCurrency, toCurrency;
    private EditText amountInput;
    private JSONObject exchangeRates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fromCurrency = findViewById(R.id.from_currency);
        toCurrency = findViewById(R.id.to_currency);
        amountInput = findViewById(R.id.amount_input);

        new FetchExchangeRates().execute("https://open.er-api.com/v6/latest/USD");
    }

    private class FetchExchangeRates extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(urls[0]).openConnection();
                connection.setRequestMethod("GET");
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) response.append(line);
                reader.close();
                return response.toString();
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(String result) {
            if (result == null) return;
            try {
                exchangeRates = new JSONObject(result).getJSONObject("rates");
                ArrayList<String> currencyList = new ArrayList<>();
                Iterator<String> keys = exchangeRates.keys();
                while (keys.hasNext()) currencyList.add(keys.next());
                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, currencyList);
                fromCurrency.setAdapter(adapter);
                toCurrency.setAdapter(adapter);
            } catch (Exception ignored) {}
        }
    }

    public void convertCurrency(View view) {
        String amountText = amountInput.getText().toString().trim();
        if (amountText.isEmpty()) {
            Toast.makeText(MainActivity.this, "Enter an amount", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double fromRate = exchangeRates.getDouble(fromCurrency.getSelectedItem().toString());
            double toRate = exchangeRates.getDouble(toCurrency.getSelectedItem().toString());
            double amount = Double.parseDouble(amountText);
            double convertedAmount = (amount / fromRate) * toRate;
            String formattedAmount = String.format("%.2f", convertedAmount);

            // Redirect to ResultActivity
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("converted_amount", formattedAmount);
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Conversion Error", Toast.LENGTH_SHORT).show();
        }
    }
}