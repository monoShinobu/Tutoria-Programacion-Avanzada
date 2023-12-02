/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutoria6.superabs;

import com.mycompany.tutoria6.interfaces.Conduccion;
import com.mycompany.tutoria6.varEntor.variables;

/**
 *
 * @author puras
 */
public class Vehiculo implements Conduccion {
    private String numeroSerie;
    private String modelo;
    private Integer marcha;
    private String estado;

    public Vehiculo(String numeroSerie, String modelo) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.marcha = variables.marchaPrimeraNum;
        this.estado = variables.estadoDetenido;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String acelerar(){
        if(getEstado() == variables.estadoEnMovimiento){
            return "Ya está acelerando";
        }else{
            setEstado(variables.estadoEnMovimiento);
            return "Acelerando.....";
        }
    }
    
    public String detener(){
        if(getEstado() == variables.estadoDetenido){
            return "Ya está detenido";
        }else{
            setEstado(variables.estadoDetenido);
            setMarcha(variables.marchaPrimeraNum);
            return "Deteniendo.....";
        }
    }
    
    public String bajarMarcha(){
        if(getMarcha() == variables.marchaPrimeraNum){
            return "Ya está en primera";
        } else {
            setMarcha(getMarcha() - 1);
            return "Bajó de marcha";
        }
    }
    
    public String subirMarcha(){
        if (getMarcha() == variables.marchaCuartaNum) {
            return "Ya está en la maxima marcha";
        } else {
            setMarcha(getMarcha() + 1);
            return "Subió de marcha";
        }
    }
    
    public String tipo(){
        return "Soy un tipo sin rellenar";
    }
    
    @Override
    public String toString(){
        String marcha = "";
        if(variables.marchaPrimeraNum == getMarcha()){
            marcha = variables.marchaPrimera;
        }else if(variables.marchaSegundaNum == getMarcha()){
            marcha = variables.marchaSegunda;
        }else if(variables.marchaTerceraNum == getMarcha()){
            marcha = variables.marchaTercera;
        }else if(variables.marchaCuartaNum == getMarcha()){
            marcha = variables.marchaCuarta;
        }
        return "Vehiculo = { nro serie = " + getNumeroSerie() + ", modelo = " + getModelo() + ", tipo = " + tipo() + "}" + 
                "\nestado = " + getEstado() + ", marcha = " + marcha + "\n";
    }

}
