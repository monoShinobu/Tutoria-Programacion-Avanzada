/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio1;

/**
 *
 * @author puras
 */
public class Main {

    public static void main(String[] args) {
        //definimos los animales
        Leon leon = new Leon(1);
        Gorila gorila = new Gorila(2);
        Pato pato = new Pato(3);
        Serpiente serpiente = new Serpiente(4);

        //agregamos las cantidades
        leon.agregarCantidad(5);
        System.out.println(leon.toString());
        
        gorila.agregarCantidad(5);
        System.out.println(gorila.toString());
        
        pato.agregarCantidad(5);
        System.out.println(pato.toString());
        
        serpiente.agregarCantidad(5);
        System.out.println(serpiente.toString());

        //mostramos el sonido de cada uno
        System.out.println("Leon "+leon.sonido());
        System.out.println("Gorila"+gorila.sonido());
        System.out.println("Serpiente"+serpiente.sonido());
        System.out.println("Pato"+pato.sonido());

    }

}
