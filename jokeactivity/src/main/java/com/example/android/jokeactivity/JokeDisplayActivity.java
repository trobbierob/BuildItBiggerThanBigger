package com.example.android.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent jokeIntent = getIntent();

        TextView textView = findViewById(R.id.joke_textview);
        textView.setText(jokeIntent.getStringExtra("joke"));
    }
}
