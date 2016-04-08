package com.nkdroid.wordpress.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.android.volley.VolleyError;
import com.google.gson.GsonBuilder;
import com.nkdroid.wordpress.app.model.Pages;
import com.nkdroid.wordpress.app.util.AppConstant;
import com.nkdroid.wordpress.app.util.GetServiceCall;
import com.nkdroid.wordpress.app.util.PrefUtils;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.imgSplash);
        iv.clearAnimation();
        iv.startAnimation(anim);

//        new CountDownTimer(3000, 1000) {
//
//            @Override
//            public void onTick(long millisUntilFinished) {
//
//            }
//
//            @Override
//            public void onFinish() {
//                Intent i = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(i);
//            }
//        }.start();

        new GetServiceCall(AppConstant.getPages,GetServiceCall.TYPE_JSONOBJECT){

            @Override
            public void response(String response) {

                Pages pages=new GsonBuilder().create().fromJson(response,Pages.class);
                PrefUtils.setPages(pages,SplashActivity.this);
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                Log.e("response",pages.pageContentArrayList.size()+"");
            }

            @Override
            public void error(VolleyError error) {

            }
        }.call();
    }
}
