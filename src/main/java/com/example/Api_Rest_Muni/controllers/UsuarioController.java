/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.controllers;

/**
 *
 * @author stephano
 */

import com.example.Api_Rest_Muni.models.Usuario;
import com.example.Api_Rest_Muni.servicies.UsuarioServicio;
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

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioServicio usuarioServicio;
    
    @GetMapping()
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioServicio.obtenerUsuarios();
    }
    
    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.usuarioServicio.guardarUsuario(usuario);
        
    }
    
    @GetMapping(path="/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioServicio.obtenerPorId(id);
    }
    
    @DeleteMapping(path="/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id){
     boolean ok= this.usuarioServicio.eliminarUsuario(id);
     if(ok){
         return "Eliminado con id: "+id;
     }else{
         return "No existe usuario con id: "+id;
     }
    }
    
}
