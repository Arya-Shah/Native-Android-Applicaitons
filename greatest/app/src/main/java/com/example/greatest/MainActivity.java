package com.example.greatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView First;
    EditText num1;
    TextView Second;
    EditText num2;
    TextView Third;
    EditText num3;
    TextView Greatest;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        First = (TextView)findViewById(R.id.First);
        num1 = (EditText)findViewById(R.id.num1);
        Second = (TextView)findViewById(R.id.Second);
        num2 = (EditText)findViewById(R.id.num2);
        Third = (TextView)findViewById(R.id.Third);
        num3 = (EditText)findViewById(R.id.num3);
        Greatest = (TextView)findViewById(R.id.Greatest);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(num1.getText().toString());
                float b = Float.parseFloat(num2.getText().toString());
                float c = Float.parseFloat(num3.getText().toString());
                float Values = greatest(a,b,c);
                Greatest.setText(String.valueOf(Values));
            }
        });
    }
    private float greatest(float a, float b, float c){
        if (a>b){
            if (a>c){
                return a;
            }
            else {
                return c;
            }
        }
        else{
            if (b>c){
                return b;
            }
            else {
                return c;
            }
        }
    }
}