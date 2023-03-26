
package tutoria1.ejercicio1;

/**
 *
 * @author puras
 */
public class Alumno {
        //Atributos
        private String nombre;
        private String apellidos;
        private double altura;
        private double peso;
        
        //constructor
        public Alumno(String nombre, String apellidos, double altura, double peso){
                setNombre(nombre);
                setApellidos(apellidos);
                setAltura(altura);
                setPeso(peso);
        }
        
        //mutadores o setters
        public void setNombre(String nombre){
                this.nombre = nombre;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }
        
        //accesadores o getters
        public String getNombre(){
                return this.nombre;
        }

        public String getApellidos() {
            return this.apellidos;
        }
        
        //metodos
        public double calcularIMC(){
                double imc;
                imc = this.peso / (this.altura * this.altura);
                return imc;
        }
    
}
