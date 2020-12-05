package com.abdullah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")  // uri+student
public class StudetnController {

    @GetMapping("/show")   // uri/student/show
    public String showForm(){

        //System.out.println("show");
        return "home";
    }
}
