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
   @Column(name="ciudadano_id")
   private char ciudadanoId;

   

    public DetallesDocumentoKey() {
    }

    public Long getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Long documentoId) {
        this.documentoId = documentoId;
    }

    public char getCiudadanoId() {
        return ciudadanoId;
    }

    public void setCiudadanoId(char ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

    public DetallesDocumentoKey(Long documentoId, char ciudadanoId) {
        this.documentoId = documentoId;
        this.ciudadanoId = ciudadanoId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.documentoId);
        hash = 89 * hash + this.ciudadanoId;
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
        if (this.ciudadanoId != other.ciudadanoId) {
            return false;
        }
        return Objects.equals(this.documentoId, other.documentoId);
    }

   

    
    
    
}
