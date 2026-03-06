/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.SpringUp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
/**
 *
 * @author gerald
 */
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    @Column(nullable = false)
    private String name;

    private String biography;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval=true)
    private List<Book> books = new ArrayList<>();
    // Constructors, getters, and setters
    public Author() {
    }// End of default constructor

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }// End of constructor 
    
    public Long getAuthorId() {
        return authorId;
    }// End of getAuthorId method

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }// End of setAuthorId method

    public String getName() {
        return name;
    }// End of getName method

    public void setName(String name) {
        this.name = name;
    }// End of setName method

    public String getBiography() {
        return biography;
    }// End of getBiography method

    public void setBiography(String biography) {
        this.biography = biography;
    }// End of setBiography method

    public List<Book> getBooks() {
        return books;
    }// End of getBooks method

    public void setBooks(List<Book> books) {
        this.books = books;
    }// End of setBooks method
}// End of Author class
