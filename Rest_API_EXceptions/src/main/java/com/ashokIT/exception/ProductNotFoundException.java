package com.ashokIT.exception;

public class ProductNotFoundException extends RuntimeException
{
    public ProductNotFoundException(){}
    public ProductNotFoundException(String msg)
    {
        super(msg);
    }
}
