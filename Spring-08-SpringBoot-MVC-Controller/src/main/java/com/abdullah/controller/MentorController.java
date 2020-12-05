package com.abdullah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // object create
@RequestMapping("/mentor") //uri/mentor
public class MentorController {

    @GetMapping("/show")  //uri/mentor/show
    public String showForm(){

        //System.out.println("show");
        return "home";
    }
}
