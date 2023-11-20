package com.ashokit.controller;

import com.ashokit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController
{
    @GetMapping("/")
    public String loadForm(Model model)
    {
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping("/user")
    public String handleSubmitBtn(User user,Model model)
    {
        System.out.println(user);
        model.addAttribute("msg","User Data saved Successfully!!!");
        return "success";
    }

}
