package com.caremore.mobile.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
 
        String message = "Hello World, Welcome to Caremore Mobile App";
        return new ModelAndView("hello", "message", message);
    }
    
    @RequestMapping("/about-us")
    public ModelAndView aboutus() {
 
        String message = "Welcome to Caremore. We care more. That is what we do!";
        return new ModelAndView("hello", "message", message);
    }
    
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    
}