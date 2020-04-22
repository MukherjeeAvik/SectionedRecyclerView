package com.githubexamples.avik.samplerecyclerview.viewHolder

import android.view.View
import com.bumptech.glide.Glide
import com.githubexamples.avik.samplerecyclerview.models.VerticalMovieItem
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.BaseViewHolder
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import kotlinx.android.synthetic.main.movie_details_vertical_item.view.*

class MovieItemVerticalViewHolder(
    private val passedView: View
) : BaseViewHolder<SectionChildItem<*>>(passedView) {

    override fun loadData(receivedData: SectionChildItem<*>) {
        receivedData as VerticalMovieItem
        passedView.movieNameTxt.text = receivedData.movieName
        passedView.movieRatingTxt.text = receivedData.movieRating

        Glide.with(passedView.context)
            .load(receivedData.moviePosterImage)
            .into(passedView.moviePosterImg)

        itemView.setOnClickListener {
            callBackListener.invoke(receivedData)
        }

    }
    override lateinit var callBackListener: (SectionChildItem<*>) -> Unit

}