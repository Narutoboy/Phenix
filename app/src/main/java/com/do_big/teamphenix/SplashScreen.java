package com.do_big.teamphenix;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //overridePendingTransition(R.anim.left,R.anim.fadeout);
        TextView title = findViewById(R.id.txt_appName);
        ImageView image = findViewById(R.id.img_appIcon);
        //Animation animation= AnimationUtils.loadAnimation(SplashScreen.this, R.anim.fadein);
        //Animation animimage= AnimationUtils.loadAnimation(SplashScreen.this, R.anim.rotate);
        //title.startAnimation(animation);
        //image.startAnimation(animimage);
        PrefManager prefManager = new PrefManager(this);
        if (prefManager.isFirstTimeLaunch()) {
            TimerTask tt = new TimerTask() {
                @Override
                public void run() {
                    //for first time
                    //launch login screen
                    startActivity(new Intent(SplashScreen.this, BaseActivity.class));
                    SplashScreen.this.finish();

                }
            };
            Timer t = new Timer();
            t.schedule(tt, 1000);

        } else {
            TimerTask tt = new TimerTask() {
                @Override
                public void run() {
                    //lunch Dashboard Activity
                    Intent intent = new Intent(SplashScreen.this, BaseActivity.class);
                    startActivity(intent);
                    SplashScreen.this.finish();
                }
            };
            Timer t = new Timer();
            t.schedule(tt, 2500);


        }

    }


}