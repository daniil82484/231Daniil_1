package com.mob5.a231daniil_1.recadapters

import com.mob5.a231daniil_1.R

data class feel(val image:Int, val name_feel:String)
class MyData{val  list = arrayListOf(
    feel(R.drawable.ic_calm,"Спокойным"),
    feel(R.drawable.ic_relax,"Расслабленным"),
    feel(R.drawable.ic_focus,"Сосредоточеным"),
    feel(R.drawable.ic_anxious,"Взволнованным")
    )
}
data class state(val title:String,val text_state:String,val  image_state: Int)
class MyState{
    val state_list = arrayListOf(state("1","2",R.drawable.ic_calm))
}