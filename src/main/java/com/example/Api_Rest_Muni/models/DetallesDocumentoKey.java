/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Api_Rest_Muni.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author stephano
 */
@Embeddable
public class DetallesDocumentoKey implements Serializable {
   @Column(name="documento_id")
   private Long documentoId;
   @Column(name="dni",length=9)   
   private Character dni;

    public DetallesDocumentoKey(Long documentoId, Character dni) {
        this.documentoId = documentoId;
        this.dni = dni;
    }

   

    public DetallesDocumentoKey() {
    }

    public Long getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Long documentoId) {
        this.documentoId = documentoId;
    }

    public Character getDni() {
        return dni;
    }

    public void setDni(Character dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "DetallesDocumentoKey{" + "documentoId=" + documentoId + ", dni=" + dni + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.documentoId);
        hash = 23 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetallesDocumentoKey other = (DetallesDocumentoKey) obj;
        if (!Objects.equals(this.documentoId, other.documentoId)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }

    

   

   

    
    
    
}
