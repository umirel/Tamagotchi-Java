package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion = menuPrincipal();
        System.out.println("Has seleccionado: " + opcion);
    }

    private static int menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion < 0 || opcion > 4) {
            System.out.println("\n1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("----------------");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción del menú: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion < 0 || opcion > 4) {
                    System.out.println("Error. Has de elejir entre (0-4).");
                }
            } else {
                System.out.println("Error: Tienes que poner una variable tipo int.");
                sc.nextLine();
            }
        }
        return opcion;
    }
}