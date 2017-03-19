package com.example.chibichibibr.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chibichibibr.myapplication.model.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by amandaresolver on 16/02/2017.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    List<Movie> movies;

    public MovieListAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, null);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie data = movies.get(position);
        Picasso.with(holder.itemView.getContext())
                .load(data.getPoster())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
