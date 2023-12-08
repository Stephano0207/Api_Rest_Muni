/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;


/**
 *
 * @author stephano
 */
@Entity
@Table(name="Ciudadano")
public class Ciudadano {

    @Id
    private char dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private char numeroCelular;
    private String email;
    //Relacion de uno a muchos con DetallesDocumento
    @OneToMany(mappedBy="ciudadano")
    private ArrayList<DetallesDocumento> detallesDocumento;
    
    //Relacion de uno a muchos con Pago
    @OneToMany(mappedBy="ciudadano")
    private ArrayList<Pago> pagos;
    public Ciudadano() {
    }

    public Ciudadano(char dni, String nombres, String apellidos, String direccion, char numeroCelular, String email) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
        this.email = email;
    }

    public Ciudadano(String nombres, String apellidos, String direccion, char numeroCelular, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
        this.email = email;
    }

    public char getDni() {
        return dni;
    }

    public void setDni(char dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(char numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<DetallesDocumento> getDetallesDocumento() {
        return detallesDocumento;
    }

    public void setDetallesDocumento(ArrayList<DetallesDocumento> detallesDocumento) {
        this.detallesDocumento = detallesDocumento;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

}
