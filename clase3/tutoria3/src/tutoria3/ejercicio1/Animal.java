/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria3.ejercicio1;

/**
 *
 * @author puras
 */
public class Animal {

    protected int codigo;
    protected int cantidad;
    protected String nombre;
    protected String sonido;

    public Animal(int codigo, int cantidad, String nombre) {
        setCodigo(codigo);
        setCantidad(cantidad);
        setNombre(nombre);
    }
    
    public void setSonido( String sonido){
        this.sonido = sonido;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    
    public String getSonido(){
        return this.sonido;
    }

    public void agregarAnimales(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        } else {
            System.out.println("Cantidad invalida de " + this.nombre);
        }
    }

    public String hacerSonido() {
        return getSonido();
    }
}
