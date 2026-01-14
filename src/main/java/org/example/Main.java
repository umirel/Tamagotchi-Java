package org.example;

import java.util.Scanner;

public class Main {

    static int saciedad = 6;
    static int energia = 6;
    static int diversion = 6;
    static int experiencia = 0;

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = menuPrincipal();

            switch (opcion) {
                case 1:
                    mostrarEstado();
                    break;
                case 2:
                    comer();
                    break;
                case 3:
                    jugar();
                    break;
                case 4:
                    dormir();
                    break;
                case 5:
                    entrenar();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
            }
        } while (opcion != 0);
    }

    private static int menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion < 0 || opcion > 4) {
            System.out.println("\n1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("5. Entrenar");
            System.out.println("----------------");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción del menú: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion < 0 || opcion > 5) {
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
        System.out.println("Saciedad: " + saciedad + " | Energía: " + energia + " | Diversión: " + diversion + " | EXP: " + experiencia);

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

    private static void comer() {
        if (saciedad >= 10) {
            System.out.println("No tengo hambre");
        } else {
            saciedad += 4;
            if (saciedad > 10) {
                saciedad = 10;
            }
            diversion -= 2;
            System.out.println("¡Ñam ñam! La saciedad ha aumentado.");
            mostrarEstado();
        }
    }

    private static void jugar() {
        if (diversion >= 10) {
            System.out.println("Ahora no me apetece jugar");
        } else {
            diversion += 4;
            if (diversion > 10) {
                diversion = 10;
            }
            saciedad -= 2;
            energia -= 2;
            System.out.println("¡Yuhu! Nos lo estamos pasando genial.");
            mostrarEstado();
        }
    }

    private static void dormir() {
        if (energia >= 10) {
            System.out.println("No tengo sueño");
        } else {
            energia += 3;
            if (energia > 10) {
                energia = 10;
            }
            saciedad -= 2;
            diversion -= 2;
            System.out.println("Zzz... El tamagotchi está durmiendo.");
            mostrarEstado();
        }
    }

    private static void entrenar() {
        if (energia < 4) {
            System.out.println("Estoy demasiado agotado para entrenar...");
        } else {
            experiencia += 10;
            energia -= 4;
            saciedad -= 2;
            System.out.println("¡Entrenamiento duro! Has ganado 10 puntos de experiencia.");
            mostrarEstado();
        }
    }
}