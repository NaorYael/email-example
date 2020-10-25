package com.emailexample.controller;

import com.emailexample.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author naor.
 * @created 05/10/2020 - 16:50
 * @project email-example
 */

@Controller
public class MyController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() {

        emailService.sendMail("example@example.com", "Test Subject", "Test mail");

        return "emailsent";
    }
}
