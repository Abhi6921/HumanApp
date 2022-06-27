package com.abhicoder.humanapp

data class MyDataItem(
    // match spells correctly otherwise wont work
    // use serialize name annotation
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)