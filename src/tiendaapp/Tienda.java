package tiendaapp;

import java.util.ArrayList;

public class Tienda {
 private ArrayList<Producto> productos;
 private ArrayList<Cliente> clientes;

    public Tienda() {
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
 
 
 public void agregarProducto(Producto producto){
     productos.add(producto);
 }
 
 public void agregarCliente(Cliente cliente){
     clientes.add(cliente);
 }
 
 public void mostrarProductos(){
     for(Producto prod: productos){
         prod.mostrarInfo();
 }
 }
 
 public void procesarCompra(Cliente cliente, Carrito carrito){
     for(ItemCarrito item:carrito.getItems()){
         if(item.getProducto().getStock()<item.getCantidad()){
             System.out.println("Stock insuficiente: "+item.getProducto().getNombre());
             return;
         }
     }
     
     for(ItemCarrito item2:carrito.getItems()){
         
             item2.getProducto().reducirStock(item2.getCantidad());
     }
     cliente.agregarCompra("Compra realizada por: " + cliente.getNombre() + 
                      " - Total: " + carrito.calcularTotal());
     System.out.println("Compra realizada con éxito. Total: " + carrito.calcularTotal());
 }
 
}
