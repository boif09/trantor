package com.ringmember.activity;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xavi.ringmember.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: load init data

        //main page
        Intent calendarIntent = new Intent(this,CalendarActivity.class);
        startActivity(calendarIntent);
    }
}
