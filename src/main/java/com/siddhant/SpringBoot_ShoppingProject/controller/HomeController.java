package com.siddhant.SpringBoot_ShoppingProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet()
    {
        return "I'm Siddhant";
    }

    @RequestMapping("/about")
    public int Int()
    {
        return 10;
    }

}
