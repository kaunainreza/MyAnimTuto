package com.example.myanimtuto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btnTranslate,btnAlpha,btnRotate,btnScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.txtAnim);
        btnAlpha=findViewById(R.id.btnAlpha);
        btnRotate=findViewById(R.id.btnRotate);
        btnTranslate=findViewById(R.id.btnTranslate);
        btnScale=findViewById(R.id.btnScale);
       // btnBlink = findViewById(R.id.btnBlink);



        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.startAnimation(move);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                textView.startAnimation(alpha);
            }
        });
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                textView.startAnimation(scale);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                textView.startAnimation(rotate);
            }
        });
    }
}