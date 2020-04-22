# SectionedRecyclerView

Often developing for apps  that boast just content, we often encounter a common design that shows different kinds of cards on a screen arranged either horizontally or vertically.

Given a similar assignment, without using any third party library, I decided to make a common framework that can be reused throughout the app or on other apps.

![the basic idea](https://mysmartnet.com/images/tutorial_001.jpg)

The underlying philosophy is as below:
 
Each stack of cards is a block, which has an optional header, footer and a body. This block respects the contract of a sectionBlock.

Body of each block may have different elements marked as Item1,Item2 and Item3.

Each type of element to be displayed has to respect the contract of SectionChild , which requires a viewHolder  and a layout

