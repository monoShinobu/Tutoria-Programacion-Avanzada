/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria1.ejercicio2;

/**
 *
 * @author puras
 */
public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int cantidadEjemplares;

    //constructor
    public Libro(String titulo, String autor, int cantidadEjemplares) {
        setTitulo(titulo);
        setAutor(autor);
        setCantidadEjemplares(cantidadEjemplares);
    }
    
    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setCantidadEjemplares(int cantidadEje){
        this.cantidadEjemplares = cantidadEje;
    }

    //getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getCantidadEjemplares() {
        return this.cantidadEjemplares;
    }

    //Metodos
    public void prestar() {
        if (this.cantidadEjemplares > 0) {
            this.cantidadEjemplares--;
            System.out.println("El libro " + this.titulo + " se ha prestado.");
        } else {
            System.out.println("No quedan ejemplares disponibles del libro " + this.titulo);
        }
    }

    public void devolver() {
        this.cantidadEjemplares++;
        System.out.println("El libro " + this.titulo + " se ha devuelto.");
    }
    
    @Override
    public String toString(){
        return "Libro{ "+
                " titulo: " + getTitulo() + 
                ", autor: " + getAutor() + 
                ", cantidad " + getCantidadEjemplares() +
                "}";
    }
    
    
}
