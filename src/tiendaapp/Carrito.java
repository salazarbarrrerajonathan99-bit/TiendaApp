package tiendaapp;

import java.util.ArrayList;

public class Carrito {
private ArrayList<ItemCarrito> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

public void agregarItem(Producto producto, int cantidad){
    ItemCarrito ite=new ItemCarrito(producto,cantidad);
    items.add(ite);
}

public double calcularTotal(){
    double total=0;
    for(ItemCarrito item:items){
       total += item.getSubtotal();
    }
    return total;
}

public void mostrarCarrito(){
    for(ItemCarrito item:items){
        System.out.println("nombre: "+item.getProducto().getNombre()
        +" cantidad "+item.getCantidad()+
          " subtotal: "+item.getSubtotal());
    }
    System.out.println("Total: "+calcularTotal());
}

}
