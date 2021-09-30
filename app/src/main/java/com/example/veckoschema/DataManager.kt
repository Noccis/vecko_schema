package com.example.veckoschema

object DataManager {
    val images = mutableListOf<Image>()

    init {
        DataManager.createMockData()
    }

    fun createMockData() {

        images.add(Image(R.drawable.frukost, "Frukost"))
        images.add(Image(R.drawable.borstatander, "Borsta tänder"))
        images.add(Image(R.drawable.toalett, "Toalett"))
        images.add(Image(R.drawable.tvattahander, "Tvätta händer"))
        images.add(Image(R.drawable.klader, "Ta på kläder"))
        images.add(Image(R.drawable.ytterklader, "Ta på ytterkläder"))
    }
}