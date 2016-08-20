package com.mycompany.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
    
    @RequestMapping(value = "/pessoa", method = RequestMethod.GET)
    @JsonView(People.class)
    public People pessoave() throws JsonProcessingException {
        System.out.println("Pessoa");
        People p = new People(Long.MIN_VALUE, "Willian M. Freire");
        
        return p;
    }
    
}
