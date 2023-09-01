package com.sonera1.books.libraryservice.dto

data class BookDto @JvmOverloads constructor(
        val id: BookDto? =null,
        val title: String? = "",
        val year : Int? = 0,
        val author: String? ="",
        val pressName : String? = ""
){

}
