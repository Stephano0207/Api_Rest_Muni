/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.controllers;

import com.example.Api_Rest_Muni.models.Documento;
import com.example.Api_Rest_Muni.servicies.DocumentoServicio;
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
@RequestMapping("/documentos")
public class DocumentoController {
    
    @Autowired
    private DocumentoServicio documentoServicio;
    
        
    @GetMapping()
    public ArrayList<Documento> obtenerDocumentos(){
        return documentoServicio.obtenerDocumentos();
    }
    
    @PostMapping()
    public Documento guardarDocumento(@RequestBody Documento documento){
        return this.documentoServicio.guardarDocumento(documento);
        
    }
    
    @GetMapping(path="/{id}")
    public Optional<Documento> obtenerDocumentoPorId(@PathVariable("id") Long id){
        return this.documentoServicio.obtenerPorId(id);
    }
    
    @DeleteMapping(path="/{id}")
    public String eliminarPublicacion(@PathVariable("id") Long id){
     boolean ok= this.documentoServicio.eliminarDocumento(id);
     if(ok){
         return "Eliminado con id: "+id;
     }else{
         return "No existe documento con id: "+id;
     }
    }
    
}
