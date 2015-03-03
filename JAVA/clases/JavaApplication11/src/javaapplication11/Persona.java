/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique Moreno
 */
@Entity
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByTipoDocumento", query = "SELECT p FROM Persona p WHERE p.personaPK.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Persona.findByNumeroDocumento", query = "SELECT p FROM Persona p WHERE p.personaPK.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Persona.findByNombreCompleto", query = "SELECT p FROM Persona p WHERE p.nombreCompleto = :nombreCompleto")})
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonaPK personaPK;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private Collection<Carro> carroCollection;

    public Persona() {
    }

    public Persona(PersonaPK personaPK) {
        this.personaPK = personaPK;
    }

    public Persona(String tipoDocumento, String numeroDocumento) {
        this.personaPK = new PersonaPK(tipoDocumento, numeroDocumento);
    }

    public PersonaPK getPersonaPK() {
        return personaPK;
    }

    public void setPersonaPK(PersonaPK personaPK) {
        this.personaPK = personaPK;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @XmlTransient
    public Collection<Carro> getCarroCollection() {
        return carroCollection;
    }

    public void setCarroCollection(Collection<Carro> carroCollection) {
        this.carroCollection = carroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaPK != null ? personaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.personaPK == null && other.personaPK != null) || (this.personaPK != null && !this.personaPK.equals(other.personaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication11.Persona[ personaPK=" + personaPK + " ]";
    }
    
}
