// Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
// ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
// 5 *****
// 3 ***
// 11 ***********
// 2 **

import java.util.Scanner;

public class ejercicio10Teorico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int i = 0 , j = 0 , num = 0;

        // Bucle de toma de datos de los numeros y dentro del mismo colocamos un 'for' para imprimir los asteriscos
        for ( i = 0 ; i < 4 ; i++ ) {

            System.out.println(""); // Impresion de espacio vacio para que se vea el texto mejor en pantalla.

            System.out.println("Ingrese el numero " + i + " de los 4 posibles.");
            num = entrada.nextInt();

            System.out.print(""); // Impresion de espacio vacio para que se vea el texto mejor en pantalla.
            
            System.out.print(num + " ");

            // Bucle de impresion de asteriscos
            for ( j = 0 ; j < num ; j++ ){

                System.out.print("*");

            }
            
        }

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error

    }
    
}
