package com.ashokIT.rest;

import com.ashokIT.binding.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookRestController
{
    @GetMapping("/books")
    public List<Book> getBooks()
    {
        Book b1=new Book(1,"Java",1000.00);
        Book b2=new Book(2,"Python",1200.00);
        Book b3=new Book(3,"Mysql",1300.00);
        List<Book> books= Arrays.asList(b1,b2,b3);
        return books;
    }

    @PostMapping("/book")
    public String saveBook(Book book)
    {
        System.out.println(book);
        return "Book saved";
    }

}
