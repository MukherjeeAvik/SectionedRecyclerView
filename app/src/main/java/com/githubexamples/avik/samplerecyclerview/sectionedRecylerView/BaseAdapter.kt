package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

import androidx.recyclerview.widget.RecyclerView
import java.util.*

abstract class BaseAdapter<V : Any, T : RecyclerView.ViewHolder>() : RecyclerView.Adapter<T>() {

    val list: MutableList<V> = Collections.synchronizedList(ArrayList())



    val listSize: Int
        get() = list.size



    /**
     * clear all the list and add the whole list
     *
     * @param list
     */
    fun addAll(list: List<V>) {
        this.list.clear()
        this.list.addAll(list)
    }


    fun appendList(list: List<V>) {
        this.list.addAll(list)
    }



    fun clearData() {
        this.list.clear()
        notifyChange()
    }

    /**
     * add the element to the list
     *
     * @param v
     */
    fun add(v: V) {
        list.add(v)
    }

    @Synchronized
    fun notifyChange() {
        super.notifyDataSetChanged()
    }



}