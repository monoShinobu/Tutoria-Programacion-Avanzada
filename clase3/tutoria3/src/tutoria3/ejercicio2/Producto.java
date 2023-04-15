/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio2;

/**
 *
 * @author puras
 */
public class Producto {

    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public int getCantidad(int cantidad) {
        return this.cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio;
    }
}
