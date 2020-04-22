package com.githubexamples.avik.samplerecyclerview.models

import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import com.githubexamples.avik.samplerecyclerview.viewHolder.DarkThemeToggleViewHolder
import com.githubexamples.avik.samplerecyclerview.viewHolder.MovieItemHorizontalViewHolder

data class DarkModeSwitchItem(var isEnabled:Boolean)
    : SectionChildItem<DarkThemeToggleViewHolder> {
    override fun getLayoutRes() = R.layout.theme_swith_item

    override fun getViewHolder() =  DarkThemeToggleViewHolder::class.java

}