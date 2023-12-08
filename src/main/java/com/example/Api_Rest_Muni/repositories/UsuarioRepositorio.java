/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Api_Rest_Muni.repositories;

import com.example.Api_Rest_Muni.models.Usuario;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stephano
 */
@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario,Long> {
    public abstract ArrayList<Usuario> findByPrioridad(Integer prioridad);
}
