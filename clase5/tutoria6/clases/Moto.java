/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutoria6.clases;

import com.mycompany.tutoria6.superabs.Vehiculo;

import com.mycompany.tutoria6.interfaces.Conduccion;

/**
 *
 * @author puras
 */
public class Moto extends Vehiculo {

    public Moto(String numeroSerie, String modelo) {
        super(numeroSerie, modelo);
    }
    
    @Override
    public String tipo(){
        return "Moto";
    }
}
