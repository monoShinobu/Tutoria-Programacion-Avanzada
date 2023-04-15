/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio2;

/**
 *
 * @author puras
 */
public class Main {

    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", 150000, 32, 3);
        Televisor tv2 = new Televisor("LG", 200000, 42, 1);
        Celular cel1 = new Celular("iPhone", 2500000, "XS", 15, 2);
        Celular cel2 = new Celular("Samsung", 800000, "Galaxy S10", 32, 4);
        Computador comp1 = new Computador("Alienware", 2000000,"RTX 4090",1);
        Computador comp2 = new Computador("Perzonalizado", 1000000,"RX 7900 XT",1);

        Televisor[] televisores = new Televisor[2];
        televisores[0] = tv1;
        televisores[1] = tv2;
        
        Celular[] celulares = new Celular[2];
        celulares[0] = cel1;
        celulares[1] = cel2;
        
        Computador[] computadores = new Computador[2];
        computadores[0] = comp1;
        computadores[1] = comp2;
        
        Tienda tienda = new Tienda("tienda1", televisores, celulares, computadores);

        tienda.listarProductos();
    }
}
