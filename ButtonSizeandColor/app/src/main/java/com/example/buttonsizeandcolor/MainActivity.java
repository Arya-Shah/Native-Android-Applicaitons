package com.example.buttonsizeandcolor;

import androidx.appcompat.app.AppCompatActivity;
import 	java.util.Random;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    Float textSize,diff=2.0f;
    android.content.res.ColorStateList ColorStateList;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private void setupUIViews() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView.setTextSize(2);
        float a = textView.getTextSize();
        setupUIViews();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize=textView.getTextSize();
                textSize = textSize+diff;
                textView.setTextSize(textSize);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorStateList = textView.getTextColors();
                Random rnd = new Random();
                int TextColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                textView.setTextColor(TextColor);
            }
        });
    }
}