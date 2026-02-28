package com.example.SpringUp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringUp.entity.Book;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author gerald
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
