package com.ashokIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class DemoController
{
    @GetMapping("/welcome")
    public String welcomeMsg(Model model)
    {
        model.addAttribute("msg","Welcome to AshokIT");

            int i = 10 / 0;
        return "index";
    }


}
