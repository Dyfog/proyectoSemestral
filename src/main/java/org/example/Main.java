package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        eleccionCantColores();

    }

    public static int eleccionCantColores(){
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese la cantidad de colores que elegirá: ");
        int cantColores = validarMayorA0(ingresarSoloNumero());


        return cantColores;
    }

    public static int validarRangoNumero(int numero, int min, int max) {
        Scanner in = new Scanner(System.in);
        while (numero < min || numero > max) {
            System.out.println("El numero no esta dentro de los parametros, ingrese nuevamente: ");
            numero = in.nextInt();
        }
        return numero;
    }

    public static void leerArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static int validarPositivo(int numero) {
        Scanner in = new Scanner(System.in);
        while (numero < 0) {
            System.out.println("Numero negativo, ingrese nuevamente");
            numero = ingresarSoloNumero();
        }
        return numero;
    }

    public static int validarMayorA0(int numero) {
        Scanner in = new Scanner(System.in);
        while (numero <= 0) {
            System.out.println("Numero no valido, ingrese nuevamente");
            numero = ingresarSoloNumero();
        }
        return numero;
    }

    public static int ingresarSoloNumero() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número entero:");
            in.next();
        }
        int numero = in.nextInt();
        return numero;
    }


}