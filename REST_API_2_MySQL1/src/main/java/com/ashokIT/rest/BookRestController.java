package com.ashokIT.rest;

import com.ashokIT.binding.Book;
import com.ashokIT.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController
{
    @Autowired
    public BookService bookService;
    @PostMapping("/book")
    public String insert(@RequestBody Book book)
    {
        String status=bookService.upsert(book);
        System.out.println(book);
        return status;
    }
    @GetMapping("/getbook/{id}")
    public Book getBook(@PathVariable("id") Integer id)
    {
        Book b=bookService.getById(id);
        return b;
    }
    @GetMapping("/books")
    public List<Book> getBooks()
    {
        List<Book> books=bookService.getAllBooks();
        return books;
    }
}
