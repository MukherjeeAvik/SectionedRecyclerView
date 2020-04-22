package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

interface SectionBlock<T> {
    fun getHeader():T?
    fun getListOfItems(): List<T>?
    fun getOrientation():Int
    fun getFooter():T?
}