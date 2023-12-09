/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.Rol;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Api_Rest_Muni.repositories.RolRepositorio;

/**
 *
 * @author stephano
 */
@Service
public class RolServicio {
    @Autowired
    private RolRepositorio rolRepositorio;
    
    public ArrayList<Rol> obtenerRoles(){
        return (ArrayList<Rol>) rolRepositorio.findAll();
    }
    
    public Rol guardarRol(Rol area){
        return rolRepositorio.save(area);
    }
    
    public Optional<Rol> obtenerPorId(Long id){
        return rolRepositorio.findById(id);
    }
    

    
    public boolean eliminarRol(Long id){
        try{
           rolRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
