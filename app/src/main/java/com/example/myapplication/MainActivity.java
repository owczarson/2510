package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private TextView myTextView;
    private float textSize = 18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.myTextView);
        Button buttonChangeColor = findViewById(R.id.buttonChangeColor);
        buttonChangeColor.setOnClickListener(v -> myTextView.setTextColor(Color.RED));
        Button buttonChangeText = findViewById(R.id.buttonChangeText);
        buttonChangeText.setOnClickListener(v -> myTextView.setText("Nowy tekst"));
        Button buttonHideTextView = findViewById(R.id.buttonHideTextView);
        buttonHideTextView.setOnClickListener(v -> {
            if (myTextView.getVisibility() == View.VISIBLE) {
                myTextView.setVisibility(View.INVISIBLE);
            } else {
                myTextView.setVisibility(View.VISIBLE);
            }
        });
        Button buttonIncreaseTextSize = findViewById(R.id.buttonIncreaseTextSize);
        buttonIncreaseTextSize.setOnClickListener(v -> {
            textSize += 2;
            myTextView.setTextSize(textSize);
        });
    }
}