package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        eleccionMaterial();
        eleccionLargo();
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
        int[] elecciones =new int[2];
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
        int costo = ((eleccion[0] * 500) + (eleccion[1] * 1200));
        return costo;
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

    public static int eleccionLargo(){
        System.out.println("ingrese el largo de uña que desea");
        System.out.println("0.- Natural");
        System.out.println("1.- S");
        System.out.println("2.- M");
        System.out.println("3.- L");
        int eleccion = ingresarSoloNumero();
        return eleccion;
    }

   /*public static int calcValorLargo(int eleccionLargo){
       switch (eleccionLargo){
            case 0:
                return 0;
           case 1:
               return 5000;
           case 2:
               return 7000;
           case 3:
               return 9000;
           default:
               System.out.println("el valor del largo elegido no esta especificado, este no se modificara, volviendo al menu");
               menu();
        }
   }
    */

    public static int calcularIva(int precioPreliminar) {
        int iva = 0;
        iva = (precioPreliminar * 19) / 100;
        return iva;
    }

    public static int calcularPrecioFinal(int[] precios) {
        int sumas = 0;
        for (int i = 0; i < precios.length; i++) {
            sumas += precios[i];
        }
        return sumas;
    }

    public static int[] valorDecora(int[] arregloAux) {
        int[] arregloAux2 = new int[2];
        arregloAux2[0] = arregloAux[0] * 600;
        arregloAux2[1] = arregloAux[1] * 1500;
        return arregloAux2;
    }

    public static int[] eleccionDecora() {
        Scanner teclado = new Scanner(System.in);
        int[] arregloAux = new int[2];
        int aux = 0;
        int aux2 = 0;
        do {
            aux = teclado.nextInt();
        } while (aux > 10);
        arregloAux[0] = aux;
        do {
            aux2 = teclado.nextInt();
        } while (aux2 > (10 - aux));
        arregloAux[1] = aux2;
        return arregloAux;
    }

    public static int valorColores(int aux) {
        if (aux == 1 || aux == 2) {
            return 8000;
        } else if (aux > 2) {
            return 9000;
        }
        return 0;
    }

    public static int eleccionColores() {
        Scanner teclado = new Scanner(System.in);
        int aux = 0;
        aux = teclado.nextInt();
        return aux;
    }

}
