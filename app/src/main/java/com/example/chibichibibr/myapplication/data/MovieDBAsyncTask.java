package com.example.chibichibibr.myapplication.data;

import android.os.AsyncTask;

import com.example.chibichibibr.myapplication.Utils.NetworkUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by chibichibibr on 20/03/2017.
 */

public class MovieDBAsyncTask extends AsyncTask<String, Void, String>{

    @Override
    protected String doInBackground(String... movieUrl) {
        URL url = null;
        try {
            url = new URL(movieUrl[0]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            return NetworkUtils.getResponseFromHttpUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
