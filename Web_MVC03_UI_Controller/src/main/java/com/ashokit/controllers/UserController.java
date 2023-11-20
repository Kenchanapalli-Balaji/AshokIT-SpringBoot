package com.ashokit.controllers;

import com.ashokit.entity.User;
import com.ashokit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController
{
    @Autowired
    private UserService service;
    @GetMapping("/")
    public String loadForm(Model model)
    {
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping("/user")
    public String handleSubmitBtn(User user, Model model)
    {
        System.out.println(user);
       boolean saveUser=service.saveUser(user);
       if(saveUser) {
           model.addAttribute("msg", "User Data saved Successfully..!!!");
       }
        return "index";
    }
    @GetMapping("/users")
    public String viewUsers(Model model)
    {
        List<User> allUsers=service.getAllUsers();
        model.addAttribute("users",allUsers);
        return "viewUsers";
    }
}
