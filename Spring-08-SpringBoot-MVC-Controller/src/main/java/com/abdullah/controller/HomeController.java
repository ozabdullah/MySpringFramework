package com.abdullah.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller  //dispatcher server is gonna take the request and pass to business logic, it's gonna create object from the class
public class HomeController {


    @RequestMapping("/")  // localhost:8080/
    public String getRequestMapping(){

        return "home";  // return the view --> home.html
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ozzy")  // localhost:8080/ozzy
    public String getRequestMapping2(){

        return "home";  // return the view
    }

    @RequestMapping(method = RequestMethod.POST, value = "/ozzy")  // localhost:8080/ozzy
    public String getRequestMapping3(){

        return "home";  // return the view
    }

    @GetMapping("/spring")  // instead of writing Get parameters into @RequestMapping(GET) we can use @GetMapping annotation
    public String getMappingEx(){

        return "home";
    }


    @PostMapping("/spring")
    public String getMappingEx2(){

        return "home";
    }

    @GetMapping("/home{name}")
    public String patVariableEx(@PathVariable("name") String name){

        System.out.println("name is "+name);

        return "home";
    }

    @GetMapping("/home{name}/{email}")
    public String patVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){

        System.out.println("email is "+email);

        return "home";
    }

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("course is "+course);
        return "home";
    }

    @GetMapping(value = "home/course2")
    public String requestParamEx2(@RequestParam(value = "course2", required = false, defaultValue = "Cybertek") String name ){
        System.out.println("name is "+name);

        return "home";
    }

    }



