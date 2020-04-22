package com.githubexamples.avik.samplerecyclerview.viewHolder

import android.view.View
import com.githubexamples.avik.samplerecyclerview.models.MovieHeaderItem
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.BaseViewHolder
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import kotlinx.android.synthetic.main.movie_header_item.view.*


class MovieHeaderViewHolder(
    private val passedView: View)
    : BaseViewHolder<SectionChildItem<*>>(passedView) {

    override fun loadData(receivedData: SectionChildItem<*>) {
        receivedData as MovieHeaderItem
        passedView.movieInfoTxt.text = receivedData.movieGenre
        itemView.setOnClickListener {
            callBackListener.invoke(receivedData)
        }

    }

    override lateinit var callBackListener: (SectionChildItem<*>) -> Unit
}