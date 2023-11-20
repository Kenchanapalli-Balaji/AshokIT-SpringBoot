package com.ashokIT.rest;

import com.ashokIT.EmailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailRestController
{
    @Autowired
    private EmailUtils emailUtils;
    @GetMapping("/email")
    public String  sendEmail()
    {
        emailUtils.sendMail();
        return "Email Sent Successfully";
    }
}
