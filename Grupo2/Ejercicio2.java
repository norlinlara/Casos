package Grupo2;

import javax.swing.*;

public class Ejercicio2 {
    public static void ejercicio2() {
        String letra = JOptionPane.showInputDialog("Ingrese su calificación con una letra:");

        if (letra == null || letra.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingresó ninguna calificación.");
            return;
        }

        // Quita espacios y convierte a mayúscula
        letra = letra.trim().toUpperCase();

        switch (letra) {
            case "A":
                JOptionPane.showMessageDialog(null, "Sobresaliente.");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Buena.");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Regular.");
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "Deficiente.");
                break;
            case "E":
                JOptionPane.showMessageDialog(null, "Insatisfactorio.");
                break;
            case "F":
                JOptionPane.showMessageDialog(null, "Reprobado.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción ingresada no válida.");
                break;
        }
    }
}
