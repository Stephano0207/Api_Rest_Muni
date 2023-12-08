/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.servicies;

import com.example.Api_Rest_Muni.models.Usuario;
import com.example.Api_Rest_Muni.repositories.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author stephano
 */
@Service
public class UsuarioServicio {
    private UsuarioRepositorio usuarioRepositorio;
    
    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>) usuarioRepositorio.findAll();
    }
    
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }
    
    public Optional<Usuario> obtenerPorId(Long id){
        return usuarioRepositorio.findById(id);
    }
    
    public ArrayList<Usuario> obtenerPorPrioridad(Integer prioridad){
        return usuarioRepositorio.findByPrioridad(prioridad);
    }
    
    public boolean eliminarUsuario(Long id){
        try{
           usuarioRepositorio.deleteById(id);
           return true;
        }catch(Exception err){
            return false;
        }
    }
}
