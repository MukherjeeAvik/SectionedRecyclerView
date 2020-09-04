# SectionedRecyclerView

Often developing for apps  that boast just content, we often encounter a common design that shows different kinds of cards on a screen arranged either horizontally or vertically.

Given a similar assignment, without using any third party library, I decided to make a common framework that can be reused throughout the app or on other apps.

![the basic idea](https://mysmartnet.com/images/tutorial_001.jpg)

The underlying philosophy is as below:
 
Each stack of cards is a block, which has an optional header, footer and a body. This block respects the contract of a sectionBlock.

Body of each block may have different elements marked as Item1,Item2 and Item3.

Each type of element to be displayed has to respect the contract of SectionChild , which requires a viewHolder  and a layout.

**Define every item of the RecyclerView with a SectionChildItem contract**

```kotlin 
    data class HorizontalMovieItem
    (val movieName:String,
    val moviePosterImage:String,
    val movieRating:String)
    :SectionChildItem<MovieItemHorizontalViewHolder>{

    override fun getLayoutRes() = R.layout.movie_detail_horizontal_item

    override fun getViewHolder() = MovieItemHorizontalViewHolder::class.java
}

data class MovieHeaderItem                                             
    (val movieGenre:String)                                            
    :SectionChildItem<MovieHeaderViewHolder>{                          
                                                                       
    override fun getLayoutRes() = R.layout.movie_header_item           
                                                                       
    override fun getViewHolder() = MovieHeaderViewHolder::class.java   
                                                                       
}
```

**Define a content block for a each section**  

```kotlin
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
        
  ``` 
        
        
  **Make similar section blocks for different sections in the screen and add it the SectionAdapter**
  ```kotlin
   
         val adapter = SectionedAdapter { clickedItem ->
        
              when(clickedItem) {
                // listen for clicks of different types
                // and do actions accordingly
              
              }
    
        }
        adapter.addAll(getContent())
        contentList.adapter = adapter
  ```
       
