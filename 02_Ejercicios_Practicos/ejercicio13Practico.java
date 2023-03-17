// Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
// cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
// * * * *
// *     *
// *     *
// * * * *

import java.util.Scanner;

public class ejercicio13Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n , i , j;

        System.out.println("Ingrese la cantidad de fila y columnas que quiere para su cuadrado");
        n = entrada.nextInt();

        for ( i = 0 ; i < n ; i++){

            for( j = 0 ; j < n ; j++ ){

                if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {

                    System.out.print(" *");

                } else {

                    System.out.print("  ");

                }

            }

            System.out.println();

        }

    }


}
