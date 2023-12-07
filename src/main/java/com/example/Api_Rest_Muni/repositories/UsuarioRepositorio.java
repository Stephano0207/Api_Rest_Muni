/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Api_Rest_Muni.repositories;

import com.example.Api_Rest_Muni.models.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author stephano
 */
public interface UsuarioRepositorio extends CrudRepository<Usuario,Long> {
    
}
