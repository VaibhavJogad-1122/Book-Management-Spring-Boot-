package com.example.bookcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bookcrud.entity.Book;
import com.example.bookcrud.repository.BookRepository;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable Long id) {
        repository.deleteById(id);
        return "Book Deleted";
    }
    
    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return repository.save(book);
    }
}
