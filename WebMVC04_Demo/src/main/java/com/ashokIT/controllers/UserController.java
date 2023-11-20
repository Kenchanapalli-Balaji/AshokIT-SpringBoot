package com.ashokIT.controllers;

import com.ashokIT.entities.User;
import com.ashokIT.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController
{
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String loadForm(Model model)
    {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/user")
    public  String handleSubmitBtn(User user, Model model)
    {
        System.out.println(user);
       boolean saveuser= userService.saveUser(user);
        if(saveuser)
        {
            model.addAttribute("msg","User Data Saved SuccessFully with User Id: "+user.getId());
        }
        return "index";
    }

    @GetMapping("/users")
    public String viewusers(Model model)
    {
        List<User> allUsers=userService.getAllUsers();
        model.addAttribute("users",allUsers);
        return "view_Users";
    }
}
