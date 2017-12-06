package com.example.android.healthyliving;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.healthyliving.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    int healthLevel = 100;
    String message;

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display1(String text) {
        display(text);
    }

    public void yes(View view) {

        message = "You answered yes, current health level is " + healthLevel +"%";
        display(message);
    }

    public void sometimes(View view) {

        message = "You answered sometimes, current health level is " + (healthLevel-25) +"%";
        display(message);
    }

    public void no(View view) {

        message = "You answered no, current health level is " + (healthLevel/2) +"%";
        display(message);
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */



}