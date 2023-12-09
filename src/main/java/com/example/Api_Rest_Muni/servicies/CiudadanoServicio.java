/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.Ciudadano;
import com.example.Api_Rest_Muni.repositories.CiudadanoRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stephano
 */
@Service
public class CiudadanoServicio {
     @Autowired
    private CiudadanoRepositorio ciudadanoRepositorio;
    
    public ArrayList<Ciudadano> obtenerCiudadanos(){
        return (ArrayList<Ciudadano>) ciudadanoRepositorio.findAll();
    }
    
    public Ciudadano guardarCiudadano(Ciudadano ciudadano){
        return ciudadanoRepositorio.save(ciudadano);
    }
    
    public Optional<Ciudadano> obtenerPorId(Character id){
        return ciudadanoRepositorio.findById(id);
    }
    

    
    public boolean eliminarAreaTrabajo(Character id){
        try{
           ciudadanoRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
