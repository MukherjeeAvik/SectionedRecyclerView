package com.githubexamples.avik.samplerecyclerview.models

import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import com.githubexamples.avik.samplerecyclerview.viewHolder.MovieHeaderViewHolder

data class MovieHeaderItem
    (val movieGenre:String)
    :SectionChildItem<MovieHeaderViewHolder>{

    override fun getLayoutRes() = R.layout.movie_header_item

    override fun getViewHolder() = MovieHeaderViewHolder::class.java

}