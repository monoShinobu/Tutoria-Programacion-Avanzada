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
    public String sonido = "Gruñe";
    public Gorila(int codigo){
        super(codigo, 0);
    }
    
    public void agregarCantidad(int cantidad){
        agregarAnimales(cantidad);
    }
    
    public String sonido(){
        return super.hacerSonido() + this.sonido;
    }
}
