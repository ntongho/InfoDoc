package com.example.infodoc;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashscreenActivity extends AppCompatActivity {
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

                ObjectAnimator objectAnimator=ObjectAnimator.ofInt(textView4,"backgroundColor", Color.WHITE,Color.RED,Color.YELLOW);
                objectAnimator.setDuration(400);
                objectAnimator.setEvaluator(new ArgbEvaluator());
                objectAnimator.setRepeatCount(Animation.REVERSE);
                objectAnimator.setRepeatCount(Animation.INFINITE);
                objectAnimator.start();
//        ObjectAnimator objectAnimator2=ObjectAnimator.ofInt(textView2,"backgroundColor", Color.LTGRAY,Color.RED);






    }

//    private  void manageBlink(){
//        ObjectAnimator objectAnimator=ObjectAnimator.ofInt(textView1,"backgroundColor", Color.WHITE,Color.RED);
//    }
}
