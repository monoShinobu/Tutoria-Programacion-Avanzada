/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutoria6;

import com.mycompany.tutoria6.clases.Auto;
import com.mycompany.tutoria6.clases.Moto;
import com.mycompany.tutoria6.superabs.Vehiculo;
import java.util.Scanner;
/**
 *
 * @author puras
 */
public class Tutoria6 {

    public static void main(String[] args) {
        Auto auto1 = new Auto("123", "lambo");
        Auto auto2 = new Auto("456", "ferrari");
        Moto moto1 = new Moto("789", "ducati");
        
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = auto1;
        vehiculos[1] = auto2;
        vehiculos[2] = moto1;
        
        Scanner lectura = new Scanner(System.in);
        int pos = 0;
        String vehiSelec;
        Vehiculo vehiActual;
        
        while(true){
            pos = 0;
            for(Vehiculo vehiculo: vehiculos){
                System.out.println(pos + "). " + vehiculo.toString());
                pos++;
            }
            System.out.println("Para elegir el vehiculo ingrese su número \n Si desea terminar la ejecución, ingrese X");
            vehiSelec = lectura.nextLine();
            if(vehiSelec.contains("X")){
                break;
            } else {
                try{
                    vehiActual = vehiculos[Integer.parseInt(vehiSelec)];
                    System.out.println(vehiActual.toString());
                    System.out.println("Ingrese lo que quiera hacer con el vehiculo actual: ");
                    System.out.println("1) Acelerar");
                    System.out.println("2) Deterner");
                    System.out.println("3) Subir marcha");
                    System.out.println("4) Bajar marcha");
                    
                    int opcion = lectura.nextInt();
                    
                    if(opcion == 1){
                        System.out.println(vehiActual.acelerar());
                    }else if(opcion == 2){
                        System.out.println(vehiActual.detener());
                    }else if(opcion == 3){
                        System.out.println(vehiActual.subirMarcha());
                    } else if(opcion == 4){
                        System.out.println(vehiActual.bajarMarcha());
                    }else{
                        System.out.println("Numero ingresado erroneo");
                    }
                    
                }catch(Error e){
                    System.out.println("Valor erroneo");
                }
                lectura.skip("\n");
            }
            
            
        }
        
        
    }
}
