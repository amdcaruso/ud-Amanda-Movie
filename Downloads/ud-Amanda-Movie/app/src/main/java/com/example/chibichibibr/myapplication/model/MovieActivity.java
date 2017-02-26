package com.example.chibichibibr.myapplication.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MovieActivity extends AppCompatActivity {
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        mDisplayText = (TextView) findViewById(R.layout.poster_image);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            mDisplayText.setText(textEntered);
        }
    }

}
