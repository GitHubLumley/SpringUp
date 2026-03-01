/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.example.SpringUp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringUp.entity.Author;
/**
 *
 * @author gerald
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
