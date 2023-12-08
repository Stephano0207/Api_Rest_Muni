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
@Table(name="Documento")
public class Documento {
        @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long idDocumento;
    private int numDoc;
    private String tipo;
    private Date fechaRecepcion;
    private int numerosDeHojas;
    //Relacion de uno a muchos con DetallesDocumento
    //Relacion de uno a muchos con AvanceTramite

    public Documento() {
    }

    public Documento(int numDoc, String tipo, Date fechaRecepcion, int numerosDeHojas) {
        this.numDoc = numDoc;
        this.tipo = tipo;
        this.fechaRecepcion = fechaRecepcion;
        this.numerosDeHojas = numerosDeHojas;
    }

    public Documento(Long idDocumento, int numDoc, String tipo, Date fechaRecepcion, int numerosDeHojas) {
        this.idDocumento = idDocumento;
        this.numDoc = numDoc;
        this.tipo = tipo;
        this.fechaRecepcion = fechaRecepcion;
        this.numerosDeHojas = numerosDeHojas;
    }

    public Long getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public int getNumerosDeHojas() {
        return numerosDeHojas;
    }

    public void setNumerosDeHojas(int numerosDeHojas) {
        this.numerosDeHojas = numerosDeHojas;
    }
    
    
    
}
