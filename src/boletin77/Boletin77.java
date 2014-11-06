package boletin77;

import javax.swing.JOptionPane;

public class Boletin77 {

    public static void main(String[] args) {
        int opcion;
        double lado, base, altura, radio;
        double pi = 3.14;

        Metodos obx = new Metodos();

        String aux = JOptionPane.showInputDialog("Seleccione el área que quiere calcular \n1 Cadrado \n2 Triángulo \n3 Círculo ");

        opcion = Integer.parseInt(aux);

        obx.casos(opcion);

    }

}
