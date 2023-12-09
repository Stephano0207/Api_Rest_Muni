/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Column;
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
    @Column(length=9)
    private Character dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String numeroCelular;
    private String email;
    //Relacion de uno a muchos con DetallesDocumento
    @OneToMany(mappedBy="ciudadano")
    private ArrayList<DetallesDocumento> detallesDocumento;
    
    //Relacion de uno a muchos con Pago
    @OneToMany(mappedBy="ciudadano")
    private ArrayList<Pago> pagos;
    public Ciudadano() {
    }

    public Ciudadano(String nombres, String apellidos, String direccion, String numeroCelular, String email, ArrayList<DetallesDocumento> detallesDocumento, ArrayList<Pago> pagos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.detallesDocumento = detallesDocumento;
        this.pagos = pagos;
    }

    public Ciudadano(Character dni, String nombres, String apellidos, String direccion, String numeroCelular, String email, ArrayList<DetallesDocumento> detallesDocumento, ArrayList<Pago> pagos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.detallesDocumento = detallesDocumento;
        this.pagos = pagos;
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

    public void setDni(Character dni) {
        this.dni = dni;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "dni=" + dni + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", numeroCelular=" + numeroCelular + ", email=" + email + ", detallesDocumento=" + detallesDocumento + ", pagos=" + pagos + '}';
    }

}
