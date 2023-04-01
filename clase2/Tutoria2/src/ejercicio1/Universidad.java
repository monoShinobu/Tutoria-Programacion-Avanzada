/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author puras
 */
public class Universidad {
    //Atributos
    private String nombre;
    private Facultad[] facultades;

    //constructor
    public Universidad(String nombre) {
        setNombre(nombre);
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
    public void asignarFacultades(Facultad[] facul){
        this.facultades = facul;
    }
    
    @Override
    public String toString() {
        String universidad = "\nUniversidad " + this.nombre
                 +"\n{  Facultades: \n";
        for (Facultad facultad : facultades) {
            universidad += facultad.toString() + "\n";
        }
        universidad += "}";
        return universidad;
    }
}
