package com.do_big.teamphenix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

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
            Toast.makeText(this, "launching Journal", Toast.LENGTH_SHORT).show();
        } else if (view.equals(vBreath)) {
            //launch walk screen
            startActivity(new Intent(this, TimerActivity.class));
            Toast.makeText(this, "launching Breath", Toast.LENGTH_SHORT).show();
        } else if (view.equals(vLearn)) {
            //launch walk screen
            startActivity(new Intent(this, TimerActivity.class));
            Toast.makeText(this, "Need to add fresco ievolve icons screen", Toast.LENGTH_SHORT).show();
        } else if (view.equals(vReach)) {
            //launch walk screen

            Toast.makeText(this, "Needed to add Reachout Screen", Toast.LENGTH_SHORT).show();
        } else if (view.equals(vWorry)) {
            //launch walk screen
            startActivity(new Intent(this, WriteWorriesActivity.class));

        }


    }
}