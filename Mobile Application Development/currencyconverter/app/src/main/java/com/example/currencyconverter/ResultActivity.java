package com.example.currencyconverter;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    private LineChart lineChart;
    private RadioGroup timeFilterGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultText = findViewById(R.id.result_text);
        Button backButton = findViewById(R.id.back_button);
        lineChart = findViewById(R.id.line_chart);
        timeFilterGroup = findViewById(R.id.time_filter_group);

        String convertedAmount = getIntent().getStringExtra("converted_amount");
        resultText.setText(convertedAmount);

        setupChart(getMockData("1M"));

        timeFilterGroup.setOnCheckedChangeListener((group, checkedId) -> {
            String selectedTimeFrame;
            if (checkedId == R.id.rb_1d) {
                selectedTimeFrame = "1D";
            } else if (checkedId == R.id.rb_5d) {
                selectedTimeFrame = "5D";
            } else if (checkedId == R.id.rb_1m) {
                selectedTimeFrame = "1M";
            } else if (checkedId == R.id.rb_1y) {
                selectedTimeFrame = "1Y";
            } else {
                selectedTimeFrame = "5Y";
            }
            setupChart(getMockData(selectedTimeFrame));
        });

        backButton.setOnClickListener(v -> finish());
    }

    private void setupChart(ArrayList<Entry> dataValues) {
        LineDataSet lineDataSet = new LineDataSet(dataValues, "Currency Trend");
        lineDataSet.setColor(Color.parseColor("#FF6D72"));
        lineDataSet.setLineWidth(2f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setDrawFilled(true);

        if (Utils.getSDKInt() >= 18) {
            Drawable gradient = getResources().getDrawable(R.drawable.gradient_fill);
            lineDataSet.setFillDrawable(gradient);
        } else {
            lineDataSet.setFillColor(Color.parseColor("#FF6D72"));
        }

        LineData lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);
        lineChart.invalidate();

        lineChart.setDrawGridBackground(false);
        lineChart.getDescription().setEnabled(false);
        lineChart.setTouchEnabled(true);
        lineChart.setPinchZoom(true);
        lineChart.setScaleEnabled(true);
        lineChart.setBackgroundColor(Color.BLACK);

        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(Color.LTGRAY);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(6, true);


        YAxis leftAxis = lineChart.getAxisLeft();
        leftAxis.setTextColor(Color.LTGRAY);
        leftAxis.setDrawGridLines(true);
        leftAxis.enableGridDashedLine(10f, 10f, 0f);
        lineChart.getAxisRight().setEnabled(false);

        Legend legend = lineChart.getLegend();
        legend.setTextColor(Color.LTGRAY);
        legend.setEnabled(true);
    }

    private ArrayList<Entry> getMockData(String timeFrame) {
        ArrayList<Entry> data = new ArrayList<>();

        switch (timeFrame) {
            case "1D":
                data.add(new Entry(0, 86.2f));
                data.add(new Entry(6, 86.5f));
                data.add(new Entry(12, 86.7f));
                data.add(new Entry(18, 86.4f));
                data.add(new Entry(24, 86.5f));
                break;

            case "5D":
                for (int i = 0; i <= 5; i++) {
                    data.add(new Entry(i, 86.0f + (float) Math.random()));
                }
                break;

            case "1M":
                for (int i = 0; i <= 30; i += 5) {
                    data.add(new Entry(i, 86.5f + (float) Math.random()));
                }
                break;

            case "1Y":
                for (int i = 0; i <= 12; i++) {
                    data.add(new Entry(i, 85.5f + (float) Math.random() * 2));
                }
                break;

            case "5Y":
                for (int i = 0; i <= 5; i++) {
                    data.add(new Entry(i, 84.0f + (float) Math.random() * 3));
                }
                break;
        }
        return data;
    }
}
