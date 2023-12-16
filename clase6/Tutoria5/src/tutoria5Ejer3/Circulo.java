/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria5Ejer3;

/**
 *
 * @author puras
 */

public class Circulo {
    private double radio;
    
    public Circulo(double radio) {
        setRadio(radio);
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio() {
        return this.radio;
    }
    
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    public double calcularDiametro() {
        return 2 * radio;
    }
}