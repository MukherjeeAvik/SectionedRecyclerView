package com.githubexamples.avik.samplerecyclerview.models
import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import com.githubexamples.avik.samplerecyclerview.viewHolder.MovieFooterViewHolder

data class MovieFooterItem
    (val movieCount:String)
    :SectionChildItem<MovieFooterViewHolder>{

    override fun getLayoutRes() = R.layout.movie_footer_item

    override fun getViewHolder() = MovieFooterViewHolder::class.java

}