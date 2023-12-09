/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;

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
    private String imagen;
    //Relacion de muchos a uno con Usuario
    @ManyToOne
    @JoinColumn(name="fkUsuario")
    private Usuario usuario;
    public Publicaciones() {
    }

    public Publicaciones(String titulo, String detalle, Date fecha, String imagen, Usuario usuario) {
        this.titulo = titulo;
        this.detalle = detalle;
        this.fecha = fecha;
        this.imagen = imagen;
        this.usuario = usuario;
    }

    public Publicaciones(Long idPublicacion, String titulo, String detalle, Date fecha, String imagen, Usuario usuario) {
        this.idPublicacion = idPublicacion;
        this.titulo = titulo;
        this.detalle = detalle;
        this.fecha = fecha;
        this.imagen = imagen;
        this.usuario = usuario;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
