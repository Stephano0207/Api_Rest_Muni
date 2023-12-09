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
@Table(name="Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long idRol;

    private String nombre;

    ////Relacion de uno a muchos con Usuario
   @OneToMany(mappedBy="rol")
    private ArrayList <Usuario> usuarios;
    public Rol() {
    }

    public Rol(Long idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public Rol(String nombre, ArrayList<Usuario> usuarios) {
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public Rol(Long idRol, String nombre, ArrayList<Usuario> usuarios) {
        this.idRol = idRol;
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
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
        return "Rol{" + "idRol=" + idRol + ", nombre=" + nombre + '}';
    }

}
