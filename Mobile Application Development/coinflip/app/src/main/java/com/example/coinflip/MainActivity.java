package com.example.coinflip;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;

import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private ImageView coinImage;
    private TextView resultText;
    private Button flipButton;
    private RadioGroup choiceGroup;
    private Random random;
    private MediaPlayer coinSound;
    private int[] coinSides = {R.drawable.heads, R.drawable.tails};
    private String[] coinResults = {"Heads", "Tails"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coinImage = findViewById(R.id.coinImage);
        resultText = findViewById(R.id.resultText);
        flipButton = findViewById(R.id.flipButton);
        choiceGroup = findViewById(R.id.choiceGroup);
        random = new Random();


        flipButton.setOnClickListener(view -> flipCoin());
    }
    private void flipCoin() {
        int selectedId = choiceGroup.getCheckedRadioButtonId();
        if (selectedId == -1) {
            resultText.setText("Please select Heads or Tails!");
            return;
        }
        Animation flipAnimation = AnimationUtils.loadAnimation(this,
                R.anim.flip_animation);
        coinImage.startAnimation(flipAnimation);

        if (coinSound != null) {
            coinSound.start();
        }

        new Handler().postDelayed(() -> {
            int result = random.nextInt(2);
            coinImage.setImageResource(coinSides[result]);
            String tossResult = coinResults[result];

            String userChoice = ((RadioButton)
                    findViewById(selectedId)).getText().toString();
            if (userChoice.equals(tossResult)) {
                resultText.setText("Result: " + tossResult + " - You won the toss!");

            } else {
                resultText.setText("Result: " + tossResult + " - You lost the toss!");
            }
        }, 500);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (coinSound != null) {
            coinSound.release();
            coinSound = null;
        }
    }
}