package com.example.SpringUp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name= "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    // Constructors, getters, and setters
    public Book() {
    }// End of default constructor

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }// End of constructor

    public Long getId() {
        return id;
    }// End of getId

    public void setId(Long id) {
        this.id = id;
    }// End of setId

    public String getTitle() {
        return title;
    }// End of getTitle

    public void setTitle(String title) {
        this.title = title;
    }// End of setTitle

    public Author getAuthor() {
        return author;
    }// End of getAuthor 

    public void setAuthor(Author author) {
        this.author = author;
    }// End of SetAuthor 
}// End of Book Class