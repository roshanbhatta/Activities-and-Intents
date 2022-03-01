package com.example.twoactivitieschallange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.twoactivitieschallange.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button clicked!");
        String textPassage = "Button clicked!";
        Intent intent = new Intent(this,SecondActivity.class);
        switch(view.getId()){
            case R.id.textOne_button:
                textPassage=getString(R.string.textOne_text);
                break;
            case R.id.textTwo_button:
                textPassage=getString(R.string.textTwo_text);
                break;
            case R.id.textThree_button:
                textPassage=getString(R.string.textThree_text);
                break;
        }
        intent.putExtra(EXTRA_MESSAGE,textPassage);
        startActivity(intent);
    }
}