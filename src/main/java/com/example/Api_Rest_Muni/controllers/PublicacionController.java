/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.controllers;

import com.example.Api_Rest_Muni.models.Publicaciones;
import com.example.Api_Rest_Muni.servicies.PublicacionServicio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stephano
 */
@RestController
@RequestMapping("api/v1/publicaciones")
public class PublicacionController {
    @Autowired
    private PublicacionServicio publicacionServicio;
    
    @GetMapping()
    public ArrayList<Publicaciones> obtenerPublicaciones(){
        return publicacionServicio.obtenerPublicaciones();
    }
    
    @PostMapping()
    public Publicaciones guardarPublicacion(@RequestBody Publicaciones publicacion){
        return this.publicacionServicio.guardarPublicacion(publicacion);
        
    }
    
    @GetMapping(path="/{id}")
    public Optional<Publicaciones> obtenerPublicacionPorId(@PathVariable("id") Long id){
        return this.publicacionServicio.obtenerPorId(id);
    }
    
    @DeleteMapping(path="/{id}")
    public String eliminarPublicacion(@PathVariable("id") Long id){
     boolean ok= this.publicacionServicio.eliminarPublicacion(id);
     if(ok){
         return "Eliminado con id: "+id;
     }else{
         return "No existe publicacion con id: "+id;
     }
    }
}
