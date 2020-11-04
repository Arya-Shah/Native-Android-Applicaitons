package com.example.eventregistrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Fname;
    private EditText Lname;
    private EditText Phone;
    private EditText guests;
    private EditText children;
    private Button btnSubmit;
    private TextView fname;
    private TextView lname;
    private TextView email;
    private TextView phone;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fname = (EditText)findViewById(R.id.txtFName);
        Lname = (EditText)findViewById(R.id.txtLName);
        guests = (EditText)findViewById(R.id.guests);
        children = (EditText)findViewById(R.id.children);
        Phone = (EditText)findViewById(R.id.txtPhone);
        btnSubmit = (Button)findViewById(R.id.button);
        Boolean f = true;
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                if (Fname.getText().toString() == "")
                {Fname.setError("First Name is required"); }
                else
                    fname.setText("First Name: " + Fname.getText().toString());
                if (Lname.getText().toString()== "")
                    Lname.setError("Last Name is required");
                else
                    lname.setText("Last Name: " + Lname.getText().toString());
                if (Phone.getText().toString()== "")
                    Phone.setError("Phone Number is required");
                else
                    phone.setText("Contact: " + Phone.getText().toString());
                if (guests.getText().toString()== "")
                    guests.setError("Number of Guests attending is required");
                else
                    guests.setText("Guests " + guests.getText().toString());
                if (children.getText().toString()== "")
                    children.setError("Number of Children going to  attend is required");
                else
                    openConfirmation();

            }
        });
    }
    public void openConfirmation(){
        Intent intent;
        intent = new Intent(this, Confirmation.class);
        startActivity(intent);
    }
}