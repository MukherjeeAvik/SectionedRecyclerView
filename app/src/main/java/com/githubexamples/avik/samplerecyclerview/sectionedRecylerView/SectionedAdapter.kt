package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

import android.view.LayoutInflater
import android.view.ViewGroup
import com.githubexamples.avik.samplerecyclerview.R

class SectionedAdapter(private val callBackListener: (SectionChildItem<*>) -> Unit):BaseAdapter<SectionBlock<SectionChildItem<*>>,SectionedParentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionedParentViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.generic_sectioned_parent_layout, parent, false)
        return SectionedParentViewHolder(itemView,callBackListener)
    }

    override fun getItemCount() = listSize


    override fun onBindViewHolder(holder: SectionedParentViewHolder, position: Int) {
        holder.loadData(list[position])

    }

}