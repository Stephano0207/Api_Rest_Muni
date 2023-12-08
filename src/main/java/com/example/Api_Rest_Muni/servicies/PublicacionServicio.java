/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.Publicaciones;
import com.example.Api_Rest_Muni.repositories.PublicacionRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stephano
 */
@Service
public class PublicacionServicio {
    @Autowired
    private PublicacionRepositorio publicacionRepositorio;
    
      public ArrayList<Publicaciones> obtenerPublicaciones(){
        return (ArrayList<Publicaciones>) publicacionRepositorio.findAll();
    }
    
    public Publicaciones guardarPublicacion(Publicaciones publicacion){
        return publicacionRepositorio.save(publicacion);
    }
    
    public Optional<Publicaciones> obtenerPorId(Long id){
        return publicacionRepositorio.findById(id);
    }
    
    
    public boolean eliminarPublicacion(Long id){
        try{
           publicacionRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
