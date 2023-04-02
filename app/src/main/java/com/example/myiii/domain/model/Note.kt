package com.example.myiii.domain.model



class Note(
    val id: Int = DEFAULT_ID,
    val title: String,
    val description: String
){
    companion object{
        const val DEFAULT_ID = 0
    }

}