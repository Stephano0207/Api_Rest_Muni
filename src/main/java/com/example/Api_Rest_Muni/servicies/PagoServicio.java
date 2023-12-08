/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.Pago;
import com.example.Api_Rest_Muni.repositories.PagoRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stephano
 */
@Service
public class PagoServicio {
    @Autowired
    private PagoRepositorio pagoRepositorio;
    
     public ArrayList<Pago> obtenerPagos(){
        return (ArrayList<Pago>) pagoRepositorio.findAll();
    }
    
    public Pago guardarPago(Pago pago){
        return pagoRepositorio.save(pago);
    }
    
    public Optional<Pago> obtenerPorId(Long id){
        return pagoRepositorio.findById(id);
    }
    
    public boolean eliminarPago(Long id){
        try{
           pagoRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
