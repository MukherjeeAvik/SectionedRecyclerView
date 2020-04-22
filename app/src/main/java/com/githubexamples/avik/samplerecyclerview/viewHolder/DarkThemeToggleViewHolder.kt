package com.githubexamples.avik.samplerecyclerview.viewHolder

import android.view.View
import com.githubexamples.avik.samplerecyclerview.R
import com.githubexamples.avik.samplerecyclerview.models.DarkModeSwitchItem
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.BaseViewHolder
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.SectionChildItem
import kotlinx.android.synthetic.main.theme_swith_item.view.*

class DarkThemeToggleViewHolder(private val passedView: View) :
    BaseViewHolder<SectionChildItem<*>>(passedView) {

    override fun loadData(receivedData: SectionChildItem<*>) {
        receivedData as DarkModeSwitchItem

        if (receivedData.isEnabled) {
            passedView.enableDarkModeDesc.text = passedView.context.getString(R.string.disable_dark_mode_txt)
        } else {
            passedView.enableDarkModeDesc.text = passedView.context.getString(R.string.enable_dark_mode)

        }

        passedView.darkModeSwitch.setOnClickListener {
            if (receivedData.isEnabled) {
                passedView.enableDarkModeDesc.text = passedView.context.getString(R.string.disable_dark_mode_txt)
                receivedData.isEnabled = false
                callBackListener.invoke(receivedData)
            } else {
                receivedData.isEnabled = true
                passedView.enableDarkModeDesc.text = passedView.context.getString(R.string.enable_dark_mode)
                callBackListener.invoke(receivedData)

            }
        }
    }

    override lateinit var callBackListener: (SectionChildItem<*>) -> Unit

}