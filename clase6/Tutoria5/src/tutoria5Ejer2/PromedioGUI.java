/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria5Ejer2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PromedioGUI extends JFrame implements ActionListener {

    private JLabel labelCantidad;
    private JTextField textCantidad;
    private JButton botonCalcular;
    private JTextArea textAreaNotas;

    public PromedioGUI() {
        super("Calculadora de Promedio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelCantidad = new JLabel("Cantidad de notas:");
        textCantidad = new JTextField(10);
        botonCalcular = new JButton("Calcular");
        textAreaNotas = new JTextArea(10, 20);
        textAreaNotas.setEditable(false);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(labelCantidad);
        panel.add(textCantidad);
        panel.add(botonCalcular);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(textAreaNotas), BorderLayout.CENTER);

        botonCalcular.addActionListener(this);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calcular")) {
            int cantidad = Integer.parseInt(textCantidad.getText());
            double promedio = 0.0;
            for (int i = 1; i <= cantidad; i++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese nota #" + i));
                promedio += nota;
            }
            promedio /= cantidad;
            textAreaNotas.setText("El promedio es: " + promedio);
        }
    }
}
