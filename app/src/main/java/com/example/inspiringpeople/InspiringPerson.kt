package com.example.inspiringpeople

class InspiringPerson(private val name: String, private val birth: String, private val description: String,
                      private val imageUrl: String, private val quotes: List<String>)
{
    fun getName(): String { return name }
    fun getBirth(): String { return birth }
    fun getDescription(): String { return description }
    fun getImageUrl(): String { return imageUrl }
    fun getQuotes(): List<String> { return quotes }
}