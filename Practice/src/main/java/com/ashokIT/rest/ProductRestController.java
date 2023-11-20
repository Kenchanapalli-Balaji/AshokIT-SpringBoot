package com.ashokIT.rest;

import com.ashokIT.entities.Product;
import com.ashokIT.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.PrimitiveIterator;

@RestController
public class ProductRestController
{
    @Autowired
    public ProductService productService;
    @PostMapping("/product")
    public String save(@RequestBody  Product product)
    {
        String status=productService.saveProduct(product);
        System.out.print(product);
        return status;
    }
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Integer id)
    {
       Product p= productService.getProduct(id);
       return p;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        List<Product> products=productService.getAllProducts();
        return products;
    }
}
