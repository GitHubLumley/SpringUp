/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.SpringUp.dto;

/**
 *
 * @author gerald
 */
public class BookResponseDto {

    private Long id;
    private String title;
    private Long authorId;
    private String authorName;

    public BookResponseDto() {
    }// End of default constructor

    public BookResponseDto(Long id, String title, Long authorId, String authorName) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.authorName = authorName;
    }// End of Constructor

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

    public Long getAuthorId() {
        return authorId;
    }// End of getAuthorId

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }// End of setAuthorId

    public String getAuthorName() {
        return authorName;
    }// End of getAuthorName

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }// End of setAuthorName

}// End of Class
