package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private Button Equal;
    private Button Clear;
    private TextView Input;
    private TextView Output;
    private final char  ADDITION = '+';
    private final char  SUBTRACTION = '-';
    private final char  MULTIPLICATION = '*';
    private final char  DIVISION = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char Action;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "9");
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                Action = ADDITION;
                Output.setText(String.valueOf(val1) + "+");
                Input.setText(null);

            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                Action = SUBTRACTION;
                Output.setText(String.valueOf(val1) + "-");
                Input.setText(null);

            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                Action = MULTIPLICATION;
                Output.setText(String.valueOf(val1) + "*");
                Input.setText(null);

            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                Action = DIVISION;
                Output.setText(String.valueOf(val1) + "/");
                Input.setText(null);

            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                Action = EQU;
                Output.setText(Output.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                Input.setText(null);
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Input.getText().length()>0){
                    CharSequence name = Input.getText().toString();
                    Input.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    Input.setText(null);
                    Output.setText(null);
                }
            }
        });
    }

    private void setupUIViews(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        Add = (Button)findViewById(R.id.btnAdd);
        Sub = (Button)findViewById(R.id.btnSub);
        Mul = (Button)findViewById(R.id.btnMul);
        Div = (Button)findViewById(R.id.btnDiv);
        Equal = (Button)findViewById(R.id.btnEqualTo);
        Clear = (Button)findViewById(R.id.btnAC);
        Input = (TextView)findViewById(R.id.Input);
        Output = (TextView)findViewById(R.id.Output);
    }

    private void calculate(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(Input.getText().toString());

            switch (Action){
                case ADDITION:
                    val1 = val1+val2;
                    break;
                case SUBTRACTION:
                    val1 = val1-val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1*val2;
                    break;
                case DIVISION:
                    val1 = val1/val2;
                    break;
                case EQU:
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(Input.getText().toString());
        }
    }
}