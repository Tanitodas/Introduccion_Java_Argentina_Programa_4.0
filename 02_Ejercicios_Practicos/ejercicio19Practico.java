// Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
// una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
// de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
// denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

import java.util.Scanner;

public class ejercicio19Practico {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Ingrese la dimension que quiere para la matriz");
        n = entrada.nextInt();

        int[][] matriz = new int[n][n];
        int[][] matrizTranspuesta = new int[n][n];

        //  Llenado manual de matriz con numeros.
        llenadoDeMatriz(matriz, n, entrada);

        System.out.println("La matriz es igual a:");
        // Impresion de matriz llenada manualmente.
        impresionDeMatriz(matriz, n);

        // Incializacion de matriz TRANSPUESTA a partir de la matriz.
        llenadoDeMatrizTranspuesta(matriz, n, matrizTranspuesta);

        System.out.println("");
        System.out.println("La matriz TRANSPUESTA es igual a:");
        // Impresion de la matriz TRANSPUESTA.
        impresionDeMatrizTranspuesta(matrizTranspuesta, n);

        System.out.println("");
        // Comparacion si la matriz y su transpuesta son opuestas o no, esto para verificar si la matriz es antisimetrica o no.
        antisimetrica(matriz, n, matrizTranspuesta);

        entrada.close();

    }

    //  Metodo para LLENAR manualmente la matriz con valores.
    public static void llenadoDeMatriz( int[][] matriz , int n, Scanner entrada ){

        int i , j;

        for( i = 0 ; i <= n - 1 ; i++){

            for(j = 0 ; j <= n - 1 ; j++){

                System.out.println("Ingrese el valor que quiere en la fila [" + i + "] y en la columna [" + j + "] de la matrizP de dimension 3x3");
                
                matriz[i][j] = entrada.nextInt();

            }

        }

    }

    // Metodo para llenado de la matriz transpuesta.
    public static void llenadoDeMatrizTranspuesta( int[][] matriz , int n, int[][] matrizTranspuesta ){

        int i , j;

        for( i = 0 ; i <= n - 1 ; i++){

            for(j = 0 ; j <= n - 1 ; j++){
                
                matrizTranspuesta[j][i] = matriz[i][j];

            }

        }

    }

    //  Metodo para IMPRIMIR la matriz.
    public static void impresionDeMatriz( int[][] matriz , int n ){

        int i , j;
    
        for( i = 0 ; i <= n - 1 ; i++){
    
            for( j = 0 ; j <= n - 1 ; j++ ){

                System.out.print( matriz[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }

    //  Metodo para IMPRIMIR la matriz TRANSPUESTA.
    public static void impresionDeMatrizTranspuesta( int[][] matrizTranspuesta , int n ){

        int i , j;
    
        for( i = 0 ; i <= n - 1 ; i++){
    
            for( j = 0 ; j <= n - 1 ; j++ ){

                System.out.print( matrizTranspuesta[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }

    //  Metodo para verificar si la matriz es antisimetricas o no.
    public static void antisimetrica( int[][] matriz , int n , int[][] matrizTranspuesta ){

        int i , j , cont = 0;
    
        for( i = 0 ; i <= n - 1 ; i++){
    
            for( j = 0 ; j <= n - 1 ; j++ ){

                if( matriz[i][j] == (-1 * matrizTranspuesta[i][j] ) ){

                    cont++;

                }

            }
    
        }

        if(cont == ( n * n) ){

            System.out.println("La matriz ES antisimetrica");

        }else{

            System.out.println("La matriz NO ES antisimetrica");

        }
    
    }

}
