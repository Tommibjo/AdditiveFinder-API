/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.additivesapi.controller.service;

import com.yritys.additivesapi.additive.Additive;
import com.yritys.additivesapi.repository.AdditiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tommi
 */
@Service
public class ApiService {
    
    @Autowired
    private AdditiveRepository additiveRepository;
    
    public Iterable<Additive> getAll(){
        return this.additiveRepository.findAll();
    }
    
    public void addAdditive(Additive additive){
        this.additiveRepository.save(additive);
    }
    
}
