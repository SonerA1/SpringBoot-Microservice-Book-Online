package com.sonera1.books.libraryservice.repository;

import com.sonera1.books.libraryservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, String > {
}
