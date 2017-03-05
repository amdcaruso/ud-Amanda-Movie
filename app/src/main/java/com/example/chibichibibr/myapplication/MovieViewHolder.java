package com.example.chibichibibr.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by amandaresolver on 16/02/2017.
 */
public class MovieViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    public MovieViewHolder(View itemView) {
        super(itemView);
        image = (ImageView)itemView;
    }
}
