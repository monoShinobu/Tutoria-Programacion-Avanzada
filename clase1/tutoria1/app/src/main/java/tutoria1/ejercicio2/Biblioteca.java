/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria1.ejercicio2;

/**
 *
 * @author puras
 */
public class Biblioteca {
    //atributos
    private Libro[] libros;

    //constructor
    public Biblioteca(Libro[] libros) {
        setLibros(libros);
    }

    //setters
    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    //getters
    public Libro[] getLibros() {
        return this.libros;
    }

    //metodos
    public void prestarLibro(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro " + titulo + " no está disponible en la biblioteca.");
    }

    public boolean buscarLibro(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equals(titulo)) {
                System.out.println("El libro " + libro.getTitulo() + " está disponible en la biblioteca.");
                return true;
            }
        }
        System.out.println("El libro " + titulo + " no está disponible en la biblioteca.");
        return false;
    }
    
    public void devolverLibro(String titulo){
        for (Libro libro : this.libros){
            if (libro.getTitulo().equals(titulo)) {
                System.out.println("Libro devuelto");
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro " + titulo + " no está disponible en la biblioteca.");
    }

    @Override
    public String toString() {
        String inventario = "\nBiblioteca{  ListadoLibros: \n";
        for (Libro libro : libros) {
            inventario += libro.toString() + "\n";
        }
        inventario += "}";
        return inventario;
    }
}
