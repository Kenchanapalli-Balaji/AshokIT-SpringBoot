package com.ashokIT.rest;

import com.ashokIT.exception.ProductNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product
{
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable ("id") Integer id)
    {
        if(id>100)
            throw new ProductNotFoundException("Product id is InValid");
        return "PEN - 100 INR";
    }
}
