package com.example.backgroundcolor;

import androidx.appcompat.app.AppCompatActivity;
import 	java.util.Random;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private View view1;
    private void setupUIViews() {
        b1 = (Button) findViewById(R.id.Btn1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        view1 = (View) findViewById(R.id.Background_view);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                view1.setBackgroundColor(color);
            }
        });
    }
}