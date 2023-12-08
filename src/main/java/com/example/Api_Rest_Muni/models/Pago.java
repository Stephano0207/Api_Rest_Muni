/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

/**
 *
 * @author stephano
 */
@Entity
@Table(name="Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long codigoPago;
    private float monto;
    private  Date fecha;
    //Relacion de uno a muchos con DEtallesPago
    
    public Pago() {
    }

    public Pago(float monto, Date fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }

    public Pago(Long codigoPago, float monto, Date fecha) {
        this.codigoPago = codigoPago;
        this.monto = monto;
        this.fecha = fecha;
    }

    
    
    public Long getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(Long codigoPago) {
        this.codigoPago = codigoPago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pago{" + "codigoPago=" + codigoPago + ", monto=" + monto + ", fecha=" + fecha + '}';
    }
    
    
    
}
