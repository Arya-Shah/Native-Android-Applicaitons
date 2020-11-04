package com.example.bmi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView weight = findViewById(R.id.weight);
        final TextView height = findViewById(R.id.height);
        Button cal = findViewById(R.id.calculate);
        FloatingActionButton fbtn = findViewById(R.id.floatbtn);

        weight.setTooltipText("Enter Your Weight (Kg)");
        height.setTooltipText("Enter  Your Height  (m)");

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float bmi = Float.parseFloat(weight.getText().toString())/(Float.parseFloat(height.getText().toString()) *Float.parseFloat(height.getText().toString()));
                if (bmi < 20){
                    Toast.makeText(getApplicationContext()," You Are Under Weight",Toast.LENGTH_LONG).show();
                }
                else if (bmi < 27){
                    Toast.makeText(getApplicationContext()," You Are Normal xD",Toast.LENGTH_LONG).show();
                }
                else if(bmi < 32){
                    Toast.makeText(getApplicationContext(),"You Are Overweight",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Obese",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}