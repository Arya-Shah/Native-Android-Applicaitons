package com.example.displayimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view){
        int[] myPhotos = {
                R.drawable.a, R.drawable.b,
                R.drawable.c
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}