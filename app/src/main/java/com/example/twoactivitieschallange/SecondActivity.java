package com.example.twoactivitieschallange;

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
        String textPassage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView text = findViewById(R.id.text_passage);
        text.setText(textPassage);
    }
}