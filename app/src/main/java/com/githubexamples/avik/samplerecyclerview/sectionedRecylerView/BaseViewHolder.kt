package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View):
    RecyclerView.ViewHolder(itemView) {

    abstract var callBackListener: (SectionChildItem<*>) -> Unit
    abstract fun loadData(receivedData: T)


}