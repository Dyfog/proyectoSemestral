import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = eleccionDecora();
        for (int i = 0; i < a.length; i++) {
            System.out.println(valorDecora(a)[i]);
        }
    }
    public static int eleccionColores() {
        Scanner teclado = new Scanner(System.in);
        int aux = 0;
        aux = teclado.nextInt();
        return aux;
    }

    public static int valorColores(int aux) {
        if (aux == 1 || aux == 2) {
            return 8000;
        } else if (aux > 2) {
            return 9000;
        }
        return 0;
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

    public static int[] valorDecora(int[] arregloAux) {
        int[] arregloAux2 = new int[2];
        arregloAux2[0] = arregloAux[0] * 600;
        arregloAux2[1] = arregloAux[1] * 1500;
        return arregloAux2;
    }

    public static boolean validarRangoauxero(int auxero, int min, int max) {
        if (auxero < min || auxero > max) {
            System.out.println("El auxero no esta dentro de los parametros");
            return false;
        }
        return true;
    }

    public static int calcularPrecio(int[] precios) {
        int sumas = 0;
        for (int i = 0; i < precios.length; i++) {
            sumas += precios[i];
        }
        return sumas;
    }

    public static int calcularIva(int precioPreliminar) {
        int iva = 0;
        iva = (precioPreliminar * 19) / 100;
        return iva;
    }

    public static void leerArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static boolean validarPositivo(int auxero) {
        if (auxero < 0) {
            System.out.println("auxero ingresado no valido, se requiere de un valor positivo");
            return false;
        }
        return true;
    }

    public static boolean validarMayorA0(int auxero) {
        if (auxero <= 0) {
            System.out.println("auxero ingresado no valido, se requiere de un valor mayor a 0");
            return false;
        }
        return true;
    }

    public static int ingresarSoloauxero() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número entero:");
            in.next();
        }
        int auxero = in.nextInt();
        return auxero;
    }
}
