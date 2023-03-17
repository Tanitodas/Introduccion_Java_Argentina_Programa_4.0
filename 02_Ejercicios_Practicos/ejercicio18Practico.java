// Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
// traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
// obtiene cambiando sus filas por columnas (o viceversa).

import java.util.Random;

public class ejercicio18Practico {
   
    public static void main(String[] args){

        int[][] matriz = new int[4][4]; // Declaracion de una matriz de 4x4
    
        //  Incializacion de una matriz 4x4 con valores enteros aleatorios.
        llenadoDeMatrizAleatorio(matriz);
    
        // Impresion de dicha matriz 4x4.
        impresionDeMatriz(matriz);
    
        //  Impresion de la matriz transpuesta de la matriz original.
        impresionDeMatrizTranspuesta(matriz);
    
    }

    //  Metodo para LLENAR la matriz con valores aleatorios enteros.
    public static void llenadoDeMatrizAleatorio( int[][] matriz ){

        int i , j;

        Random aleatorio = new Random(); // Creamos el OBJETO 'aleatorio' de la clase random que importamos antes. 

        for( i = 0 ; i < 3 ; i++){

            for(j = 0 ; j < 3 ; j++){

                matriz[i][j] = aleatorio.nextInt(11); // Aca asignamos valores aleatorios de tipo entero entre los limites de 0 y 10 (ya que le pasamos un argumento de 10 al metodo)

            }

        }

    }

    //  Metodo para IMPRIMIR la matriz con valores aleatorios enteros.
    public static void impresionDeMatriz( int[][] matriz ){

        int i , j;
    
        System.out.println("La matriz generada aleatoriamente es:");
    
        for( i = 0 ; i < 3 ; i++){
    
            for(j = 0 ; j < 3 ; j++){
    
                System.out.print( matriz[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }

    //  Metodo para IMPRIMIR la matriz TRANSPUESTA.

    public static void impresionDeMatrizTranspuesta( int[][] matriz ){

        int i , j;

        System.out.println("La matriz TRANSPUESTA es:");

        for( i = 0 ; i < 3 ; i++){

            for(j = 0 ; j < 3 ; j++){

                System.out.print( matriz[j][i] + " " );

            }

            System.out.println("");

        }
    }

}