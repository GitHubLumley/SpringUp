/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.SpringUp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author gerald
 */
public class BookCreateDto {

    @NotBlank
    private String title;

    @NotNull
    private Long authorId;

    public BookCreateDto() {
    }// End of default constructor

    public BookCreateDto(String title, Long authorId) {
        this.title = title;
        this.authorId = authorId;
    }// End of constructor

    public String getTitle() {
        return title;
    }// End of getTitle

    public void setTitle(String title) {
        this.title = title;
    }// End of setTitle

    public Long getAuthorId() {
        return authorId;
    }// End of getAuthorId

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }// End of setAuthorId

}// End of Class
