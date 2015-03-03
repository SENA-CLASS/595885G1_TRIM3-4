package edu.co.sena.uml.classAssociation;

public class Item {

	Producto productos;
	private int cantidad;
	private int valorUnitario;
	private int valorTotal;

    public Item(Producto productos, int cantidad, int valorUnitario) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.calculoValorTotal();
    }
        
        
        
        private void calculoValorTotal(){
         this.valorTotal=this.cantidad*this.valorUnitario;
        }
        
        

}