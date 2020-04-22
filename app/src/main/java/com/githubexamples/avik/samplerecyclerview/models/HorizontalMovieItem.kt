package com.githubexamples.avik.samplerecyclerview.models

import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import com.githubexamples.avik.samplerecyclerview.viewHolder.MovieItemHorizontalViewHolder

data class HorizontalMovieItem
    (val movieName:String,val moviePosterImage:String,val movieRating:String)
    :SectionChildItem<MovieItemHorizontalViewHolder>{

    override fun getLayoutRes() = R.layout.movie_detail_horizontal_item

    override fun getViewHolder() = MovieItemHorizontalViewHolder::class.java
}