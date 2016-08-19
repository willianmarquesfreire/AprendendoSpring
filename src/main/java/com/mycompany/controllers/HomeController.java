package com.mycompany.controllers;

import com.mycompany.model.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index() {
        System.out.println("entrou");
        People p = new People(Long.valueOf(15), "Willian");
        return p.toString();
    }
    
}
