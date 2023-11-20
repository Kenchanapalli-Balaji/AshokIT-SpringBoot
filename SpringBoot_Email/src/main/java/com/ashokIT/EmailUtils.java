package com.ashokIT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtils
{
    @Autowired
   private  JavaMailSender javaMailSender;

    public void sendMail()
    {
        SimpleMailMessage msg=new SimpleMailMessage();
        msg.setTo("balajikallur321@gmail.com");
        msg.setSubject("Spring Boot Email Testing");
        msg.setText("This i stest Body only");
        javaMailSender.send(msg);
    }
}
