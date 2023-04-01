/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Arrays;

/**
 *
 * @author puras
 */
public class Carrera {

    //Atributos
    private String nombre;
    private Alumno[] alumnos;
    private Profesor[] profesores;
    private Facultad facultad;

    //constructor
    public Carrera(String nombre, Facultad facultad) {
        setNombre(nombre);
        asignarFacultad(facultad);
    }

    //mutadores o setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //accesadores o getters
    public String getNombre() {
        return this.nombre;
    }

    public Profesor[] getProfesores() {
        return this.profesores;
    }

    //metodos
    public void asignarFacultad(Facultad facul) {
        this.facultad = facul;
    }

    public void asignarAlumno(Alumno[] alumn) {
        this.alumnos = alumn;
    }

    public void asignarProfesore(Profesor[] profe) {
        this.profesores = profe;
    }

    public void agregarProfesor(Profesor nuevoProfesor) {
        this.profesores = Arrays.copyOf(this.profesores, this.profesores.length + 1);
        this.profesores[this.profesores.length - 1] = nuevoProfesor;
    }

    @Override
    public String toString() {
        String carrera = "\nCarrera " + this.nombre
                + "\n       Alumnos: \n";
        for (Alumno alumno : alumnos) {
            carrera += alumno.toString() + "\n";
        }
        carrera += ",\n      Profesores: \n";
        for (Profesor profesor : profesores) {
            carrera += profesor.toString() + "\n";
        }
        carrera += "}";
        return carrera;
    }
}
