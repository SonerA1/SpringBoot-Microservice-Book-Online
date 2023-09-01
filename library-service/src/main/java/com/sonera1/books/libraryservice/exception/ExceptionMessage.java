package com.sonera1.books.libraryservice.exception;

public record ExceptionMessage (String timestamp,
                                int status,
                                String error,
                                String message,
                                String path){}
