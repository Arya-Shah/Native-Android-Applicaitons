package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ToggleButton tbtn;
    Switch sh;
    String msg;
    String msg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tbtn = findViewById(R.id.toggleButton);
        sh = findViewById(R.id.switch1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbtn.isChecked())
                {
                    msg = tbtn.getTextOn().toString();
                }
                else
                {
                    msg = tbtn.getTextOff().toString();
                }
                if (sh.isChecked())
                {
                    msg1 = sh.getTextOn().toString();
                }
                else
                {
                    msg1 = sh.getTextOff().toString();
                }
                Toast.makeText(MainActivity.this, "Toggle Button is " + msg+ " and  Switch is " + msg1 , Toast.LENGTH_LONG).show();
            }
        });
    }
}