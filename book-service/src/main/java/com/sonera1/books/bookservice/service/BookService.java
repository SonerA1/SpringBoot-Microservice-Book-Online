package com.sonera1.books.bookservice.service;

import com.sonera1.books.bookservice.dto.BookDto;
import com.sonera1.books.bookservice.dto.BookIdDto;
import com.sonera1.books.bookservice.exception.BookNotFoundException;
import com.sonera1.books.bookservice.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

     public List<BookDto> getAllBooks(){
        return repository.findAll()
                .stream()
                .map(BookDto::convert)
                .collect(Collectors.toList());
     }
     public BookIdDto findByIsbn(String isbn){
        return repository.findBookByIsbn(isbn)
                .map(book -> new BookIdDto(book.getId(),book.getIsbn()))
                .orElseThrow(() -> new BookNotFoundException("Book could not found by isbn: " + isbn));
     }

     public BookDto findBookDetailsById(String id){
        return repository.findById(id)
                .map(BookDto::convert)
                .orElseThrow(() -> new BookNotFoundException("Book could not found by id: " + id));
     }
}
