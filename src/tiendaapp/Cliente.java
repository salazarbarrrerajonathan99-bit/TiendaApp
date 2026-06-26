package tiendaapp;

import java.util.ArrayList;


public class Cliente {
private String nombre;
private int id;
private ArrayList<String> historialCompras;

    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.historialCompras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getHistorialCompras() {
        return historialCompras;
    }

 public void agregarCompra(String descripcion){
     historialCompras.add(descripcion);
 }
 
 public void mostrarHistorial(){
     boolean vacia = historialCompras.isEmpty();
     if(vacia){
         System.out.println("El historial esta vacio");
     }
     else{
         for(String historial:historialCompras){
             System.out.println("-"+historial);
         }
     }
 }
 

}
