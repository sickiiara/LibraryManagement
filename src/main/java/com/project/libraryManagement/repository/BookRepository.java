package com.project.libraryManagement.repository;

import com.project.libraryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Metodi di base ereditati da JpaRepository
}