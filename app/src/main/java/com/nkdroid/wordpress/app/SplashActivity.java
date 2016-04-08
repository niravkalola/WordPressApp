package com.nkdroid.wordpress.app;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation  anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.imgSplash);
        iv.clearAnimation();
        iv.startAnimation(anim);

        new CountDownTimer(3000,1000){

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent i=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
            }
        }.start();
    }
}
