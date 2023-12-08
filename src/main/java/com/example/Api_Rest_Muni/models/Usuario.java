/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author stephano
 */
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column()
    private String email;
    @Column()
    private String password;
    @ManyToOne()
    @JoinColumn(name = "fkUsuario")
    private AreaTrabajo areaTrabajo;
    //Relacion de muchos a uno con AreaTrabajo

    //Relacion de uno a muchos con AvanceTramite
    public Usuario(Long idUsuario, String email, String password, AreaTrabajo areaTrabajo) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.password = password;
        this.areaTrabajo = areaTrabajo;
    }

    public Usuario(String email, String password, AreaTrabajo areaTrabajo) {
        this.email = email;
        this.password = password;
        this.areaTrabajo = areaTrabajo;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", email=" + email + ", password=" + password + ", areaTrabajo=" + areaTrabajo + '}';
    }

    public AreaTrabajo getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
