/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio2;

/**
 *
 * @author puras
 */
public class Televisor extends Producto {

    private int pulgadas;

    public Televisor(String nombre, double precio, int pulgadas, int cantidad) {
        super(nombre, precio, cantidad);
        setPulgadas(pulgadas);
    }

    public int getPulgadas() {
        return this.pulgadas;
    }
    
    public void setPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Televisor: " + this.nombre + ", Precio: " + this.precio + ", Pulgadas: " + this.pulgadas + ", Cantidad en inventario "+ this.cantidad;
    }
}
