package com.example.sharedpreferencedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Button b1, b2;

    public static final String MY_PREFERENCES = "MyPrefs" ;
    public static final String NAME = "nameKey";
    public static final String PHONE = "phoneKey";
    public static final String EMAIL = "emailKey";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);

        b1=(Button)findViewById(R.id.buttonSave);
        b2=(Button)findViewById(R.id.buttonLoad);
        sharedpreferences = getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n  = ed1.getText().toString();
                String ph  = ed2.getText().toString();
                String e  = ed3.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(NAME, n);
                editor.putString(PHONE, ph);
                editor.putString(EMAIL, e);
                editor.apply();
                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = sharedpreferences.getString(NAME, "");
                String phone = sharedpreferences.getString(PHONE, "");
                String email = sharedpreferences.getString(EMAIL, "");

                ed1.setText(name);
                ed2.setText(phone);
                ed3.setText(email);
                Toast.makeText(MainActivity.this,"Updated",Toast.LENGTH_LONG).show();
            }
        });
    }

}