package com.githubexamples.avik.samplerecyclerview.models

import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import com.githubexamples.avik.samplerecyclerview.viewHolder.SubscriptionInfoViewHolder

data class SubscriptionInfoItem
    (val fee:String)
    : SectionChildItem<SubscriptionInfoViewHolder> {

    override fun getLayoutRes() = R.layout.subscription_card_item

    override fun getViewHolder() = SubscriptionInfoViewHolder::class.java

}