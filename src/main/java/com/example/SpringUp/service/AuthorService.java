/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.SpringUp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringUp.dto.AuthorCreateDto;
import com.example.SpringUp.entity.Author;
import com.example.SpringUp.entity.Book;
import com.example.SpringUp.repository.AuthorRepository;
import com.example.SpringUp.repository.BookRepository;
/**
 *
 * @author gerald
 */

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Author createAuthor(AuthorCreateDto authorCreateDto) {
        Author author = new Author();
        author.setName(authorCreateDto.name());
        author.setBiography(authorCreateDto.biography());

        if (authorCreateDto.bookIds() != null) {
            List<Book> books = bookRepository.findAllById(authorCreateDto.bookIds());
            for (Book book : books) {
                book.setAuthor(author);
            }
            bookRepository.saveAll(books);
        }
        return authorRepository.save(author);
    }
}
