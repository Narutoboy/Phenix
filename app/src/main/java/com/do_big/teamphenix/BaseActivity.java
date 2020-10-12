package com.do_big.teamphenix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout vWalk, vJournal, vBreath, vLearn, vReach, vWorry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        vWalk = findViewById(R.id.ll_walk);
        vWalk.setOnClickListener(this);
        vJournal = findViewById(R.id.ll_journal);
        vJournal.setOnClickListener(this);
        vBreath = findViewById(R.id.breathe);
        vBreath.setOnClickListener(this);
        vLearn = findViewById(R.id.ll_learn);
        vLearn.setOnClickListener(this);
        vReach = findViewById(R.id.ll_reach_out);
        vReach.setOnClickListener(this);
        vWorry = findViewById(R.id.ll_worry);
        vWorry.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        View btnClicked = view;

        if (view.equals(vWalk)) {

            startActivity(new Intent(this, TimerActivity.class));
            //launch walk screen
        } else if (view.equals(vJournal)) {
            //launch walk screen
            startActivity(new Intent(this, journalActivity.class));

        } else if (view.equals(vBreath)) {
            //launch walk screen
            startActivity(new Intent(this, TimerActivity.class));
        } else if (view.equals(vLearn)) {
            //launch walk screen
            startActivity(new Intent(this, TimerActivity.class));

        } else if (view.equals(vReach)) {
            //launch walk screen
            startActivity(new Intent(this, FeatureDescActivity.class));

        } else if (view.equals(vWorry)) {
            //launch walk screen
            startActivity(new Intent(this, WriteWorriesActivity.class));

        }


    }
}