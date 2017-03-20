package com.example.chibichibibr.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chibichibibr.myapplication.R;
import com.example.chibichibibr.myapplication.model.Movie;

public class MovieActivity extends AppCompatActivity {
    private TextView mDisplayText;
    public static String labelDetail = "test";
    private TextView mDisplayTitle;
    private TextView mDisplayOverview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        mDisplayText = (TextView) findViewById(R.id.poster_image);
        mDisplayTitle = (TextView) findViewById(R.id.title);
        mDisplayOverview = (TextView) findViewById(R.id.overview);
        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(labelDetail)) {
            mDisplayText.setText(intentThatStartedThisActivity.getStringExtra(labelDetail));
            Movie movie = (Movie) getIntent().getParcelableExtra(labelDetail);
            mDisplayTitle.setText(movie.getTitle());
            mDisplayOverview.setText(movie.getOverview());

        }
    }

}
