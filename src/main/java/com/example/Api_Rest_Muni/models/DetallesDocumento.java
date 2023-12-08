/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author stephano
 */
public class DetallesDocumento {
    
    private String rutaArchivo;
    private String estado;
    //Relacion de muchos a uno con Ciudadano
    @ManyToOne()
    @JoinColumn(name="fkCiudadano")
    private Ciudadano ciudadano;
    //Relacion de muchos a uno con Documento
    @ManyToOne()
    @JoinColumn(name="fkDocumento")
    private Documento documento;

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

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "DetallesDocumento{" + "rutaArchivo=" + rutaArchivo + ", estado=" + estado + '}';
    }
    
    
    
    
}
