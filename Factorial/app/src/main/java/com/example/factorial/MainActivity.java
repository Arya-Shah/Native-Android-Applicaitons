package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText Text;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text = (EditText)findViewById(R.id.Text);
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int num = Integer.parseInt(Text.getText().toString());
                    textView.setText("" + String.format(Locale.getDefault(), "%.0f", factorial(num)));
                }
            });

    }
    private double factorial(double num){
        if (num<2){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
}