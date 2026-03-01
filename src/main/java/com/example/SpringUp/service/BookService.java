/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.SpringUp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringUp.dto.BookCreateDto;
import com.example.SpringUp.dto.BookResponseDto;
import com.example.SpringUp.entity.Book;
import com.example.SpringUp.entity.Author;
import com.example.SpringUp.repository.AuthorRepository;
import com.example.SpringUp.repository.BookRepository;
/**
 *
 * @author gerald
 */
@Service
@Transactional
public class BookService {
 
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }//end of constructor

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }//end of getAllBooks

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(RuntimeException::new);
    }//end of getBookById

    public BookResponseDto createBook(BookCreateDto bookCreateDto) {
        Author author = authorRepository.findById(bookCreateDto.getAuthorId())
            .orElseThrow(() -> new RuntimeException("Author not found"));
        Book book = new Book();
        book.setTitle(bookCreateDto.getTitle());
        book.setAuthor(author);
        Book savedBook = bookRepository.save(book);
        return mapToResponseDto(savedBook);
    }//end of createBook

    private BookResponseDto mapToResponseDto(Book book) {
        BookResponseDto dto = new BookResponseDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthorId(book.getAuthor().getAuthorId());
        dto.setAuthorName(book.getAuthor().getName());
        return dto;
    }//end of mapToResponseDto

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElse(null);
        if (book != null) {
            book.setTitle(bookDetails.getTitle());
            return bookRepository.save(book);
        }
        return null;
    }//end of updateBook

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }//end of deleteBook

}
