/*
 * This Java source file was generated by the Gradle 'init' task.
 
package tutoria1;

public class App {
    public static void main(String[] args) {
        String saludo = "Hola como estan";
        saludo[0] = h;
        System.out.println(saludo);
    }
}
*/
package tutoria1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int datoEntero = 5;
        float datoFlotante = 45.6F;
        double datoDoble = 145.6;
        boolean datoBooleano = true;
        char datoCaracter = 'a';
        String cadenaCaracter = "", cadena = "", cadenaSinEspacios="";
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa un entero");
        datoEntero = lectura.nextInt();
        System.out.println("Ingresa un Flotante");
        datoFlotante = lectura.nextFloat();
        System.out.println("Ingresa un Double");
        datoDoble = lectura.nextDouble();
        System.out.println("Ingresa un booleano");
        datoBooleano = lectura.nextBoolean();
        System.out.println("Ingresa un caracter");
        cadenaCaracter = lectura.next();
        datoCaracter = cadenaCaracter.charAt(0);
        
        lectura.skip("\n");
        System.out.println("Leyendo una cadena con nextLine");
        cadena = lectura.nextLine();
        System.out.println("Leyendo una cadena con next (no lee espacios)");
        cadenaSinEspacios = lectura.next();
        
        System.out.println("\nUn entero: "+datoEntero);
        System.out.println("Un flotante: "+datoFlotante);
        System.out.println("Un doble: "+datoDoble);
        System.out.println("Un booleano: "+datoBooleano);
        System.out.println("Caracter: "+datoCaracter);
        System.out.println("Cadena con espacios: "+cadena);
        System.out.println("Cadena sin espacios: "+cadenaSinEspacios);
    }
}

