// Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
// 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
// dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
// que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
// menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
// columna de la matriz M en la cual empieza el primer elemento de la submatriz P.

import java.util.Random;
import java.util.Scanner;

public class ejercicio21Practico {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        //  Llenado de valores aleatorios de la matrizM.
        llenadoDeMatrizM(matrizM);

        //  Impresion de la matrizM 10x10.
        impresionDeMatrizM(matrizM);

        //  Llenado de matrizP.
        llenadoDeMatrizP(matrizP, entrada);

        //  Impresion de la matrizP 3x3.
        impresionDeMatrizP(matrizP);

        
        


    }

    //  Llenamos la matriz de 10x10 con numeros aleatorios enteros.
    public static void llenadoDeMatrizM(int[][] matrizM){

        int i , j;

        Random aleatorio = new Random(); // Creamos el OBJETO 'aleatorio' de la clase random que importamos antes. 

        for( i = 0 ; i < 9 ; i++){

            for(j = 0 ; j < 9 ; j++){

                matrizM[i][j] = aleatorio.nextInt(11); // Aca asignamos valores aleatorios de tipo entero entre los limites de 0 y 10 (ya que le pasamos un argumento de 10 al metodo)

            }

        }

    }

    //  Metodo para LLENAR manualmente la matriz 3x3.
    public static void llenadoDeMatrizP( int[][] matrizP , Scanner entrada ){

        int i , j;

        for( i = 0 ; i <= 2 ; i++){

            for(j = 0 ; j <= 2 ; j++){

                System.out.println("Ingrese el valor que quiere en la fila [" + i + "] y en la columna [" + j + "] de la matrizP de dimension 3x3");
                
                matrizP[i][j] = entrada.nextInt();

            }

        }

    }

    //  Metodo para IMPRIMIR la matrizM.
    public static void impresionDeMatrizM( int[][] matrizM ){

        int i , j;
    
        for( i = 0 ; i <= 9 ; i++){
    
            for( j = 0 ; j <= 9 ; j++ ){

                System.out.print( matrizM[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }

    //  Metodo para IMPRIMIR la matrizP.
    public static void impresionDeMatrizP( int[][] matrizP ){

        int i , j;
    
        for( i = 0 ; i <= 2 ; i++){
    
            for( j = 0 ; j <= 2 ; j++ ){

                System.out.print( matrizP[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }








}
