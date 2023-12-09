/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Api_Rest_Muni.repositories;

import com.example.Api_Rest_Muni.models.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stephano
 */
@Repository
public interface RolRepositorio extends CrudRepository<Rol,Long> {
    
}
