/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author puras
 */
public class Alumno {

    //Atributos
    private String nombre;
    private String apellido;
    private Carrera carrera;

    //constructor
    public Alumno(String nombre, String apellido, Carrera carrera) {
        setNombre(nombre);
        setApellido(apellido);
        asignarCarrera(carrera);
    }

    //mutadores o setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //accesadores o getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.nombre;
    }

    //metodos
    public void asignarCarrera(Carrera carre) {
        this.carrera = carre;
    }
    
    @Override
    public String toString() {
        return "        Alumno{ "
                + " nombre: " + getNombre()
                + ", apellido: " + getApellido()
                + "}";
    }
}
