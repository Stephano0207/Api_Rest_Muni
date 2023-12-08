/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author stephano
 */
public class DetallesDocumento {
    
    private String rutaArchivo;
    private String estado;
    //Relacion de muchos a uno con Ciudadano
    //Relacion de muchos a uno con Documento

    public DetallesDocumento(String rutaArchivo, String estado) {
        this.rutaArchivo = rutaArchivo;
        this.estado = estado;
    }

    public DetallesDocumento() {
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetallesDocumento{" + "rutaArchivo=" + rutaArchivo + ", estado=" + estado + '}';
    }
    
    
    
    
}
