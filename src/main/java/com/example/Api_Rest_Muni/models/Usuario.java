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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;

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
    //Relacion de muchos a uno con AreaTrabajo
    private AreaTrabajo areaTrabajo;

    //Relacion de uno a muchos con AvanceTramite
    @OneToMany(mappedBy="usuario")
    private ArrayList<AvanceTramite> avanceTramite;

    public Usuario(Long idUsuario, String email, String password, AreaTrabajo areaTrabajo, ArrayList<AvanceTramite> avanceTramite) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.password = password;
        this.areaTrabajo = areaTrabajo;
        this.avanceTramite = avanceTramite;
    }

    public Usuario(String email, String password, AreaTrabajo areaTrabajo, ArrayList<AvanceTramite> avanceTramite) {
        this.email = email;
        this.password = password;
        this.areaTrabajo = areaTrabajo;
        this.avanceTramite = avanceTramite;
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

    public ArrayList<AvanceTramite> getAvanceTramite() {
        return avanceTramite;
    }

    public void setAvanceTramite(ArrayList<AvanceTramite> avanceTramite) {
        this.avanceTramite = avanceTramite;
    }

}
