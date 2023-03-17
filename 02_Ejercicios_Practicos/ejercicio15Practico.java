// Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
// muestre por pantalla en orden descendente.

import java.util.Scanner;

public class ejercicio15Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] vectorEnteros = new int[100];

        llenadoDeVector(vectorEnteros);

        entrada.close();

    }

    public static void llenadoDeVector( int[] vectorEnteros ){

        int i;

        for( i = 0 ; i <= 99 ; i++){

            vectorEnteros[i] = i + 1;

            System.out.println("El valor del arreglo en la posicion " + i + " es: ");
            System.out.println(vectorEnteros[i]);

        }

    }
}
