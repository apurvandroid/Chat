package com.dreams.chat_apurv.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.daasuu.ahp.AnimateHorizontalProgressBar;
import com.dreams.chat_apurv.R;
import com.dreams.chat_apurv.utils.Helper;
import com.squareup.picasso.Picasso;

public class SplashActivity extends AppCompatActivity {


    ImageView imgBacground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imgBacground=findViewById(R.id.imgBacground);
        Picasso.get().load(R.drawable.s).into(imgBacground);

        AnimateHorizontalProgressBar progressBar = (AnimateHorizontalProgressBar) findViewById(R.id.animate_progress_bar);
        progressBar.setMax(1500);
        progressBar.setProgressWithAnim(1500);

        final Helper helper = new Helper(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, helper.getLoggedInUser() != null ? MainActivity.class : SignInActivity.class));
                finish();
            }
        }, 1500);
    }
}
