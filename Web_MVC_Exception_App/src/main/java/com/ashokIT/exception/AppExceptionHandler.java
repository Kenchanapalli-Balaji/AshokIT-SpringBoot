package com.ashokIT.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
@ControllerAdvice
public class AppExceptionHandler
{
    @ExceptionHandler(value= Exception.class)
    public String handleAe(Exception ex, Model model)
    {
        model.addAttribute("rsn",ex.getMessage());
        model.addAttribute("date", LocalDateTime.now());
        return "error";
    }
}
