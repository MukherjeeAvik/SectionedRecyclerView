package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SectionChildAdapter(private val callBackListener: (SectionChildItem<*>) -> Unit) :
    BaseAdapter<SectionChildItem<*>, BaseViewHolder<SectionChildItem<*>>>() {

    private val viewBindMap = HashMap<Int, Class<*>>()

    fun registerViewHolder(layout:Int,viewHolderClass:Class<*>){
         viewBindMap[layout] = viewHolderClass
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<SectionChildItem<*>> {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        val viewHolder =
            viewBindMap[viewType]?.getConstructor(View::class.java)?.newInstance(itemView)
        return viewHolder as BaseViewHolder<SectionChildItem<*>>


    }

    override fun getItemCount() = listSize
    override fun getItemViewType(position: Int): Int {
        return list[position].getLayoutRes()
    }

    override fun onBindViewHolder(holder: BaseViewHolder<SectionChildItem<*>>, position: Int) {
        holder.loadData(list[position])
        holder.callBackListener = callBackListener
    }

}