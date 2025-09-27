package Grupo1;

import javax.swing.*;

public class Ejercicio2 {
    public static void ejercicio2(){

        //Programa que identifique si un numero es positivo, negativo o cero

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (num > 0){

            System.out.println("El numero es positivo");

        }
        else if (num < 0){

            System.out.println("El numero es negativo");

        }
        else{

            System.out.println("El numero es igual a cero");

        }

    }
}
