
package com.example.chibichibibr.myapplication.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Movie implements Parcelable {

    String poster;
    String overview;
    String title;
    String popularity;

    public Movie(String poster, String overview, String title, String popularity) {
        this.poster = poster;
        this.overview = overview;
        this.title = title;
        this.popularity = popularity;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "poster='" + poster + '\'' +
                ", overview='" + overview + '\'' +
                ", title='" + title + '\'' +
                ", popularity='" + popularity + '\'' +
                '}';
    }

    protected Movie(Parcel in) {
        poster = in.readString();
        overview = in.readString();
        title = in.readString();
        popularity = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(poster);
        dest.writeString(overview);
        dest.writeString(title);
        dest.writeString(popularity);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}