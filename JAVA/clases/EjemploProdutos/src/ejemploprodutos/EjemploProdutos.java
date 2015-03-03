/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploprodutos;

import java.util.ArrayList;

/**
 *
 * @author Enrique Moreno
 */
public class EjemploProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductoComida pc1= new ProductoComida("10 kilos", "23542345", "DogShow");
        ProductoComida pc2= new ProductoComida("5 kilos", "2354", "DogShow");
        ProductoComida pc3= new ProductoComida("30 kilos", "235", "DogShow");
        
        ProductoAnimales pa1= new ProductoAnimales("30 kilos", "235", "juanito");
        ProductoAnimales pa2= new ProductoAnimales("30 kilos", "235", "pepito");
        ProductoAnimales pa3= new ProductoAnimales("30 kilos", "235", "hugo");
        
        
        
        
        
        ArrayList<Producto> listaProductosPedido= new ArrayList<>();
        listaProductosPedido.add(pc1);
        listaProductosPedido.add(pc2);
        listaProductosPedido.add(pc3);
        listaProductosPedido.add(pa1);
        listaProductosPedido.add(pa2);
        listaProductosPedido.add(pa3);
        
        for (Producto producto : listaProductosPedido) {
            if(producto instanceof ProductoAnimales){
                ProductoAnimales pt = (ProductoAnimales)producto;
                System.out.println("animal----------------");
                System.out.println(pt.getIdProducto());
                System.out.println(pt.getRaza());
                System.out.println(pt.getNombre());
            }
            if(producto instanceof ProductoComida){
                ProductoComida pt = (ProductoComida)producto;
                System.out.println("comida-----------------");
                System.out.println(pt.getIdProducto());
                System.out.println(pt.getPeso());
                System.out.println(pt.getNombre());
            }
            
        }
        
        
        
        
        
        
        
        
    }
    
}
