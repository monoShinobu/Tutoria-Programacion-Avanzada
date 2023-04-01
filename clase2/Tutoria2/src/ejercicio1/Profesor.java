/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author puras
 */
public class Profesor {

    //Atributos
    private String nombre;
    private String apellido;
    private Carrera[] carreras;

    //constructor
    public Profesor(String nombre, String apellido, Carrera[] carreras) {
        setNombre(nombre);
        setApellido(apellido);
        asignarCarrera(carreras);
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
    public void asignarCarrera(Carrera[] carre) {
        this.carreras = carre;
    }

    /*
    public String mostrarInfo() {
        String info = 
        return 
    }
     */
    @Override
    public String toString() {
        return "      Profesor{ "
                + " nombre: " + getNombre()
                + ", apellido: " + getApellido()
                + "}";
    }
}
