// Realizar un programa que complete un vector con los N primeros números de la sucesión
// de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
// números:
// 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
// Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
// La sucesión del número 2 se calcula sumando (1+1)
// Análogamente, la sucesión del número 3 es (1+2),
// Y la del 5 es (2+3),
// Y así sucesivamente…
// La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
// Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
// Fibonaccin = 1 para todo n<=1
// Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
// como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
// Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
// https://quantdare.com/numeros-de-fibonacci/

import java.util.Scanner;

public class ejercicio24Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cuantos numeros desea imprimir de la serie de Fibonacci");
        int num = entrada.nextInt();

        //  Cuando se ingresa un valor mayor a 80 aproximadamente se rompe la serie por el tipo de la variable
        //  y sus limitaciones.

        long[] vectorFibo = new long[num];

        llenadoDeFibo(vectorFibo, num);

        impresionDeVector(vectorFibo, num);
        
        entrada.close();

    }

    // *************************************************************************************************************************

    public static void llenadoDeFibo ( long[] vectorFibo , int num ){

        for (int i = 0; i < num ; i++) {

            if ( i <= 1){

                vectorFibo[i] = 1;

            } else if ( i > 1) {

                vectorFibo[i] = vectorFibo[i-2] + vectorFibo[i-1];

            }
            
        }

    }

    // *************************************************************************************************************************

    public static void impresionDeVector( long[] vectorFibo , int num) {
        
        System.out.println("Los primeros " + num + " numeros de la serie de FIBONACCI son:");

        for (int i = 0 ; i < num ; i++) {
            
            System.out.print( vectorFibo[i] + " ");

        }

    }

    // *************************************************************************************************************************


}
