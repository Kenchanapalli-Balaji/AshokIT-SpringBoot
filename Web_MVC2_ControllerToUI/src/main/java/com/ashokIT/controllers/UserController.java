package com.ashokIT.controllers;

import com.ashokIT.bindings.User;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController
{
    @GetMapping("/users")
    public String getUsersData(Model model)
    {
        User o1=new User(1,"Balaji","Balaji123@gmail.com");
        User o2=new User(2,"Sushanth","Sushanth123@gmail.com");
        User o3=new User(3,"Darshan","Darshan123@gmail.com");
       List<User> userList= Arrays.asList(o1,o2,o3);
       model.addAttribute("users",userList);
       return "users_data";
    }
    @GetMapping("/user")
    public String getUser(Model model)
    {
        User ob1=new User(1,"Balaji","Kalur@123");
        model.addAttribute("user",ob1);
        return "user_info";
    }
    @GetMapping("/name")
    public ModelAndView getUserName()
    {
        ModelAndView mav=new ModelAndView();
        mav.addObject("Name", "Balaji");
        mav.setViewName("name");
        return mav;
    }
    @GetMapping("/mail")
     public String getUserMail(Model model)
     {
         model.addAttribute("mail","Balu123@gmail.com");
         return "mail";
     }
}
