package com.ashokIT.rest;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MsgRestController
{
    private org.slf4j.Logger logger=  LoggerFactory.getLogger(MsgRestController.class);
    @GetMapping("/welcome")
    public String welcomeMsg()
    {
        String msg= "Welcome to AshokIt";
        logger.trace("This is trace msg");
        logger.debug("This is debug msg");
        logger.info("This is info msg");
        logger.warn("This is warn msg");
        logger.error("This is error msg");

        return msg;
    }
}
