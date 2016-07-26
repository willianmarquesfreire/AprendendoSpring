/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gumga.aprendendospring.AprendendoSpring.api;

import gumga.framework.presentation.GumgaAPI;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author munif
 */
@RestController
@RequestMapping("/api/people")
public class PeopleAPI {
    
    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public String teste(String a) {
        System.out.println("aa");
        
        return "a";

    }
}
