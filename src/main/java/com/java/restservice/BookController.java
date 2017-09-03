package com.java.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {



    @RequestMapping("/books")
    public String listBooks()
    {
        return "bookslist";
    }
}