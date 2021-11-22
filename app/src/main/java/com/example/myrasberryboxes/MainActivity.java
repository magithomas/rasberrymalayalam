package com.example.myrasberryboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int raspberryPrice = 5;
        display1("1 box: $" + raspberryPrice);
        display2("2 boxes: $" + (raspberryPrice * 2));
        display3("3 boxes: $" + (raspberryPrice * 3));

    }


    public void display1(String text) {
        TextView t = (TextView) findViewById(R.id.text1);
        t.setText(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.text2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.text3);
        t.setText(text);
    }


}