/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

/**
 *
 * @author stephano
 */
public class PrecioTramite {
    private int idTramite;
    private String nombre;
    private float String;
    //Relacion de uno a muchos con DetallesPago

    public PrecioTramite() {
    }

    public PrecioTramite(int idTramite, String nombre, float String) {
        this.idTramite = idTramite;
        this.nombre = nombre;
        this.String = String;
    }

    public PrecioTramite(String nombre, float String) {
        this.nombre = nombre;
        this.String = String;
    }

    public int getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(int idTramite) {
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
