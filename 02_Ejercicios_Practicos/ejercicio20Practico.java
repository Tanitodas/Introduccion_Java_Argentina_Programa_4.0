// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
// suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
// permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
// El programa deberá comprobar que los números introducidos son correctos, es decir,
// están entre el 1 y el 9.

import java.util.Scanner;

public class ejercicio20Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n , sumaRef = 0 , i = 0 , j = 0 , sumaFilas = 0 ;

        System.out.println("Ingrese la dimension que quiere para la matriz");
        n = entrada.nextInt();

        int[][] matriz = new int[n][n];

        //  Llenado de matriz con valores ingresados manualmente.
        llenadoDeMatriz(matriz, n, i, j, entrada);

        //  Impresion de la matriz.
        impresionDeMatriz(matriz, n , i , j );

        String caracter;
        int cont = 0;

        System.out.println("");
        System.out.println("¿Desea verificar si la matriz es magica? S/N");
        System.out.println("");
        caracter = entrada.nextLine();

        //Limpiado de Buffer para poder contestar la siguiente instruccion
        entrada.nextLine();

        while ( caracter.equalsIgnoreCase("S") && caracter.equalsIgnoreCase("N") ) {

            System.out.println("Ingreso un valor no valido.");
            System.out.println("");
            System.out.println("Debe ingresar el caracter 'S' o 'N' ");
            System.out.println("Intentelo de nuevo:");
            caracter = entrada.nextLine();
            
        }

        if( caracter.equalsIgnoreCase("S") ){

            sumaDeRef(matriz, cont, sumaRef , i , j);

            for( i = 0 ; i < n - 1 ; i++ ){

                for( j = 0 ; i < n - 1 ; j++ ){

                    sumaFilas = matriz[i][j] + sumaFilas;

                }

                if ( sumaFilas != sumaRef ) {

                    cont++;

                }

                sumaFilas = 0;

            }

        } else if(caracter.equalsIgnoreCase("N")) {

             System.out.println("No sabremos si la matriz es magica o no :'c");

        }

        if( cont >= 1 ){

            System.out.println("La matriz ingresada NO es magica :(");

        } else if ( cont == 0 ) {

            System.out.println("La matriz ES MAGICA :)");

        }

        entrada.close();

    }

    //  Metodo para LLENAR la matriz con valores entre 1 y 9.
    public static void llenadoDeMatriz( int[][] matriz , int n , int i , int j ,  Scanner entrada ){

        for( i = 0 ; i <= n - 1 ; i++){

            for( j = 0 ; j <= n - 1 ; j++ ){
                    
                System.out.println("Ingrese el valor que quiere en la fila [" + i + "] y en la columna [" + j + "] de la matriz de dimension " + n + " x " + n);
                
                matriz[i][j] = entrada.nextInt();

                // Bloque de codigo para verificar si el usuario ingresó un numero comprendido entre 1 y 9
                while ( ( matriz[i][j] < 1 ) || ( matriz[i][j] > 9 ) ) {
                        
                    System.out.println("Ingreso un valor no valido.");
                    System.out.println("");
                    System.out.println("Debe ingresar un valor comprendido entre 1 y 9");
                    System.out.println("Intentelo de nuevo:");
                    matriz[i][j] = entrada.nextInt();

                }

            }

        }

    }

    //  Metodo para IMPRIMIR la matriz.
    public static void impresionDeMatriz( int[][] matriz , int n , int i , int j ){
    
        for( i = 0 ; i <= n - 1 ; i++){
    
            for( j = 0 ; j <= n - 1 ; j++ ){

                System.out.print( matriz[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }

    //  Realizamos este metodo para tener una suma de referencia y comparar con el resto de sumas de filas o columnas de la matriz.
    public static void sumaDeRef( int[][] matriz , int n , int i , int j , int sumaRef ) {
        
    
        for( j = 0 ; j <= n - 1 ; j++){
    
            sumaRef = matriz[i][j] + sumaRef;
    
        }


    }

}
