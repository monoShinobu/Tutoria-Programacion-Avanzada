/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio2;

/**
 *
 * @author puras
 */
public class Celular extends Producto {
    private String modelo;
    private int pulgadas;

    public Celular(String nombre, double precio, String modelo, int pulgadas, int cantidad) {
        super(nombre, precio, cantidad);
        setModelo(modelo);
        setPulgadas(pulgadas);
    }

    public String getModelo() {
        return this.modelo;
    }
    
    public int getPulgadas() {
        return this.pulgadas;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }


    @Override
    public String toString() {
        return "Celular: " + this.nombre + ", Precio: " + this.precio + ", Modelo: " + this.modelo + ", Pulgadas: " + this.pulgadas + ", Cantidad en inventario "+ this.cantidad;
    }
}
