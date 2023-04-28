/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tutoria4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author puras
 */
public class Tutoria4 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        //ejercicio 1
        /*
        // Definir matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Crear matriz de resultado
        int[][] result = new int[matrixA.length][matrixB.length];
        
        // Realizar la multiplicación de matrices
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Imprimir matriz de resultado
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
         */
        //ejercicio 2
        /*
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.print("Ingrese numero: ");
            int num = lectura.nextInt();
            if (num == 0) {
                break;
            } else {
                numeros.add(num);
            }
        }

        ArrayList<Integer> numerosOrdenados = new ArrayList<>();
        int n = numeros.size();

        while (true) {
            if (numeros.size() == 0) {
                break;
            }
            int mayor = numeros.get(0);
            for (int i = 1; i < numeros.size(); i++) {
                if (mayor < numeros.get(i)) {
                    mayor = numeros.get(i);
                }
            }
            numeros.remove((Integer) mayor);
            numerosOrdenados.add(mayor);
        }

        System.out.println(numerosOrdenados);
         */
        //ejercicio 3
        /*
        System.out.print("cantidad de datos experimento: ");
        int cant = lectura.nextInt();

        System.out.print("cantidad de valores extremos (n): ");
        int outliers = lectura.nextInt();

        ArrayList<Integer> datos = new ArrayList<Integer>();

        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese numero: ");
            int num = lectura.nextInt();
            datos.add(num);
        }

        Collections.sort(datos);

        for (int i = 0; i < outliers; i++) {
            datos.remove(0);
            datos.remove(datos.size() - 1);
        }

        System.out.println(datos);
         */
        //ejercicio 4
        /*
        ArrayList<Integer> numeros = new ArrayList<>();
        while (true) {
            System.out.print("Ingrese numero: ");
            String num = lectura.next();

            if (num.equals("+")) {
                break;
            } else {
                int num2 = Integer.parseInt(num);
                numeros.add(num2);
            }

        }
        
        Collections.sort(numeros);
        
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        
        for (int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) < 0){
                neg.add(numeros.get(i));
            }else if (numeros.get(i) == 0){
                zeros.add(numeros.get(i) );
            }else{
                pos.add(numeros.get(i));
            }
        }
        
        System.out.println(neg);
        System.out.println(zeros);
        System.out.println(pos);
         */
        //ejercicio 5
        /*
        System.out.print("Ingrese numero: ");
        int num = lectura.nextInt();
        ArrayList<Integer> divi = new ArrayList<>();
        
        for (int i = 1; i<num+1;i++){
            if ( num % i == 0){
                divi.add(i);
            }
        }
        System.out.println("Los divisores de "+ num +" son: ");
        System.out.println(divi);
         */
        //ejercicio 6
        /*
        System.out.print("Ingrese numero: ");
        int num = lectura.nextInt();
        ArrayList<Integer> divi = new ArrayList<>();
        
        for (int i = 1; i<num;i++){
            if ( num % i == 0){
                divi.add(i);
            }
        }
        System.out.println("Los divisores de "+ num +" son: ");
        System.out.println(divi);
        
        int suma = 0;
        
        for (int i = 0; i<divi.size();i++){
            suma += divi.get(i);
        }
        
        System.out.print("La suma de sus divisores es "+suma+" por lo tanto ");
        
        if (suma == num){
            System.out.println("es PERFECTO");
        }else {
            System.out.println("NO es PERFECTO");
        }
         */
        //ejercicio 7
        ArrayList<Double> numeros = new ArrayList<>();
        double suma = 0;

        while (true) {
            System.out.print("Ingrese numero: ");
            String input = lectura.nextLine();
            if (input.equals("")) {
                break;
            } else {
                double num = Double.parseDouble(input);
                numeros.add(num);
                suma += num;
            }
        }

        double prom = Math.round(suma / numeros.size() * 1000.0) / 1000.0;

        System.out.printf("El promedio es: %.1f%n", prom);

        ArrayList<Double> numMenor = new ArrayList<>();
        ArrayList<Double> numMayor = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            double num = numeros.get(i);
            if (num < prom) {
                numMenor.add(num);
            } else if (num > prom) {
                numMayor.add(num);
            }
        }

        numMenor.sort(null);
        numMayor.sort(null);

        System.out.println("numeros bajo el promedio: " + numMenor);
        System.out.println("numeros sobre el promedio: " + numMayor);

    }
}
