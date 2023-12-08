/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author stephano
 */
@Entity
@Table(name = "AreaTrabajo")
public class AreaTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAreaTrabajo;

    private String nombre;

    ////Relacion de uno a muchos con Usuario
    public AreaTrabajo() {
    }

    public AreaTrabajo(Long idAreaTrabajo, String nombre) {
        this.idAreaTrabajo = idAreaTrabajo;
        this.nombre = nombre;
    }

    public Long getIdAreaTrabajo() {
        return idAreaTrabajo;
    }

    public void setIdAreaTrabajo(Long idAreaTrabajo) {
        this.idAreaTrabajo = idAreaTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "AreaTrabajo{" + "idAreaTrabajo=" + idAreaTrabajo + ", nombre=" + nombre + '}';
    }

}
