package com.ashokIT.binding;

import org.springframework.web.bind.annotation.RestController;

public class Book
{
    private Integer bookid;
    private String name;
    private Double price;
    public Book(){}

    public Book(Integer bookid, String name, Double price) {
        this.bookid = bookid;
        this.name = name;
        this.price = price;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
