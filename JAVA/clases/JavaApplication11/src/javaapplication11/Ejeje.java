/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique Moreno
 */
@Entity
@Table(name = "ejeje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejeje.findAll", query = "SELECT e FROM Ejeje e"),
    @NamedQuery(name = "Ejeje.findByNumero", query = "SELECT e FROM Ejeje e WHERE e.numero = :numero"),
    @NamedQuery(name = "Ejeje.findByA", query = "SELECT e FROM Ejeje e WHERE e.a = :a")})
public class Ejeje implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "a")
    private String a;

    public Ejeje() {
    }

    public Ejeje(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ejeje)) {
            return false;
        }
        Ejeje other = (Ejeje) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication11.Ejeje[ numero=" + numero + " ]";
    }
    
}
