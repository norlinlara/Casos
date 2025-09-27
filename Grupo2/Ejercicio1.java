package Grupo2;
import java.util.Scanner;
public class Ejercicio1 {

    public static void ejercicio1() {
            Scanner entrada = new Scanner(System.in);

            int opcion;
            String bebida = "";

            System.out.println("MENU DE OPCIONES: ");

            System.out.println(" 1. Pususas");
            System.out.println(" 2. Baleadas");
            System.out.println(" 3. Pollo");

            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Opcion agregada.");
                    System.out.println("Desea agregar una bebida? (Si/No): ");
                    bebida = entrada.next();

                    if ("Si".equals(bebida)){
                        System.out.println("\nBebida agregada.");
                        System.out.println("Pedido completo.");
                        System.out.println("\n----- PEDIDO ----");
                        System.out.println("\n  1. Pupusas");
                        System.out.println("  2. Bebdia: Si");
                    }else{
                        System.out.println("\nBPedido completo.");
                        System.out.println("\n----- PEDIDO ----");
                        System.out.println("\n  1. Pupusas");
                        System.out.println("  2. Bebdia: No");
                    }
                    break;
                case 2:
                    System.out.println("Opcion agregada.");
                    System.out.println("Desea agregar una bebida? (Si/No): ");
                    bebida = entrada.next();
                    if ("Si".equals(bebida)){
                        System.out.println("\nBebida agregada.");
                        System.out.println("Pedido completo.");
                        System.out.println("\n----- PEDIDO ----");
                        System.out.println("\n  1. Baleadas");
                        System.out.println("  2. Bebdia: Si");
                    }else{
                        System.out.println("\nBPedido completo.");
                        System.out.println("\n----- PEDIDO ----");
                        System.out.println("\n  1. Baleadas");
                        System.out.println("  2. Bebdia: No");
                    }
                    break;
                case 3:
                    System.out.println("Opcion agregada.");
                    System.out.println("Desea agregar una bebida? (Si/No): ");
                    bebida = entrada.next();
                    if ("Si".equals(bebida)){
                        System.out.println("\nBebida agregada.");
                        System.out.println("Pedido completo.");
                        System.out.println("\n----- PEDIDO ----");
                        System.out.println("\n  1. Pollo");
                        System.out.println("  2. Bebdia: Si");
                    }else{
                        System.out.println("\nPedido completo.");
                        System.out.println("\n----- PEDIDO ----");
                        System.out.println("\n  1. Pollo");
                        System.out.println("  2. Bebdia: No");
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada es invalida o no existe.");
                    break;
            }
    }
}