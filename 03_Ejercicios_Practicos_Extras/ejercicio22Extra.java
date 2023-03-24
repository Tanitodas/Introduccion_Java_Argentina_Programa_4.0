import java.util.Scanner;

public class ejercicio22Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Filas que desea para su matriz");
        int n = entrada.nextInt();

        System.out.println("Ingrese la cantidad de Columnas que desea para su matriz");
        int m = entrada.nextInt();

        double[][] matriz = new double[n][m];

        llenadoDeMatriz(matriz, n, m);
        System.out.println("");

        impresionDeMatriz(matriz, n, m);
        System.out.println("");

        entrada.close();

    }

    // *************************************************************************************************************************

    public static void llenadoDeMatriz ( double [][] matriz , int n ,  int m){

        for (int i = 0; i < n ; i++) {
            
            for (int j = 0; j < m ; j++) {
                
                matriz[i][j] = ( Math.random() * 10 ); // Asignamos valores aleatorios de tipo 'double' a la matriz.

                matriz[i][j] = (double) Math.round(  matriz[i][j] * 100d ) / 100; // Acortamos los decimales de los valores cargados aleatoriamente a solamente 2.
 
            }

        }

    }

    // *************************************************************************************************************************

    public static void impresionDeMatriz( double[][] matriz , int n , int m ) {
        
        System.out.println("La matriz es igual a:");

        for ( int i = 0; i < n; i++ ) {

            for ( int j = 0; j < m ; j++ ) {
                
                System.out.print( matriz[i][j] + " ");

            }

            System.out.println("");
            
        }

    }

    // *************************************************************************************************************************

}
