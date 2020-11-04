package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText number;
    EditText password;
    EditText cpassword;
    Button Register;
    AwesomeValidation awesomeValidation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        number = (EditText) findViewById(R.id.number);
        password = (EditText)findViewById(R.id.password);
        cpassword = (EditText)findViewById(R.id.cpassword);


        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.name, RegexTemplate.NOT_EMPTY,R.string.invalid_name);
        awesomeValidation.addValidation(this, R.id.name, "[5-9]{1}[0-9]{9}$",R.string.invalid_number);
        awesomeValidation.addValidation(this, R.id.email, Patterns.EMAIL_ADDRESS,R.string.invalid_email);
        awesomeValidation.addValidation(this, R.id.password, ".{6}",R.string.invalid_password);
        awesomeValidation.addValidation(this, R.id.cpassword,R.id.password,R.string.invalid_cpassword);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (awesomeValidation.validate()){
                    Toast.makeText(getApplicationContext(), "Form Succesfully Validated.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Form not Validated.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}