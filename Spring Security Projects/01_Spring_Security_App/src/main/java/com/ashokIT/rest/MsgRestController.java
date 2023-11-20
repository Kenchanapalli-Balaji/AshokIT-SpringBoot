package com.ashokIT.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController
{
    @GetMapping("/welcome")
    public String welcomeMsg()
    {
        return " Hello Balaji, Welcome to AshokIT";
    }
    @GetMapping("/greet")
    public String greetMsg()
    {
        return "Very Good Morning!... Balaji";
    }

}
