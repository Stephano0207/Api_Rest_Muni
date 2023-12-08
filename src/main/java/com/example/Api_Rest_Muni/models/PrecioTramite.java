/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;

/**
 *
 * @author stephano
 */
@Entity
@Table(name="PrecioTramite")
public class PrecioTramite {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long idTramite;
    private String nombre;
    private float String;
    //Relacion de muchos a muchos con Pago
    @ManyToMany(mappedBy="tramites")
    private ArrayList<Pago> pagos;
    public PrecioTramite() {
    }

    public PrecioTramite(Long idTramite, String nombre, float String) {
        this.idTramite = idTramite;
        this.nombre = nombre;
        this.String = String;
    }

    public PrecioTramite(String nombre, float String) {
        this.nombre = nombre;
        this.String = String;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getString() {
        return String;
    }

    public void setString(float String) {
        this.String = String;
    }

    @Override
    public String toString() {
        return "PrecioTramite{" + "idTramite=" + idTramite + ", nombre=" + nombre + ", String=" + String + '}';
    }
    
}
