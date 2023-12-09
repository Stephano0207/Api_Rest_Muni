/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Column;
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
    @Column
    private String nombre;
    @Column
    private float precio;
    //Relacion de muchos a muchos con Pago
    @ManyToMany(mappedBy="tramites")
    private ArrayList<Pago> pagos;
    public PrecioTramite() {
    }

    public PrecioTramite(Long idTramite, String nombre, float precio) {
        this.idTramite = idTramite;
        this.nombre = nombre;
        this.precio = precio;
    }

    public PrecioTramite(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
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
        return precio;
    }

    public void setString(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PrecioTramite{" + "idTramite=" + idTramite + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
