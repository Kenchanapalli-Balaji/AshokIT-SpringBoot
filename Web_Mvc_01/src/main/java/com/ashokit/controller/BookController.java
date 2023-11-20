package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController
{
    public  BookController()
    {
        System.out.println("BookController Constructor ");
    }

    @GetMapping("/book")
    public ModelAndView getBookData()
    {
        ModelAndView mav=new ModelAndView();
        mav.addObject("Id",101);
        mav.addObject("Name","JAVA");
        mav.addObject("Price",10000);
        mav.setViewName("book");
        return mav;
    }
}
