/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.additivesapi.controller;

import com.yritys.additivesapi.additive.Additive;
import com.yritys.additivesapi.controller.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tommi
 */
@RestController
@RequestMapping("/additives")
public class ApiController {
    
    @Autowired
    private ApiService apiService;
    
    @RequestMapping(method=RequestMethod.GET)
    public Iterable<Additive> additive(){
        return apiService.getAll();
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public void addAdditive(@RequestBody Additive additive){
        apiService.addAdditive(additive);
    }
    
}
