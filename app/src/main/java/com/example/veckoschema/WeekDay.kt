package com.example.veckoschema

class WeekDay(val name: String, val color: Int) {

    init {
        var pictureList = mutableListOf<ActionPicture>()

        val clothes = ActionPicture(R.drawable.klader)
        val brushTeeth = ActionPicture(R.drawable.borstatander)
        val breakfast = ActionPicture(R.drawable.frukost)

        pictureList.add(clothes)
        pictureList.add(brushTeeth)
        pictureList.add(breakfast)

    }




}