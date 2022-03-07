package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent =getIntent();
        String number = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView countNumberText = findViewById(R.id.countNumberText);
        countNumberText.setText(number);
    }
}