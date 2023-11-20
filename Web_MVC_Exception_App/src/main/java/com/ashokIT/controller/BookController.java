package com.ashokIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController
{
    @GetMapping("/book")
    public String bookController(Model model)
    {
        model.addAttribute("msg","No short cut for success");
        String s=null;
        s.length();
        return "index";
    }
}
