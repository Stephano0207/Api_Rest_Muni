/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;

/**
 *
 * @author stephano
 */
public class AvanceTramite {
    
    private Date fechaAvance;
    private String estado;
    
    //Relacion  de muchos a uno con Usuario
    @ManyToOne()
    @JoinColumn(name="fkUsuario")
    private Usuario usuario;
    //Relacion  de muchos a uno  con Documento
    @ManyToOne()
    @JoinColumn(name="fkDocumento")
    private Documento documento;

    public AvanceTramite() {
    }

    public AvanceTramite(Date fechaAvance, String estado) {
        this.fechaAvance = fechaAvance;
        this.estado = estado;
    }

    public Date getFechaAvance() {
        return fechaAvance;
    }

    public void setFechaAvance(Date fechaAvance) {
        this.fechaAvance = fechaAvance;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "AvanceTramite{" + "fechaAvance=" + fechaAvance + ", estado=" + estado + '}';
    }
    
    
    
    
}
