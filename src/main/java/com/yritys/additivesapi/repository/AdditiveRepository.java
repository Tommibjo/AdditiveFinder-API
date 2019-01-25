/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.additivesapi.repository;

import com.yritys.additivesapi.additive.Additive;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Tommi
 */
public interface AdditiveRepository extends CrudRepository<Additive, Integer>{
    
}
