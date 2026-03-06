/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.SpringUp.dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author gerald
 */
public record BookCreateDto(

    @NotBlank
    String title,

    Long authorId
) {
}
