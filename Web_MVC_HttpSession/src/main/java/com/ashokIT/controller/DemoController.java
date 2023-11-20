package com.ashokIT.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController
{
    @GetMapping("/login")
    public String login(HttpServletRequest req, Model model)
    {
        String name=req.getParameter("name");
        System.out.println("Name  "+name);
        HttpSession session=req.getSession();
        session.setAttribute("name",name);
        model.addAttribute("msg","User Logged in (Session Created)");
        return "index";
    }
    @GetMapping("/dashboard")
    public String dashBoard(HttpServletRequest req, Model model)
    {
        HttpSession session=req.getSession();
        String name=(String)session.getAttribute("name");
        System.out.println("Name "+name);
        model.addAttribute("msg",name+" Welcome to our website ");
        return  "index";
    }
    @GetMapping("/logout")
    public  String logout(HttpServletRequest req, Model model)
    {
        HttpSession session=req.getSession();
        session.invalidate();
        model.addAttribute("msg","User logged out successfully");
        return "index";
    }
}
