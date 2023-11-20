package com.ashokIT.services;

import com.ashokIT.entities.Product;
import com.ashokIT.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{
    @Autowired
    public ProductRepo productRepo;

    public String saveProduct(Product product)
    {
       productRepo.save(product);
       return "Successfully Created ";
    }
    public Product getProduct(Integer id)
    {
        Optional<Product> findById=productRepo.findById(id);
        if(findById.isPresent())
            return findById.get();
        return null;
    }
    public List<Product> getAllProducts()
    {
        return productRepo.findAll();
    }
}
