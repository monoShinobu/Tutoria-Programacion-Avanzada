
package tutoria1.ejerciciosVarios;

import java.util.Scanner;

/**
 *
 * @author puras
 */
public class ejercicios {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        //ejercicio 1
        /*
        String palabra1;
        String palabra2;
        
        System.out.println("Ingrese la primera palabra");
        palabra1 = lectura.nextLine();
        System.out.println("Ingrese la segunda palabra");
        palabra2 = lectura.nextLine();
        
        System.out.println("\n");
        
        if(palabra1.length() > palabra2.length()){
            System.out.println("La palabra "+ palabra1 + " es mas larga que "+ palabra2);
        }else{
            System.out.println("La palabra "+ palabra2 + " es mas larga que "+ palabra1);
        }
        */
        
        //ejercicio 2
        /*
        int numero;
        int factorial = 1;
        
        System.out.println("Ingresa un entero");
        numero = lectura.nextInt();
        
        for(int i=2; i<=numero;i++){
            factorial = factorial*i;
        }
        
        System.out.println("El factorial de " + numero + " es: "+factorial);
        */
        
        //ejercicio 3
        /*
        float nota1, nota2, nota3, prom, eximicion, notaAprobacion;

        System.out.print("Ingrese la primer nota: ");
        nota1 = lectura.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = lectura.nextFloat();
        System.out.print("Ingrese la tercer nota: ");
        nota3 = lectura.nextFloat();

        prom = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio: " + prom);

        if (nota1 > 4 && nota2 > 4 && nota3 > 4) {
            eximicion = 5.0f;
        } else {
            eximicion = 5.5f;
        }

        if (prom > eximicion) {
            System.out.println("El usuario se eximió y aprobó");
        } else {
            notaAprobacion = (4 - (prom * 0.7f)) / 0.3f;
            System.out.println("El usuario no se eximió y necesita un " + notaAprobacion + " para aprobar");
        }
        */
        
        //ejercicio 4
        System.out.print("Ingrese el primer lado: ");
        int lado1 = lectura.nextInt();
        
        System.out.print("Ingrese el segundo lado: ");
        int lado2 = lectura.nextInt();
        
        System.out.print("Ingrese el tercer lado: ");
        int lado3 = lectura.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triángulo equilátero");
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.println("Es un triángulo escaleno");
            
        } else {
            System.out.println("Es un triángulo isósceles");
        }
        
    }
}
