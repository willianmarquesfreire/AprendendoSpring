package com.mycompany.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping(value = "/home")
    public String index() {
        System.out.println("entrou");
        return "Aqui";
    }
    
}
