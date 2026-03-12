package com.example.bookcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookcrud.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}