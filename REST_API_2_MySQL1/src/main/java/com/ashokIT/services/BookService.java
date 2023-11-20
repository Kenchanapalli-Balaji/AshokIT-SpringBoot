package com.ashokIT.services;

import com.ashokIT.binding.Book;
import com.ashokIT.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService
{
    @Autowired
    public BookRepo bookRepo;

    public String upsert(Book book)
    {
        bookRepo.save(book);
        return "Succesfully Saved Data";
    }
    public Book getById(Integer id)
    {
        Optional<Book> findById=bookRepo.findById(id);
        if(findById.isPresent())
        {
            return findById.get();
        }
        return null;
    }
    public List<Book> getAllBooks()
    {
       return bookRepo.findAll();
    }

}
