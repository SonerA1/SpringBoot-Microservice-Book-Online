package com.sonera1.books.bookservice.repository;

import com.sonera1.books.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String > {
    Optional<Book> findBookByIsbn(String isbn);
}
