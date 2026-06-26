package tiendaapp;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public boolean reducirStock(int cantidad){
        boolean hayStock=true;
        if(stock>=cantidad){
        this.stock-=cantidad;
        hayStock=true;
        }
        else{
            System.out.println("No hay stock");
            hayStock=false;
        }
        return hayStock;
    }
    
    public void mostrarInfo(){
          System.out.println("El producto "+ nombre
          +" su precio es "+precio+" y el stock disponible es "
          +stock);  
        }
}
