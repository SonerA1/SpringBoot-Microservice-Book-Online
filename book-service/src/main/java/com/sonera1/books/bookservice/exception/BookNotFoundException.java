package com.sonera1.books.bookservice.exception;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String s){
        super(s);
    }
}
