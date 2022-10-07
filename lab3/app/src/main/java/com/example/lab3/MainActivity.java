package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void loadMainLayout(View v) {
        setContentView(R.layout.main_layout);
    }

    public void loadCard1More(View v) {
        setContentView(R.layout.card_contents_1_more);
    }

    public void loadCard2More(View v) {
        setContentView(R.layout.card_contents_2_more);
    }

    public void loadCard3More(View v) {
        setContentView(R.layout.card_contents_3_more);
    }
}