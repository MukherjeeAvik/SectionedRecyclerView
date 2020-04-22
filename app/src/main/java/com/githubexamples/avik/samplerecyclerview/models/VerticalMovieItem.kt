package com.githubexamples.avik.samplerecyclerview.models

import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import com.githubexamples.avik.samplerecyclerview.viewHolder.MovieItemHorizontalViewHolder
import com.githubexamples.avik.samplerecyclerview.viewHolder.MovieItemVerticalViewHolder

data class VerticalMovieItem
    (val movieName:String,val moviePosterImage:String,val movieRating:String)
    : SectionChildItem<MovieItemVerticalViewHolder> {

    override fun getLayoutRes() = R.layout.movie_details_vertical_item

    override fun getViewHolder() = MovieItemVerticalViewHolder::class.java
}