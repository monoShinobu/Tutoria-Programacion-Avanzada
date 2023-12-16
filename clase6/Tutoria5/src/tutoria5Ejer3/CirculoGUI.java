package tutoria5Ejer3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CirculoGUI extends JFrame implements ActionListener{
    //componentes de la interfaz gráfica
    private JTextField campoRadio, campoPerimetro, campoDiametro, campoArea;
    private JButton botonCalcular;
    
    public CirculoGUI(){
        //configuración de la ventana
        setTitle("Calculadora de Circulo");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //creación de componentes
        JLabel labelRadio = new JLabel("Radio:");
        JLabel labelPerimetro = new JLabel("Perimetro:");
        JLabel labelDiametro = new JLabel("Diametro:");
        JLabel labelArea = new JLabel("Area:");
        
        campoRadio = new JTextField(10);
        campoPerimetro = new JTextField(10);
        campoPerimetro.setEditable(false);
        campoDiametro = new JTextField(10);
        campoDiametro.setEditable(false);
        campoArea = new JTextField(10);
        campoArea.setEditable(false);
        
        botonCalcular = new JButton("Calcular");
        botonCalcular.addActionListener(this);
        
        //panel de la interfaz gráfica
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(labelRadio);
        panel.add(campoRadio);
        panel.add(labelPerimetro);
        panel.add(campoPerimetro);
        panel.add(labelDiametro);
        panel.add(campoDiametro);
        panel.add(labelArea);
        panel.add(campoArea);
        panel.add(new JLabel(""));
        panel.add(botonCalcular);
        
        //agregar panel a la ventana
        getContentPane().add(panel);
    }
    
    public void actionPerformed(ActionEvent e){
        //verificar si se presionó el botón calcular
        if(e.getSource() == botonCalcular){
            //obtener el radio ingresado por el usuario
            double radio = Double.parseDouble(campoRadio.getText());
            
            //realizar los cálculos
            Circulo circulo = new Circulo(radio);
            double perimetro = circulo.calcularPerimetro();
            double diametro = circulo.calcularDiametro();
            double area = circulo.calcularArea();
            
            //mostrar los resultados en los campos de texto
            campoPerimetro.setText(String.valueOf(perimetro));
            campoDiametro.setText(String.valueOf(diametro));
            campoArea.setText(String.valueOf(area));
        }
    }
}
