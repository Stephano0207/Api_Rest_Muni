/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.Documento;
import com.example.Api_Rest_Muni.repositories.DocumentoRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stephano
 */
@Service
public class DocumentoServicio {
  
    @Autowired
    private DocumentoRepositorio documentoRepositorio;
    
    public ArrayList<Documento> obtenerDocumentos(){
        return (ArrayList<Documento>) documentoRepositorio.findAll();
    }
    
    public Documento guardarDocumento(Documento documento){
        return documentoRepositorio.save(documento);
    }
    
    public Optional<Documento> obtenerPorId(Long id){
        return documentoRepositorio.findById(id);
    }
    
    
    public boolean eliminarDocumento(Long id){
        try{
           documentoRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
