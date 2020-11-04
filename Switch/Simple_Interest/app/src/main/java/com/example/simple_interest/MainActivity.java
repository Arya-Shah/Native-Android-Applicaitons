package com.example.simple_interest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Amt;
    EditText Principle;
    TextView Interest;
    EditText Rate;
    TextView Time_Period;
    EditText Time;
    TextView I_Amt;
    TextView T_Amt;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Amt = (TextView)findViewById(R.id.Amt);
        Principle = (EditText)findViewById(R.id.Principle);
        Interest = (TextView)findViewById(R.id.Interest);
        Rate = (EditText)findViewById(R.id.Rate);
        Time_Period = (TextView)findViewById(R.id.Time_Period);
        Time = (EditText)findViewById(R.id.Time);
        I_Amt = (TextView)findViewById(R.id.I_Amt);
        T_Amt = (TextView)findViewById(R.id.T_Amt);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float p = Float.parseFloat(Principle.getText().toString());
                float r = Float.parseFloat(Rate.getText().toString());
                float t = Float.parseFloat(Time.getText().toString());
                float[] Values = Simple_Interest(p,r,t);

                I_Amt.setText(String.valueOf(Values[0]));
                T_Amt.setText(String.valueOf(Values[1]));
            }
        });
    }
        private float[] Simple_Interest(float p, float r, float t){
            float I_Amt = p*r*t/100;
            float T_Amt = p + I_Amt;
            return new float[]{I_Amt, T_Amt};
        }
}