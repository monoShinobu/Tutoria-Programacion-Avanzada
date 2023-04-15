/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio2;

/**
 *
 * @author puras
 */
public class Computador extends Producto {

    private String placa;

    public Computador(String nombre, double precio, String placa, int cantidad) {
        super(nombre, precio, cantidad);
        setPlaca(placa);
    }

    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Computador: " + this.nombre + ", Precio: " + this.precio + ", Placa: " + this.placa + ", Cantidad en inventario "+ this.cantidad;
    }
}
