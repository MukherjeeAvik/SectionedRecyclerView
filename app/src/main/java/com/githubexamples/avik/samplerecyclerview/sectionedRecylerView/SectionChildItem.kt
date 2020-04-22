package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

interface SectionChildItem<V> {
    fun getLayoutRes():Int
    fun getViewHolder():Class<V>
}