package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String user(){
        //String string = "Apple";
        return "/user/userinfo.html"; //go to 'static' folder and look for 'userinfo.html' in 'user' directory
    }










}
