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
public class ProductoComida extends Producto{
    private String peso;

    public ProductoComida(String peso, String idProducto, String nombre) {
        super(idProducto, nombre);
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    
}
