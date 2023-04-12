package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenida a su creador de presupuesto de manicure");
        lanzar();

    }
    public static int eleccionMaterial(){
        System.out.println("Ingrese el número que corresponda a su elección: ");
        System.out.println("[0] Acrílico");
        System.out.println("[1] PolyGel");
        System.out.println("[2] GelX");
        int eleccion=ingresarSoloNumero();
        while (!validarRangoNumero(eleccion,0,2)) {
            System.out.println("valor ingresado no valido, ingrese nuevamente");
            eleccion = ingresarSoloNumero();
        }
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
        }
        return 0;
    }

    public static int[] eleccionDiseño() {
        int[] elecciones =new int[2];
        System.out.println("Eliga los diseños, son 1 por cada uña, maximo 10");

        System.out.println("Ingrese la cantidad de diseños simples: ");
        int cantSimples = ingresarSoloNumero();
        while (!validarRangoNumero(cantSimples,0,10)) {
            System.out.println("Ingrese un número menor a 11");
            cantSimples = ingresarSoloNumero();
        }

        System.out.println("Diseños sofisticados: ");
        int cantSofisticados = ingresarSoloNumero();
        while (!validarRangoNumero(cantSofisticados,0,10-cantSimples)){
            System.out.println("El numero ingresado no es valido");
            cantSofisticados = ingresarSoloNumero();
        }

        elecciones[0]= cantSimples;
        elecciones[1]= cantSofisticados;
        return elecciones;
    }

    public static int calculoDiseño(int[] eleccion) {
        int costo = ((eleccion[0] * 500) + (eleccion[1] * 1200));
        return costo;
    }

    public static boolean validarRangoNumero(int numero, int min, int max) {
        if (numero < min || numero > max) {
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
        while (!validarRangoNumero(eleccion,0,3)) {
            System.out.println("valor ingresado no valido, ingrese nuevamente");
            eleccion = ingresarSoloNumero();
        }
        return eleccion;
    }

   public static int calcValorLargo(int eleccionLargo){
       switch (eleccionLargo){
            case 0:
                return 0;
           case 1:
               return 5000;
           case 2:
               return 7000;
           case 3:
               return 9000;
        }
        return 0;
   }

    public static float calcularNeto(int precioPreliminar) {
        float iva = (float)(precioPreliminar * 1.19);
        return iva;
    }

    public static int calcularPrecioArreglo(int[] precios) {
        int valorAcumulado = 0;
        for (int i = 0; i < precios.length; i++) {
            valorAcumulado += precios[i];
        }
        return valorAcumulado;
    }

    public static int valorDecoracion(int[] cantsDeco) {
        int costo = (cantsDeco[0]*600)+(cantsDeco[1]*1500);
        return costo;
    }

    public static int[] eleccionDecoracion() {
        int[] elecciones =new int[2];
        System.out.println("Eliga las decoraciones, puede optar por cristales y/o accesorios 3D, son 1 por cada uña, maximo 10");

        System.out.println("Ingrese la cantidad de cristales: ");
        int cantCristales = ingresarSoloNumero();
        while (!validarRangoNumero(cantCristales,0,10)) {
            System.out.println("Ingrese un número menor a 11");
            cantCristales = ingresarSoloNumero();
        }

        System.out.println("Ingrese la cantidad de accesorios 3D: ");
        int cantAccesorios3D = ingresarSoloNumero();
        while (!validarRangoNumero(cantAccesorios3D,0,10-cantCristales)){
            System.out.println("El numero ingresado no es valido");
            cantAccesorios3D = ingresarSoloNumero();
        }

        elecciones[0]= cantCristales;
        elecciones[1]= cantAccesorios3D;
        return elecciones;
    }

    public static int valorColores(int cantColores) {
        if (validarRangoNumero(cantColores,0,2)) {
            return 8000;
        }else  {
            return 9000;
        }
    }

    public static int eleccionColores() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la cantidad de colores que desea: ");
        int cantColores = ingresarSoloNumero();
        while (!validarRangoNumero(cantColores,0,5)){
            System.out.println("valor ingresado no valido, ingrese nuevamente");
            cantColores = ingresarSoloNumero();
        }
        return cantColores;
    }

    public static void menu(int[] valores){
        boolean manternerProgrmaActivo = true;
        while (manternerProgrmaActivo){
            mostrarOpcionesMenu();
            int eleccion = ingresarSoloNumero();
            switch (eleccion){

                case 1:
                    int cantColores = eleccionColores();
                    System.out.println("La cantidad de colores que eligio fueron: "+ cantColores+"\n");
                    int valorColores = valorColores(cantColores);
                    valores[0] = valorColores;
                    System.out.println(valores[0]);
                    menu(valores);

                case 2:
                    int largoUñas = eleccionLargo();
                    System.out.println("Largo elegido correctamente");
                    int valorLargo = calcValorLargo(largoUñas);
                    valores[1] = valorLargo;
                    System.out.println("Valor calculado correctamente");
                    menu(valores);

                case 3:
                    int material = eleccionMaterial();
                    System.out.println("Material elegido correctamente");
                    int valorMaterial = calculoMaterial(material);
                    valores[2] = valorMaterial;
                    System.out.println("Valor calculado correctamente");
                    menu(valores);

                case 4:
                    int[] cantDiseños = eleccionDiseño();
                    System.out.println("Diseños elegidos correctamente");
                    int valorDiseños = calculoDiseño(cantDiseños);
                    valores[3] = valorDiseños;
                    System.out.println("Valor calculado correctamente");
                    menu(valores);

                case 5:
                    int[] cantDecoraciones = eleccionDecoracion();
                    System.out.println("Decoraciones elegidos correctamente");
                    int valorDecoraciones = valorDecoracion(cantDecoraciones);
                    valores[4] = valorDecoraciones;
                    System.out.println("Valor calculado correctamente");
                    menu(valores);

                case 6:
                    int sumaValores = calcularPrecioArreglo(valores);
                    float neto = calcularNeto(sumaValores);
                    float netoRedondeado = Math.round(neto);
                    System.out.println("El valor final corresponde a: "+netoRedondeado);
                    menu(valores);

                case 7:
                    manternerProgrmaActivo = false;

                default:
                    System.out.println("el valor no es valido, ingrese nuevamente: ");
            }
        }
    }

    public static void mostrarOpcionesMenu(){
        System.out.println("Selecciones la opcion que desea realizar");
        System.out.println("1.-Elegir Colores");
        System.out.println("2.-Elegir Largo");
        System.out.println("3.-Elegir Material");
        System.out.println("4.-Elegir Diseños");
        System.out.println("5.-Elegir Decoraciones");
        System.out.println("6.-Calcular Valor");
        System.out.println("7.-Salir del programa\n");
    }

    public static void lanzar (){
        int[] valores = new int[5];
        menu(valores);
    }

}
