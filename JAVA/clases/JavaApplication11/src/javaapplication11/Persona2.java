/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique Moreno
 */
@Entity
@Table(name = "persona2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona2.findAll", query = "SELECT p FROM Persona2 p"),
    @NamedQuery(name = "Persona2.findByTipoDocumento", query = "SELECT p FROM Persona2 p WHERE p.persona2PK.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Persona2.findByNumeroDocumento", query = "SELECT p FROM Persona2 p WHERE p.persona2PK.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Persona2.findByNombreCompleto", query = "SELECT p FROM Persona2 p WHERE p.nombreCompleto = :nombreCompleto")})
public class Persona2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Persona2PK persona2PK;
    @Column(name = "nombre_completo")
    private String nombreCompleto;

    public Persona2() {
    }

    public Persona2(Persona2PK persona2PK) {
        this.persona2PK = persona2PK;
    }

    public Persona2(String tipoDocumento, String numeroDocumento) {
        this.persona2PK = new Persona2PK(tipoDocumento, numeroDocumento);
    }

    public Persona2PK getPersona2PK() {
        return persona2PK;
    }

    public void setPersona2PK(Persona2PK persona2PK) {
        this.persona2PK = persona2PK;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (persona2PK != null ? persona2PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona2)) {
            return false;
        }
        Persona2 other = (Persona2) object;
        if ((this.persona2PK == null && other.persona2PK != null) || (this.persona2PK != null && !this.persona2PK.equals(other.persona2PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication11.Persona2[ persona2PK=" + persona2PK + " ]";
    }
    
}
