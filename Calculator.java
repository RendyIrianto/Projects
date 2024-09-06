 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        JTextField textField = new JTextField();
        textField.setBounds(30, 40, 280, 30);
        frame.add(textField);

        JButton button1 = new JButton("1");
        button1.setBounds(40, 100, 50, 40);
        frame.add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(100, 100, 50, 40);
        frame.add(button2);

        JButton addButton = new JButton("+");
        addButton.setBounds(160, 100, 50, 40);
        frame.add(addButton);

        JButton equalButton = new JButton("=");
        addButton.setBounds(160, 100, 50, 40);
        frame.add(addButton);

        // Add action listeners for button functionality
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle addition logic here
                textField.setText("yo");
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}