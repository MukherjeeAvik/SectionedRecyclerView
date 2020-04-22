# SectionedRecyclerView

Often developing for apps  that boast just content, we often encounter a common design that shows different kinds of cards on a screen arranged either horizontally or vertically.

Given a similar assignment, without using any third party library, I decided to make a common framework that can be reused throughout the app or on other apps.

The underlying philosophy is as below:
 
Each stack of cards is a block, which has a header, footer and a body. This block respects the contract of a sectionBlock

Body of each block can have different elements.

Each type of element to be displayed has to respect the contract of SectionChild , which requires a viewHolder  and a layout

