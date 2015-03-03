/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploprodutos;

/**
 *
 * @author Enrique Moreno
 */
public class Producto {
    private String idProducto;
    private String nombre;

    public Producto(String idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
