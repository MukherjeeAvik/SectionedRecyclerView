package com.githubexamples.avik.samplerecyclerview

import android.app.Application

class MyApplication: Application() {
    private var darkMode = false
    fun enableDarkMode(){
        darkMode = true
    }
    fun disableDarkMode(){
        darkMode = false
    }
    fun getDarkModeStatus() = darkMode

}