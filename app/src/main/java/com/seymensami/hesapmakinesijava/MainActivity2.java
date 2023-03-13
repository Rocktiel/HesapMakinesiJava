package com.seymensami.hesapmakinesijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Handler h=new Handler();

        text=findViewById(R.id.textView);
        Animation animationUtils=AnimationUtils.loadAnimation(this,R.anim.animasyontext);
        text.setAnimation(animationUtils);


        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },2500);
    }
}