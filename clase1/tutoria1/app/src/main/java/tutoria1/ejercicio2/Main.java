
package tutoria1.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author puras
 */
public class Main {
    public static void main(String[] args) {
        //Creamos el arreglo con los libros
        Libro[] libros = new Libro[5];
        libros[0] = new Libro("El problema de los tres cuerpos", "Liu Cixin",5);
        libros[1] = new Libro("El bosque oscuro", "Liu Cixin", 1);
        libros[2] = new Libro("El fin de la muerte", "Liu Cixin", 7);
        libros[3] = new Libro("Programacion para principiantes", "Chayanne", 5);
        libros[4] = new Libro("Como respetar a las mujeres", "Kike Morande", 4);
        
        //Creamos la biblioteca
        Biblioteca biblioteca = new Biblioteca(libros);
        
        //verificamos que la biblioteca esté creada
        System.out.println(biblioteca.toString());
        
        String libro;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("¿Que libro desea pedir?");
        libro = lectura.nextLine();
        
        biblioteca.buscarLibro(libro);
        
        //volvemos a verificar la biblioteca para ver si se descontó el ejemplar
        System.out.println(biblioteca.toString());
        
    }
}
