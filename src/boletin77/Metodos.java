package boletin77;

import javax.swing.JOptionPane;

public class Metodos {

    private double lado;
    private double base;
    private double altura;
    private double radio;
    private double pi = 3.14;
    private int opcion;

    public Metodos() {

    }

    public Metodos(double lado, double base, double altura, double radio, double pi, int area) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
        this.pi = pi;
        this.opcion = opcion;
    }

    public void casos(int opcion) {

        switch (opcion) {
            case 1:
                String aux = JOptionPane.showInputDialog(null, " Introduzca el lado: ");
                lado = Double.parseDouble(aux);
                JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + lado * lado);
                break;
            case 2:
                String aux2 = JOptionPane.showInputDialog(null, "Introduzca la base: ");
                base = Double.parseDouble(aux2);
                String aux3 = JOptionPane.showInputDialog(null, "Introduzca la altura: ");
                altura = Double.parseDouble(aux3);
                JOptionPane.showMessageDialog(null, "El area del triángulo es: " + (base * altura)/2);
                break;

            case 3:
                String aux4 = JOptionPane.showInputDialog(null, "Introduzca el radio: ");
                radio = Double.parseDouble(aux4);
                JOptionPane.showMessageDialog(null, "El área del círculo es: " + pi * Math.pow(radio, 2) );
                break;

            case 4:
            default:
                JOptionPane.showMessageDialog(null, "Error");
                break;
        }

    }

}
