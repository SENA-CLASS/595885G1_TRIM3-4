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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique Moreno
 */
@Entity
@Table(name = "vta_item_facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VtaItemFacturas.findAll", query = "SELECT v FROM VtaItemFacturas v"),
    @NamedQuery(name = "VtaItemFacturas.findByIdFactura", query = "SELECT v FROM VtaItemFacturas v WHERE v.idFactura = :idFactura"),
    @NamedQuery(name = "VtaItemFacturas.findByIdPedido", query = "SELECT v FROM VtaItemFacturas v WHERE v.idPedido = :idPedido"),
    @NamedQuery(name = "VtaItemFacturas.findByNombreProducto", query = "SELECT v FROM VtaItemFacturas v WHERE v.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "VtaItemFacturas.findByCantidad", query = "SELECT v FROM VtaItemFacturas v WHERE v.cantidad = :cantidad"),
    @NamedQuery(name = "VtaItemFacturas.findByCostoUnitario", query = "SELECT v FROM VtaItemFacturas v WHERE v.costoUnitario = :costoUnitario"),
    @NamedQuery(name = "VtaItemFacturas.findByCostoTotal", query = "SELECT v FROM VtaItemFacturas v WHERE v.costoTotal = :costoTotal")})
public class VtaItemFacturas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id_factura")
    private int idFactura;
    @Basic(optional = false)
    @Column(name = "id_pedido")
    private int idPedido;
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo_unitario")
    private Double costoUnitario;
    @Column(name = "costo_total")
    private Double costoTotal;

    public VtaItemFacturas() {
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
}
