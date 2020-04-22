package com.githubexamples.avik.samplerecyclerview.sectionedRecylerView

data class ContentBlock(
     var contentList: List<SectionChildItem<*>>? = null,
     var sectionHeader: SectionChildItem<*>? = null,
     var sectionFooter: SectionChildItem<*>? = null,
     var orientation: Int? = null)
    : SectionBlock<SectionChildItem<*>> {

    override fun getHeader() = sectionHeader

    override fun getListOfItems() = contentList

    override fun getOrientation() = orientation?:Orientation.VERTICAL

    override fun getFooter() = sectionFooter

}