/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;

/**
 *
 * @author stephano
 */
@Entity
@Table(name="AreaTrabajo")
public class AreaTrabajo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long idAreaTrabajo;

    private String nombre;

    ////Relacion de uno a muchos con Usuario
   @OneToMany(mappedBy="areaTrabajo")
    private ArrayList <Usuario> usuarios;
    public AreaTrabajo() {
    }

    public AreaTrabajo(Long idAreaTrabajo, String nombre) {
        this.idAreaTrabajo = idAreaTrabajo;
        this.nombre = nombre;
    }

    public AreaTrabajo(String nombre, ArrayList<Usuario> usuarios) {
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public AreaTrabajo(Long idAreaTrabajo, String nombre, ArrayList<Usuario> usuarios) {
        this.idAreaTrabajo = idAreaTrabajo;
        this.nombre = nombre;
        this.usuarios = usuarios;
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

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "AreaTrabajo{" + "idAreaTrabajo=" + idAreaTrabajo + ", nombre=" + nombre + '}';
    }

}
