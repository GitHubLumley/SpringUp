/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.SpringUp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author gerald
 */
@Controller
public class ErrorController {
    @RequestMapping("/error")
    public String handleError(@RequestParam String param) {
        return new StringBuilder("Error: ").append(param).toString();
    }
    
}
