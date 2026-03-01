package com.example.SpringUp.controller;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.function.Function;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import com.example.SpringUp.entity.Book;
import com.example.SpringUp.service.BookService;
import com.example.SpringUp.dto.BookCreateDto;
import com.example.SpringUp.dto.BookResponseDto; 

/**
 *
 * @author gerald
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }//end of constructor

    @GetMapping
    public List<BookResponseDto> getAllBooks() {
        return bookService.getAllBooks().stream().map(bookService::mapToResponseDto).toList();
    }//end of getAllBooks

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }//end of getBookById

    @PostMapping
    public ResponseEntity<BookResponseDto> createBook(@Valid @RequestBody BookCreateDto dto) throws URISyntaxException {
        BookResponseDto bookResponseDto = bookService.createBook(dto);
        return ResponseEntity.created(new URI("/books/" + bookResponseDto.getId())).body(bookResponseDto);
    }//end of createBook

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book book = bookService.updateBook(id, bookDetails);
        if (book != null) {
            Book updatedBook = bookService.updateBook(id, bookDetails);
            return ResponseEntity.ok(updatedBook);
        }
        return ResponseEntity.notFound().build();
    }//end of updateBook

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        if (bookService.getBookById(id) != null) {
            bookService.deleteBook(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }//end of deleteBook
}
