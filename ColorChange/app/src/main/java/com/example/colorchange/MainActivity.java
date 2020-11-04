package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;

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
    private Button btn5;
    private Button btn6;
    private Button button5;
    private Button button6;
    private Button button7;
    private void setupUIViews() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        setupUIViews();

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            textSize=textView.getTextSize();
            textSize = 30f;
            textView.setTextSize(textSize);
        }
    });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize=textView.getTextSize();
                textSize = 24f;
                textView.setTextSize(textSize);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize=textView.getTextSize();
                textSize = 12f;
                textView.setTextSize(textSize);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize=textView.getTextSize();
                textSize = 18f;
                textView.setTextSize(textSize);
            }
        });

    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ColorStateList = textView.getTextColors();
            int TextColor = Color.YELLOW;
            textView.setTextColor(TextColor);
        }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorStateList = textView.getTextColors();
                int TextColor = Color.BLUE;
                textView.setTextColor(TextColor);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorStateList = textView.getTextColors();
                int TextColor = Color.CYAN;
                textView.setTextColor(TextColor);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorStateList = textView.getTextColors();
                int TextColor = Color.MAGENTA;
                textView.setTextColor(TextColor);
            }
        });
    }
}