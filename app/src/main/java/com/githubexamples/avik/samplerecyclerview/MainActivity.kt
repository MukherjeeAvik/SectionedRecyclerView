package com.githubexamples.avik.samplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import com.githubexamples.avik.samplerecyclerview.models.*
import com.githubexamples.avik.samplerecyclerview.sectionedRecylerView.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setUpAdapter()

    }

    private fun setUpAdapter() {
        val adapter = SectionedAdapter { clickedItem ->
            if (clickedItem is DarkModeSwitchItem) {
                if (clickedItem.isEnabled) {
                    (application as MyApplication).enableDarkMode()
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES); //For night mode theme

                } else {

                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //To Disable night mode theme
                    (application as MyApplication).disableDarkMode()
                }
            }

        }
        adapter.addAll(getContent())
        contentList.adapter = adapter
    }

    private fun getContent(): List<SectionBlock<SectionChildItem<*>>> {
        val actionMovies = ContentBlock().apply {
            sectionHeader = MovieHeaderItem("Action")
            contentList = arrayListOf<SectionChildItem<*>>(
                HorizontalMovieItem(
                    "Bad Boys 2",
                    getRandomImagePath(),
                    "6.6"
                ),
                SubscriptionInfoItem("499"),
                HorizontalMovieItem(
                    "The Fast " +
                            "and Furious",
                    getRandomImagePath(),
                    "6.1"
                ),
                HorizontalMovieItem(
                    "The Police Story",
                    getRandomImagePath(),
                    "7.1"
                )


            )
            sectionFooter = MovieFooterItem("24")
            orientation = Orientation.HORIZONTAL

        }
        val themeSwitcherHeader = ContentBlock().apply {
            sectionHeader = DarkModeSwitchItem((application as MyApplication).getDarkModeStatus())
        }

        val comedyMovies = ContentBlock().apply {
            sectionHeader = MovieHeaderItem("Comedy")
            contentList = arrayListOf<VerticalMovieItem>(
                VerticalMovieItem(
                    "21 jump street",
                    getRandomImagePath(),
                    "6.7"
                ),
                VerticalMovieItem(
                    "The Hangover 2",
                    getRandomImagePath(),
                    "7.7"
                ),
                VerticalMovieItem(
                    "The Dictator",
                    getRandomImagePath(),
                    "6.8"
                )
            )
            sectionFooter = MovieFooterItem("31")
            orientation = Orientation.VERTICAL

        }


        return listOf<SectionBlock<SectionChildItem<*>>>(
            actionMovies,
            themeSwitcherHeader,
            comedyMovies
        )

    }

    private fun getRandomImagePath(): String {
        val imageNumber = (1..5).shuffled().last().toString()
        return resources.getString(R.string.dummy_poster_url, imageNumber)
    }


}

