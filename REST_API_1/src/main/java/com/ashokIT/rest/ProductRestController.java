package com.ashokIT.rest;

import com.ashokIT.binding.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController
{
    @GetMapping("/product")
    public Product getProduct()
    {
        Product p=new Product(1,"Pen",10.00);
        return p;
    }

    @GetMapping("/productinfo/{id}")
    public Product productInfo(@PathVariable("id") Integer id)
    {
        Product p=new Product(id,"LAptop",1600.00);
        return p;
    }

}
