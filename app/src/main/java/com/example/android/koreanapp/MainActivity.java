package com.example.android.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumbersClickListener clickListener = new NumbersClickListener();
        Button numbers = (Button)findViewById(R.id.number);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NumbersActivity.class));
            }
        });
    }

    public void colors(View view) {

        Intent intent = new Intent(getApplicationContext(), ColorsActivity.class);
        startActivity(intent);
    }

    public void family(View view) {

        Intent intent = new Intent(getApplicationContext(), FamilyActivity.class);
        startActivity(intent);
    }

    public void numbers(View view) {

        Intent intent = new Intent(getApplicationContext(), NumbersActivity.class);
        startActivity(intent);
    }

    public void transportation(View view) {

        Intent intent = new Intent(getApplicationContext(), TransportationActivity.class);
        startActivity(intent);
    }

    public void school(View view) {

        Intent intent = new Intent(getApplicationContext(), SchoolActivity.class);
        startActivity(intent);
    }
}