package com.ashokit.services;

import com.ashokit.entities.ProductEntity;
import com.ashokit.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepo productRepo;

    public void saveProducts()
    {
        ProductEntity p1=new ProductEntity(1,"Laptop",5000);
        ProductEntity p2=new ProductEntity(2,"Mobile",10000);
        ProductEntity p3=new ProductEntity(3,"Keyboard",600);
        ProductEntity p4=new ProductEntity(4,"Mouse",200);
        ProductEntity p5=new ProductEntity(5,"LG TV",50000);
       productRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
    }
    public void getProducts()
    {
        List<ProductEntity> records=productRepo.findAll(Sort.by("productPrice").descending());
        records.forEach(e->System.out.println(e));
    }

    public <Page> void pagination()
    {
        int pagaSize=3;
        int pageNum=1;
        PageRequest of=PageRequest.of(pageNum,pagaSize);
        org.springframework.data.domain.Page<ProductEntity> page=  productRepo.findAll(of);
        List<ProductEntity> records=page.getContent();
        records.forEach(e->System.out.println(e));

    }

    public void queryByExample()
    {
        ProductEntity product=new ProductEntity();
        product.setProductName("Mobile");
        List<ProductEntity> products=productRepo.findAll(Example.of(product));
        products.forEach(p->System.out.println(p));
    }

}
