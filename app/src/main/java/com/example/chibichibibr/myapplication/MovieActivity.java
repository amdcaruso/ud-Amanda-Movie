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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        mDisplayText = (TextView) findViewById(R.id.poster_image);
        mDisplayTitle = (TextView) findViewById(R.id.title);
        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(labelDetail)) {
            mDisplayText.setText(intentThatStartedThisActivity.getStringExtra(labelDetail));
            Movie movie = (Movie) getIntent().getParcelableExtra(labelDetail);
            // Make a toast to test, get the attributes and add imageview/text view
            //Toast.makeText(getApplicationContext(), "Click " + movie , Toast.LENGTH_SHORT).show();
            mDisplayTitle.setText(movie.getTitle());


        }
    }

}
