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
public class AvanceTramiteKey implements Serializable{

    @Column(name="documento_id")
    private Long documentoId;
    @Column(name="usuario_id")
    private Long usuarioId;

    public AvanceTramiteKey(Long documentoId, Long usuarioId) {
        this.documentoId = documentoId;
        this.usuarioId = usuarioId;
    }

    public AvanceTramiteKey() {
    }

    @Override
    public String toString() {
        return "AvanceTramiteKey{" + "documentoId=" + documentoId + ", usuarioId=" + usuarioId + '}';
    }

    public Long getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Long documentoId) {
        this.documentoId = documentoId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.documentoId);
        hash = 37 * hash + Objects.hashCode(this.usuarioId);
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
        final AvanceTramiteKey other = (AvanceTramiteKey) obj;
        if (!Objects.equals(this.documentoId, other.documentoId)) {
            return false;
        }
        return Objects.equals(this.usuarioId, other.usuarioId);
    }
    
    
}
