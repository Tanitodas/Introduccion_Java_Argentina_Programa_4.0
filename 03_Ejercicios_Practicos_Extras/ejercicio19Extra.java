// Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
// comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
// elementos).

import java.util.Random;
import java.util.Scanner;

public class ejercicio19Extra {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension que desea que tengan los dos vectores que se van a comparar");
        int n = entrada.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        llenadoDeVectores(vector1, vector2);

        Boolean vectorIgual = false;

        for (int i = 0; i < n ; i++) {
            
            if ( vector1[i] == vector2[i]) {
                
                vectorIgual = true;

                continue;

            } else {

                break;

            }

        }

        impresionDeVectores(vector1, vector2);

        if ( vectorIgual ) {

            System.out.println("");
            System.out.println("Los vectores SON IGUALES");

        } else {

            System.out.println("");
            System.out.println("Los vectores SON DIFERENTES");

        }

        entrada.close();

    }

    public static void llenadoDeVectores ( int[] vector1 , int[] vector2 ){

        Random aleatorio = new Random();

        for (int i = 0; i < vector1.length; i++) {
            
            vector1[i] = aleatorio.nextInt(100); // Se generan numeros alatorios desde 0 a 99.

        }

        for (int i = 0; i < vector2.length; i++) {
            
            vector2[i] = aleatorio.nextInt(100); // Se generan numeros alatorios desde 0 a 99.

        }

    }

    public static void impresionDeVectores( int[] vector1 , int[] vector2 ) {
        
        System.out.println("El vector 1 es igual a:");

        for (int i = 0; i < vector1.length; i++) {
            
            System.out.print( vector1[i] + " ");

        }

        System.out.println(" ");
        System.out.println("El vector 2 es igual a:");

        for (int i = 0; i < vector1.length; i++) {
            
            System.out.print( vector2[i] + " ");

        }

    }

}
