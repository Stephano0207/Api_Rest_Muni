/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.sql.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author stephano
 */
@Entity
@Table(name="Publicaciones")
public class Publicaciones {
        @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long idPublicacion;
    private String titulo;
    private String detalle;
    private Date fecha;
    //Relacion de muchos a uno con Usuario

    public Publicaciones() {
    }

    public Publicaciones(String titulo, String detalle, Date fecha) {
        this.titulo = titulo;
        this.detalle = detalle;
        this.fecha = fecha;
    }

    public Publicaciones(Long idPublicacion, String titulo, String detalle, Date fecha) {
        this.idPublicacion = idPublicacion;
        this.titulo = titulo;
        this.detalle = detalle;
        this.fecha = fecha;
    }

    public Long getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
