package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    convertirTiempo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n**Calculadora de conversiones**");
        System.out.println("1. Tiempo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // TIEMPO
    // -----------------------------------------------------------------------------
    private static void convertirTiempo(Scanner scanner) {
        System.out.println("\n**Conversión de tiempo**");
        System.out.println("1. Horas a Minutos");
        System.out.println("2. Minutos a Horas");
        System.out.println("3. Minutos a Segundos");
        System.out.println("4. Segundos a Minutos");
        System.out.println("0. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");

        int opcionTiempo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcionTiempo) {
            case 1:
                convertirHorasAMinutos(scanner);
                break;
            case 2:
                convertirMinutosAHoras(scanner);
                break;
            case 3:
                convertirMinutosASegundos(scanner);
                break;
            case 4:
                convertirSegundosAMinutos(scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void convertirHorasAMinutos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de horas ");
        double horas = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double minutos = horas * 60;
        System.out.println(horas + " horas equivalen a " + minutos + " minutos.");
    }

    private static void convertirMinutosAHoras(Scanner scanner) {
        System.out.print("Ingrese la cantidad de minutos: ");
        double minutos = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double horas = minutos / 60;
        System.out.println(minutos + " minutos equivalen a " + horas + " horas.");
    }

    private static void convertirMinutosASegundos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de minutos: ");
        double minutos = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double segundos = minutos * 60;
        System.out.println(minutos + " minutos equivalen a " + segundos + " segundos");
    }

    private static void convertirSegundosAMinutos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de segundos: ");
        double segundos = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double minutos = segundos / 60;
        System.out.println(segundos + " segundos equivalen a " + minutos + " minutos");
    }
}
