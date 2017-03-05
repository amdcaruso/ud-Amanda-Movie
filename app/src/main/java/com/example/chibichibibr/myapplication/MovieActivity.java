package com.example.chibichibibr.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.chibichibibr.myapplication.R;

public class MovieActivity extends AppCompatActivity {
    private TextView mDisplayText;
    public static String labelDetail = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        mDisplayText = (TextView) findViewById(R.id.poster_image);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(labelDetail)) {
            mDisplayText.setText(intentThatStartedThisActivity.getStringExtra(labelDetail));
        }
    }

}
