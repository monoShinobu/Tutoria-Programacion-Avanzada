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
public class Main {

    public static void main(String[] args) {
        //agregamos la universidad
        Universidad universidad = new Universidad("Andres Bello");
        
        //agregamos las facultades
        Facultad[] facul =  new Facultad[2];
        facul[0] = new Facultad("Ingenieria", universidad);
        facul[1] =  new Facultad("Ciencias Exactas", universidad);
        
        //realizamos la union de universidad a facultad
        universidad.asignarFacultades(facul);
        
        //agregamos las carreras
        Carrera[] carreInge = new Carrera[2];
        carreInge[0] = new Carrera("Ingenieria Informatica", facul[0]);
        carreInge[1] = new Carrera("Ingenieria Industrial", facul[0]);
        
        Carrera[] carreCien = new Carrera[2];
        carreCien[0] = new Carrera("Quimica", facul[1]);
        carreCien[1] = new Carrera("Fisica", facul[1]);
        
        //realizamos la union carrera a facultad
        facul[0].asignarCarrera(carreInge);
        facul[1].asignarCarrera(carreCien);
        
        //agregamos los estudiantes
        Alumno[] alumnosInfo = new Alumno[2];
        Alumno[] alumnosIndus = new Alumno[2];
        Alumno[] alumnosQuimi = new Alumno[2];
        Alumno[] alumnosFisica = new Alumno[2];
        
        alumnosInfo[0] = new Alumno("Jaime", "Velasquez", carreInge[0]);
        alumnosInfo[1] = new Alumno("Rodolfo", "Valentin", carreInge[0]);
        
        alumnosIndus[0] = new Alumno("Vincent", "Depassier", carreInge[1]);
        alumnosIndus[1] = new Alumno("Lucciano", "Prado", carreInge[1]);
        
        alumnosQuimi[0] = new Alumno("Fernando", "Montenegro", carreCien[0]);
        alumnosQuimi[1] = new Alumno("Joaquin", "Fuentes", carreCien[0]);
        
        alumnosFisica[0] = new Alumno("Cesar", "Roudergue", carreCien[1]);
        alumnosFisica[1] = new Alumno("Javier", "Cordero", carreCien[1]);
        
        //creamos la union carrea alumno
        carreInge[0].asignarAlumno(alumnosInfo);
        carreInge[1].asignarAlumno(alumnosIndus);
        
        carreCien[0].asignarAlumno(alumnosQuimi);
        carreCien[1].asignarAlumno(alumnosFisica);
                
        //agregamos los profesores
        Profesor profesor1 = new Profesor("Roberto", "Leon", carreInge);
        Profesor profesor2 = new Profesor("Romina", "Torres", carreCien);
        
        Carrera[] carreraGiannina = new Carrera[2];
        carreraGiannina[0] = carreInge[0];
        carreraGiannina[1] = carreCien[1];
        Profesor profesor3 = new Profesor("Giannina", "Costa", carreraGiannina);
        
        //realizamos la union profesor carrera
        Profesor[] profeCarr1 = new Profesor[1];
        profeCarr1[0] = profesor1;
        
        carreInge[0].asignarProfesore(profeCarr1);
        carreInge[1].asignarProfesore(profeCarr1);
        
        Profesor[] profeCarr2 = new Profesor[1];
        profeCarr2[0] = profesor2;
        
        carreCien[0].asignarProfesore(profeCarr2);
        carreCien[1].asignarProfesore(profeCarr2);
        
        carreInge[0].agregarProfesor(profesor3);
        carreCien[1].agregarProfesor(profesor3);
        
        //mostramos la univesidad y todo lo asociado a ella
        System.out.println(universidad.toString());
    }
}
