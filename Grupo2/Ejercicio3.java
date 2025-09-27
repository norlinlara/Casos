package Grupo2;

import javax.swing.*;

public class Ejercicio3 {
    public static void ejercicio3() {

        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número 1"));

        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número 2"));

        int operacion = Integer.parseInt(JOptionPane.showInputDialog(
                "Operaciones matemáticas \n1. Suma \n2. Resta \n3. Multiplicación \n4. División \nElija una opción:"
        ));

        switch (operacion) {
            case 1:
                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 + numero2));
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 - numero2));
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 * numero2));
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 / numero2));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción inválida ingresada o no existe");
                break;
        }
    }
}
