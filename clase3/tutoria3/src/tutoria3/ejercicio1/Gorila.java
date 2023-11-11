/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio1;

/**
 *
 * @author puras
 */
public class Gorila extends Animal{
    public Gorila(int codigo){
        super(codigo, 0, "Gorila");
    }
    
    public void agregarCantidad(int cantidad){
        super.agregarAnimales(cantidad);
    }
    
    public String sonido(){
        return super.hacerSonido();
    }
    
    @Override
    public String toString() {
        return "La cantidad de gorilas es " + this.cantidad;
    }
}
