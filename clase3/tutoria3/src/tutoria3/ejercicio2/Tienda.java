/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio2;

/**
 *
 * @author puras
 */
public class Tienda {
    private String nombre;
    private Televisor[] televisores;
    private Celular[] celulares;
    private Computador[] computadores;

    public Tienda(String nombre, Televisor[] televisores, Celular[] celulares, Computador[] computadores) {
        setNombre(nombre);
        setTelevisores(televisores);
        setComputadores(computadores);
        setCelulares(celulares);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTelevisores(Televisor[] televisores){
        this.televisores = televisores;
    }
    
    public void setComputadores(Computador[] computadores){
        this.computadores = computadores;
    }
    
    public void setCelulares(Celular[] celulares){
        this.celulares = celulares;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void listarProductos() {
        for (Televisor t : this.televisores) {
            System.out.println(t.toString());
        }
        for (Computador c : this.computadores) {
            System.out.println(c.toString());
        }
        for (Celular ce : this.celulares) {
            System.out.println(ce.toString());
        }
    }
}
