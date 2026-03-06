/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */

package com.example.SpringUp.dto;

import java.util.List;
/**
 *
 * @author gerald
 */
public record AuthorCreateDto(
    String name,
    String biography,
    List<Long> bookIds
) {

}
