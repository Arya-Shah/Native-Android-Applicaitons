package com.example.layoutmanager;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Build; import android.os.Bundle;
import android.text.TextUtils; import android.view.View;
import android.widget.Button; import android.widget.EditText;
import android.widget.RadioButton; import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Button clicklong,clickshort,clickshort_long,showname;
    private EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickshort = (Button) findViewById(R.id.Clickshort);
        clicklong = (Button) findViewById(R.id.Clicklong);
        clickshort_long = (Button) findViewById(R.id.Clickshort_long);
        name = (EditText) findViewById(R.id.name);
        showname = (Button) findViewById(R.id.Showname);
        clickshort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Clicked on short click",Toast.LENGTH_SHORT).show();
            }
        });
        clicklong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(),"Clicked on short click",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        clickshort_long.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(),"Clicked for long time",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        clicklong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Clicked for long time",Toast.LENGTH_SHORT).show();
            }
        });
        showname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),name.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
