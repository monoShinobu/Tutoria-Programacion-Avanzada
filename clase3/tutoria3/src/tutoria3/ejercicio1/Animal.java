/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio1;

/**
 *
 * @author puras
 */
public class Animal {

    private int codigo;
    private int cantidad;

    public Animal(int codigo, int cantidad) {
        setCodigo(codigo);
        setCantidad(cantidad);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void agregarAnimales(int cantidad) {
        if (verificarCantidad(cantidad)) {
            this.cantidad = cantidad;
        }
    }

    public boolean verificarCantidad(int cantidad) {
        boolean aux = false;
        if (cantidad > 0) {
            aux = true;
        } else {
            System.out.println("Cantidad invalida");
        }
        return aux;
    }

    public String hacerSonido() {
        return "El animal : ";
    }

    @Override
    public String toString() {
        return "La cantidad del animal es " + this.cantidad;
    }

}
