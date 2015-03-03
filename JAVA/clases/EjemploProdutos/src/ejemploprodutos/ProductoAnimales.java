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
public class ProductoAnimales extends Producto{
    private String raza;

    public ProductoAnimales(String raza, String idProducto, String nombre) {
        super(idProducto, nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

  

    
    
}
