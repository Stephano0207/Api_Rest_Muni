/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.controllers;

import com.example.Api_Rest_Muni.models.Pago;
import com.example.Api_Rest_Muni.servicies.PagoServicio;
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
@RequestMapping("api/v1/pagos")
public class PagoController {
    
    @Autowired
    private PagoServicio pagoServicio;
    
        
    @GetMapping()
    public ArrayList<Pago> obtenerPagos(){
        return pagoServicio.obtenerPagos();
    }
    
    @PostMapping()
    public Pago guardarPublicacion(@RequestBody Pago pago){
        return this.pagoServicio.guardarPago(pago);
        
    }
    
    @GetMapping(path="/{id}")
    public Optional<Pago> obtenerPagoPorId(@PathVariable("id") Long id){
        return this.pagoServicio.obtenerPorId(id);
    }
    
    @DeleteMapping(path="/{id}")
    public String eliminarPublicacion(@PathVariable("id") Long id){
     boolean ok= this.pagoServicio.eliminarPago(id);
     if(ok){
         return "Eliminado con id: "+id;
     }else{
         return "No existe pago con id: "+id;
     }
    }
    
}
