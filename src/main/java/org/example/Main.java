package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        eleccionMaterial();
    }
    public static int eleccionMaterial(){
        System.out.println("Ingrese el número que corresponda a su elección: ");
        System.out.println("[0] Acrílico");
        System.out.println("[1] PolyGel");
        System.out.println("[2] GelX");
        int eleccion=ingresarSoloNumero();
        return eleccion;
    }
    public static int calculoMaterial(int eleccion){
        switch (eleccion){
            case 0:
                return 6000;
            case 1:
                return 5000;
            case 2:
                return 4000;
            /*default:
                System.out.println("El material no ha sido especificado, se volverá al menu");
                */
        }
        return 0;
    }
    public static int[] eleccionDiseño() {
        int elecciones[] =new int[2];
        System.out.println("Ingrese cantidad de diseños, son 1 por cada uña, 10 en total");
        System.out.println("Diseños simples: ");
        int cantSimples = ingresarSoloNumero();
        while (cantSimples > 10) {
            System.out.println("Ingrese un número menor a 11");
            cantSimples = ingresarSoloNumero();
        }
        elecciones[0]= cantSimples;
        System.out.println("Diseños sofisticados: ");
        int cantSofisticados = ingresarSoloNumero();
        while (cantSimples + cantSofisticados > 10){
            cantSofisticados = ingresarSoloNumero();
        }
        elecciones[1]= cantSofisticados;
        return elecciones;
    }
    public static int calculoDiseño(int[] eleccion) {
        int costo = ((eleccion[0] * 500) + eleccion[1] * 1200);
        return costo;
    }

    public static int ingresarSoloNumero(){
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número entero:");
            in.next();
        }
        int numero = in.nextInt();
        return numero;
    }
}