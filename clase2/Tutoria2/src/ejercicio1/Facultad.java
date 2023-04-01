/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author puras
 */
public class Facultad {

    //Atributos
    private String nombre;
    private Carrera[] carreras;
    private Universidad universidad;

    //constructor
    public Facultad(String nombre, Universidad universidad) {
        setNombre(nombre);
        asignarUniversidad(universidad);
    }

    //mutadores o setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //accesadores o getters
    public String getNombre() {
        return this.nombre;
    }

    //metodos
    public void asignarUniversidad(Universidad uni) {
        this.universidad = uni;
    }

    public void asignarCarrera(Carrera[] carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        String facultad = "\nFacultad " + this.nombre
                +"\n  Carreras: \n";
        for (Carrera carrera : carreras) {
            facultad += carrera.toString() + "\n";
        }
        facultad += "}";
        return facultad;
    }
}
