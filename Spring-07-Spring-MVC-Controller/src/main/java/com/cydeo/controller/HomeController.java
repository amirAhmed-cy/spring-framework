package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller is endpoint dispatcher
@Controller //Anotate the class with the @Controller stereotype annotation
public class HomeController {

    @RequestMapping("/home") // @RequestMapping annotation to associate the action with an HTTP request path- endpoint
    public String home(){
        return "home.html"; //Return the HTML document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/welcome.html"; //go to the static folder and look for this file
    }

//    @RequestMapping("/")
//    public String welcome2(){
//        return "welcome.html";
//    }

    @RequestMapping
    public String welcome2(){
        return "/welcome.html";
    }









}