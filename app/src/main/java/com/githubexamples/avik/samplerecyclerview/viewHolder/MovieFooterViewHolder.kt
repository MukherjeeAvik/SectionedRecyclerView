package com.githubexamples.avik.samplerecyclerview.viewHolder

import android.view.View
import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.models.MovieFooterItem
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.BaseViewHolder
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem

import kotlinx.android.synthetic.main.movie_footer_item.view.*


class MovieFooterViewHolder(private val passedView: View

)
    :BaseViewHolder<SectionChildItem<*>>(passedView){

    override fun loadData(receivedData: SectionChildItem<*>) {
        receivedData as MovieFooterItem
        passedView.seeAllMovies.text = passedView.resources.getString(R.string.see_all_movies,receivedData.movieCount)
        itemView.setOnClickListener {
            callBackListener.invoke(receivedData)
        }
    }

    override lateinit var callBackListener: (SectionChildItem<*>) -> Unit


}