/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tutoria5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class UserGUI extends JFrame implements ActionListener {

    private ArrayList<User> userList;
    private JTextField nameField;
    private JTextField ageField;
    private JTextArea userListArea;

    public UserGUI() {
        //Lista de usuarios
        userList = new ArrayList<User>();

        //frame
        setTitle("User List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        //paneles
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        JPanel userPanel = new JPanel(new BorderLayout());

        //nombre campos
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(3);

        //inputs
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(ageLabel);
        inputPanel.add(ageField);

        //lista de usuarios
        userListArea = new JTextArea();
        userListArea.setEditable(false);
        userPanel.add(userListArea, BorderLayout.CENTER);

        //botones
        JButton addButton = new JButton("Add User");
        addButton.addActionListener(this);

        //agregar componentes
        add(inputPanel, BorderLayout.NORTH);
        add(userPanel, BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add User")) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            User user = new User(name, age);
            userList.add(user);
            displayUsers();
            nameField.setText("");
            ageField.setText("");
        }
    }

    private void displayUsers() {
        userListArea.setText("");
        for (User user : userList) {
            userListArea.append(user.getName() + ", " + user.getAge() + "\n");
        }
    }
}
