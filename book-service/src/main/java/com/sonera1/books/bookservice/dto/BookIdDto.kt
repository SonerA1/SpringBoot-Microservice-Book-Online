package com.sonera1.books.bookservice.dto

class BookIdDto @JvmOverloads constructor(
        val bookId: String? = "",
        val isbn: String
) {
    companion object {
        @JvmStatic
        fun convert(id: String, isnb: String): BookIdDto{
            return BookIdDto(id, isnb)
        }
    }
}