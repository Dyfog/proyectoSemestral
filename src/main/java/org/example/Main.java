package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }


    public static boolean validarRangoNumero(int numero, int min, int max) {
        if (numero < min || numero > max) {
            System.out.println("El numero no esta dentro de los parametros");
            return false;
        }
        return true;
    }

    public static void leerArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static boolean validarPositivo(int numero) {
        if (numero < 0) {
            System.out.println("Numero ingresado no valido, se requiere de un valor positivo");
            return false;
        }
        return true;
    }

    public static boolean validarMayorA0(int numero) {
        if (numero <= 0) {
            System.out.println("Numero ingresado no valido, se requiere de un valor mayor a 0");
            return false;
        }
        return true;
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