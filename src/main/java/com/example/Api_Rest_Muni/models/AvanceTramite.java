/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.sql.Date;

/**
 *
 * @author stephano
 */
@Entity
@Table(name="AvanceTramite")
public class AvanceTramite {
    @EmbeddedId
    private AvanceTramiteKey id;
    @Column
    private Date fechaAvance;
    @Column
    private String estado;
    
    //Relacion  de muchos a uno con Usuario
    @ManyToOne()
    @MapsId("usuarioId")
    @JoinColumn(name="usuario_id")
    private Usuario usuario;
    //Relacion  de muchos a uno  con Documento
    @ManyToOne()
    @MapsId("documentoId")
    @JoinColumn(name="documento_id")
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public AvanceTramiteKey getId() {
        return id;
    }

    public void setId(AvanceTramiteKey id) {
        this.id = id;
    }
    
    
    
    
}
