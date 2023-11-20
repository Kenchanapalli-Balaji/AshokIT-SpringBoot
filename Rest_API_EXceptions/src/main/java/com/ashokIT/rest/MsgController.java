package com.ashokIT.rest;

import com.ashokIT.exception.ExInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class MsgController
{
    @GetMapping("/welcome")
    public String welcomeMsg()
    {
        int i=10/0;
        return "Welcome to AshokIT";
    }


}
