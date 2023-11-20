package com.ashokIT.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookException
{
    @GetMapping("/book")
    public String getBook()
    {
        String s=null;
        s.length();
        return "JAVA";
    }
}
