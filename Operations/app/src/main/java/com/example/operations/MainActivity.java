package com.example.operations;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView One;
    EditText num1;
    TextView Two;
    EditText num2;
    TextView Answer;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    private final char  ADDITION = '+';
    private final char  SUBTRACTION = '-';
    private final char  MULTIPLICATION = '*';
    private final char  DIVISION = '/';
    double val1 = Double.NaN;
    double val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        One = (TextView)findViewById(R.id.One);
        num1 = (EditText) findViewById(R.id.num1);
        Two = (TextView)findViewById(R.id.Two);
        num2 = (EditText) findViewById(R.id.num2);
        Answer = (TextView)findViewById(R.id.Answer);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(num1.getText().toString());
                val2 = Double.parseDouble(num2.getText().toString());

                Double ADDITION = val1 + val2;
                Answer.setText(String.valueOf(ADDITION));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(num1.getText().toString());
                val2 = Double.parseDouble(num2.getText().toString());

                Double SUBTRACTION = val1 - val2;
                Answer.setText(String.valueOf(SUBTRACTION));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(num1.getText().toString());
                val2 = Double.parseDouble(num2.getText().toString());

                Double MULTIPLICATION = val1 * val2;
                Answer.setText(String.valueOf(MULTIPLICATION));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(num1.getText().toString());
                val2 = Double.parseDouble(num2.getText().toString());

                Double DIVISION = val1 / val2;
                Answer.setText(String.valueOf(DIVISION));
            }
        });
    }
}