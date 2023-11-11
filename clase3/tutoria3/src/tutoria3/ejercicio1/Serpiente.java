/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio1;

/**
 *
 * @author puras
 */
public class Serpiente extends Animal {
    public Serpiente(int codigo){
        super(codigo, 0, "Serpiente");
    }
    
    public void agregarCantidad(int cantidad){
        super.agregarAnimales(cantidad);
    }
    
    public String sonido(){
        return super.hacerSonido();
    }
    
    @Override
    public String toString() {
        return "La cantidad de serpientes es " + this.cantidad;
    }
            
}
