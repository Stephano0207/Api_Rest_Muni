/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

/**
 *
 * @author stephano
 */
public class AreaTrabajo {
    private int idAreaTrabajo;
    
    private String nombre;
    
    ////Relacion de uno a muchos con Usuario
  

    public AreaTrabajo() {
    }

    public AreaTrabajo(int idAreaTrabajo, String nombre) {
        this.idAreaTrabajo = idAreaTrabajo;
        this.nombre = nombre;
    }

    public int getIdAreaTrabajo() {
        return idAreaTrabajo;
    }

    public void setIdAreaTrabajo(int idAreaTrabajo) {
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
