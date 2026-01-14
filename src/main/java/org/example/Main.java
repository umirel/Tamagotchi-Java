package org.example;

import java.util.Scanner;

public class Main {

    static int saciedad = 6;
    static int energia = 6;
    static int diversion = 6;

    public static void main(String[] args) {
        int opcion = menuPrincipal();
        System.out.println("Has seleccionado: " + opcion);
        mostrarEstado();
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

    private static void mostrarEstado(){
        System.out.println("\n--- ESTADO ACTUAL ---");
        System.out.println("Saciedad: " + saciedad + " | Energía: " + energia + " | Diversión: " + diversion);

        if (saciedad <= 0 || energia <= 0 || diversion <= 0){
            System.out.println("(x_x) :( Game Over ):");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }else if (saciedad <= 4){
            System.out.println("(• ︵ •) ¡ Tengo hambre! ");
            System.out.println(" /|x|\\");
            System.out.println("  | |");
        }else if(energia<=4){
            System.out.println("(-_-) Zzz");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }else if(diversion<=4){
            System.out.println("(-︵-) Estoy aburrido");
            System.out.println("/|_|\\ ¡Juega conmigo!");
            System.out.println(" / \\");
        }else{
            System.out.println("(•‿•) ¡Estoy feliz!");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }
    }
}