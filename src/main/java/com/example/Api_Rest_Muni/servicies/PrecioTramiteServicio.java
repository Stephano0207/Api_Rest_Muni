/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.PrecioTramite;
import com.example.Api_Rest_Muni.repositories.PrecioTramiteRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stephano
 */
@Service
public class PrecioTramiteServicio {
    @Autowired
    private PrecioTramiteRepositorio precioTramiteRepositorio;
    
    public ArrayList<PrecioTramite> obtenerPreciosTramites(){
        return (ArrayList<PrecioTramite>) precioTramiteRepositorio.findAll();
    }
    
    public PrecioTramite guardarAreaTrabajo(PrecioTramite area){
        return precioTramiteRepositorio.save(area);
    }
    
    public Optional<PrecioTramite> obtenerPorId(Long id){
        return precioTramiteRepositorio.findById(id);
    }
    

    
    public boolean eliminarAreaTrabajo(Long id){
        try{
           precioTramiteRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
