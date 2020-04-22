package com.githubexamples.avik.samplerecyclerview.viewHolder

import android.view.View
import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.models.SubscriptionInfoItem
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.BaseViewHolder
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import kotlinx.android.synthetic.main.subscription_card_item.view.*

class SubscriptionInfoViewHolder(
    private val passedView: View

) : BaseViewHolder<SectionChildItem<*>>(passedView) {

    override fun loadData(receivedData: SectionChildItem<*>) {
        receivedData as SubscriptionInfoItem
        passedView.subInfoText.text = passedView.context.getString(R.string.subscription_text,receivedData.fee)
        itemView.setOnClickListener {
            callBackListener.invoke(receivedData)
        }
    }

    override lateinit var callBackListener: (SectionChildItem<*>) -> Unit


}