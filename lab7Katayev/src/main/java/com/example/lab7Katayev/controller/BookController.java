package com.example.lab7Katayev.controller;

import com.example.lab7Katayev.entity.Book;
import com.example.lab7Katayev.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookRepository bookRepository;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookRepository.getOne(id);
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
