package com.sonera1.books.libraryservice.exception;

public class LibraryNotFoundException  extends RuntimeException {

    public LibraryNotFoundException(String message){
        super(message);
    }

}
