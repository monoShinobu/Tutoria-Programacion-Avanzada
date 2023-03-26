package tutoria1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author puras
 */
public class Main {

    public static void main(String[] args) {
        int cantidadAlumnos;
        String nombre;
        String apellidos;
        double altura;
        double peso;

        Scanner lectura = new Scanner(System.in);

        //ingresamos por pantalla la cantidad de alumnos
        System.out.println("Ingresa la cantidad de alumnos: ");
        cantidadAlumnos = lectura.nextInt();

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        //arreglo para agregar los alumnos dependiendo de la cantidad ingresada
        for (int i = 0; i < cantidadAlumnos; i++) {
            
            //ingresamos los datos de cada alumno
            System.out.println("\nIngrese la informacion del alumno nro " + (i + 1));
            
            lectura.skip("\n");
            System.out.println("Ingrese el nombre");
            nombre = lectura.nextLine();
            
            System.out.println("Ingrese los apellidos");
            apellidos = lectura.nextLine();
            
            System.out.println("Ingrese la altura");
            altura = lectura.nextDouble();
            
            System.out.println("Ingrese el peso");
            peso = lectura.nextDouble();
            
            alumnos[i] = new Alumno(nombre, apellidos, altura, peso);
            
        }
        
        //mostramos por pantalla el nombre completo y el imc de cada alumno
        System.out.println("\n");
        for (Alumno alumno : alumnos){
            System.out.println(alumno.getNombre() + " " + alumno.getApellidos() + " tiene un IMC de " + alumno.calcularIMC());
        }

    }
}
