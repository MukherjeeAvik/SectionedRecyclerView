package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.githubexamples.avik.samplerecyclerview.R
import kotlinx.android.synthetic.main.generic_sectioned_parent_layout.view.*

class SectionedParentViewHolder(
    private val passedView: View,
    override var callBackListener: (SectionChildItem<*>) -> Unit
) :
    BaseViewHolder<SectionBlock<SectionChildItem<*>>>(passedView) {
    override fun loadData(receivedData: SectionBlock<SectionChildItem<*>>) {

        val sectionHeader = receivedData.getHeader()
        sectionHeader?.let {
            val headerView = LayoutInflater.from(passedView.context)
                .inflate(it.getLayoutRes(), null, false)
            passedView.sectionParent.addView(headerView, 0)
            val headerViewHolder =
                it.getViewHolder().getConstructor(View::class.java).newInstance(headerView)
            (headerViewHolder as BaseViewHolder<SectionChildItem<*>>).loadData(it)
             headerViewHolder.callBackListener = callBackListener


        }


        val sectionFooter = receivedData.getFooter()
        sectionFooter?.let {
            val footerView = LayoutInflater.from(passedView.context)
                .inflate(it.getLayoutRes(), null, false)
            passedView.sectionParent.addView(footerView)
            val footerViewHolder =
                it.getViewHolder().getConstructor(View::class.java).newInstance(footerView)
            (footerViewHolder as BaseViewHolder<SectionChildItem<*>>).loadData(it)
            footerViewHolder.callBackListener = callBackListener
        }

        val contentList = receivedData.getListOfItems()
        contentList?.let { listOfContents ->

            val sectionChildAdapter = SectionChildAdapter{
                 callBackListener.invoke(it)
            }

            listOfContents.forEach {
                sectionChildAdapter.registerViewHolder(it.getLayoutRes(), it.getViewHolder())
            }

            sectionChildAdapter.addAll(listOfContents)
            var orientation = RecyclerView.HORIZONTAL
            if (receivedData.getOrientation() == Orientation.VERTICAL) {
                orientation = RecyclerView.VERTICAL
            }
            val layoutManager = LinearLayoutManager(passedView.context, orientation, false)
            passedView.parentSectionRecyclerView.layoutManager = layoutManager
            passedView.parentSectionRecyclerView.adapter = sectionChildAdapter
        }

    }

}