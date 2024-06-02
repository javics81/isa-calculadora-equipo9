package calculadora.interfaz;

import calculadora.operaciones.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField display;
    private double num1, num2, result;
    private String operator;

    private Operacion suma = new Suma();
    private Operacion resta = new Resta();
    private Operacion multiplicacion = new Multiplicacion();
    private Operacion division = new Division();
    private Operacion raizCuadrada = new RaizCuadrada();
    private Operacion exponencial = new Exponencial();

    public Calculadora() {

        // Configuración de la ventana principal
        setTitle("Calculadora");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel para la pantalla
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setBackground(Color.WHITE); // Fondo blanco para el JTextField
        add(display, BorderLayout.NORTH);

        // Panel para los botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Botones de la calculadora reorganizados
        String[] buttons = {
                "1", "2", "3", "+", "-",
                "4", "5", "6", "*", "/",
                "7", "8", "9", "√", "e^",
                "C", "0", ".", "+/-", "="
        };

        int[] gridx = {
                0, 1, 2, 3, 4,
                0, 1, 2, 3, 4,
                0, 1, 2, 3, 4,
                0, 1, 2, 3, 4
        };

        int[] gridy = {
                0, 0, 0, 0, 0,
                1, 1, 1, 1, 1,
                2, 2, 2, 2, 2,
                3, 3, 3, 3, 3
        };

        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this);
            gbc.gridx = gridx[i];
            gbc.gridy = gridy[i];
            if (buttons[i].equals("=")) {
                gbc.gridwidth = 2; // El botón "=" ocupa dos espacios
                gbc.weightx = 0.4; // Ajuste del peso horizontal
            } else {
                gbc.gridwidth = 1;
                gbc.weightx = 0.2; // Ajuste del peso horizontal
            }
            gbc.weighty = 0.25; // Ajuste del peso vertical
            panel.add(button, gbc);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "C":
                    display.setText("");
                    break;
                case "=":
                    num2 = Double.parseDouble(display.getText());
                    result = realizarOperacion(num1, num2, operator);
                    display.setText(String.valueOf(result));
                    break;
                case "√":
                    num1 = Double.parseDouble(display.getText());
                    if (num1 >= 0) {
                        display.setText(String.valueOf(raizCuadrada.calcular(num1)));
                        operator = command;
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede obtener la raíz cuadrada de un número negativo", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "e^":
                    num1 = Double.parseDouble(display.getText());
                    display.setText(String.valueOf(exponencial.calcular(num1)));
                    operator = command;
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(display.getText());
                    display.setText("");
                    operator = command;
                    break;
                case "+/-": // Manejo del botón "+/-"
                    double number = Double.parseDouble(display.getText());
                    display.setText(String.valueOf(-number));
                    break;
                default:
                    display.setText(display.getText() + command);
            }
        } catch (NumberFormatException ex) {
            display.setText("Error");
        }
    }

    private double realizarOperacion(double num1, double num2, String operator) {
        if (operator != null) {
            switch (operator) {
                case "+":
                    return suma.calcular(num1,num2);
                case "-":
                    return resta.calcular(num1,num2);
                case "*":
                    return multiplicacion.calcular(num1,num2);
                case "/":
                    if (num2 != 0) {
                        return division.calcular(num1,num2);
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                        return 0;
                    }
                case "√":
                    if (num2 >= 0) {
                        return raizCuadrada.calcular(num2);
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede obtener la raíz cuadrada de un número negativo", "Error", JOptionPane.ERROR_MESSAGE);
                        return 0;
                    }
                case "e^":
                    return exponencial.calcular(num2);
                default:
                    return 0;
            }
        }
        else {
            return 0;
        }
    }

}
