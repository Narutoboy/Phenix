package com.do_big.teamphenix;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TimerActivity extends AppCompatActivity {

    ProgressBar progressBar;
    CountDownTimer countDownTimer;
    int i = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_timer);


        textView = findViewById(R.id.timeleft);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar.setProgress(i);
        countDownTimer = new CountDownTimer(50000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                i++;
                progressBar.setProgress((int) i * 100 / (50000 / 1000));
                textView.setText(50 - i + "s");

            }

            @Override
            public void onFinish() {
                //Do what you want
                i++;
                progressBar.setProgress(100);
                textView.setText("success");
            }
        };

        countDownTimer.start();
    }
}