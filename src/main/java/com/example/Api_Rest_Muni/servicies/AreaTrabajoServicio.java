/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.AreaTrabajo;
import com.example.Api_Rest_Muni.repositories.AreaTrabajoRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stephano
 */
@Service
public class AreaTrabajoServicio {
    @Autowired
    private AreaTrabajoRepositorio areaTrabajoRepositorio;
    
    public ArrayList<AreaTrabajo> obtenerAreasTrabajos(){
        return (ArrayList<AreaTrabajo>) areaTrabajoRepositorio.findAll();
    }
    
    public AreaTrabajo guardarAreaTrabajo(AreaTrabajo area){
        return areaTrabajoRepositorio.save(area);
    }
    
    public Optional<AreaTrabajo> obtenerPorId(Long id){
        return areaTrabajoRepositorio.findById(id);
    }
    

    
    public boolean eliminarAreaTrabajo(Long id){
        try{
           areaTrabajoRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
