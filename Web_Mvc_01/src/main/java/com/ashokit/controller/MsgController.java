package com.ashokit.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController
{
    public MsgController()
    {
        System.out.println("Constructor MsgController");
    }
    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg()
    {
        ModelAndView mav=new ModelAndView();
        //setting data in keyvalue format to access in view page for UI
        mav.addObject("msg","Welcome to Ashok IT");
        //return view file name
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView getGreetMsg()
    {
        ModelAndView mav=new ModelAndView();
        mav.addObject("msg","All the Best");
        mav.setViewName("index");
        return  mav;
    }
}
