package com.example.android.koreanapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NumbersClickListener implements View.OnClickListener {

    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
        //Intent intent = new Intent(, NumbersActivity.class);
        //context.startActivity(intent);
    }
}
