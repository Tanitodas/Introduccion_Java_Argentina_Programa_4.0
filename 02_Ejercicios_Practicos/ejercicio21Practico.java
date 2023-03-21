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

        //  Llenado de matrizP.
        llenadoDeMatrizP(matrizP, entrada);

        //  Impresion de la matrizM 10x10.
        impresionDeMatrizM(matrizM);

        //  Impresion de la matrizP 3x3.
        impresionDeMatrizP(matrizP);

        System.out.println("");
        System.out.println("¿Desea buscar la matrizP dentro de la matrizM? S/N");
        System.out.println("");

        String caracter = entrada.nextLine();

        if( caracter.equalsIgnoreCase("S") ){

           int[] vectorDeCoincidencia = comparadorDePyM(matrizM, matrizP);

           comparadorDeMatrizPyMatrizM(matrizM, matrizP, vectorDeCoincidencia);






        } else if ( caracter.equalsIgnoreCase("N") ){

            System.out.println(" No se buscará la matrizP dentros de la matrizM :c ");

        }
        
    }

    //  Llenamos la matriz de 10x10 con numeros aleatorios enteros. *************************************************************

    public static void llenadoDeMatrizM(int[][] matrizM){

        int i , j;

        Random aleatorio = new Random(); // Creamos el OBJETO 'aleatorio' de la clase random que importamos antes. 

        System.out.println("");
        System.out.println("La matrizM ha sido inicializada correctamente");
        System.out.println("");

        for( i = 0 ; i < 9 ; i++ ){

            for( j = 0 ; j < 9 ; j++ ){

                matrizM[i][j] = aleatorio.nextInt(11); // Aca asignamos valores aleatorios de tipo entero entre los limites de 0 y 10 (ya que le pasamos un argumento de 10 al metodo)

            }

        }

    }

    //  Metodo para LLENAR manualmente la matriz 3x3. *************************************************************************

    public static void llenadoDeMatrizP( int[][] matrizP , Scanner entrada ){

        int i , j;

        for( i = 0 ; i <= 2 ; i++){

            for(j = 0 ; j <= 2 ; j++){

                System.out.println("Ingrese el valor que quiere en la fila [" + i + "] y en la columna [" + j + "] de la matrizP de dimension 3x3");
                
                matrizP[i][j] = entrada.nextInt();

            }

        }

    }

    //  Metodo para IMPRIMIR la matrizM. **************************************************************************************
    
    public static void impresionDeMatrizM( int[][] matrizM ){

        int i , j;
    
        System.out.println("");
        System.out.println("La matrizM es igual a: ");
        System.out.println("");

        for( i = 0 ; i <= 9 ; i++){
    
            for( j = 0 ; j <= 9 ; j++ ){

                System.out.print( matrizM[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }

    //  Metodo para IMPRIMIR la matrizP.***************************************************************************************

    public static void impresionDeMatrizP( int[][] matrizP ){

        int i , j;

        System.out.println("");
        System.out.println("La matrizP es igual a: ");
        System.out.println("");
    
        for( i = 0 ; i <= 2 ; i++){
    
            for( j = 0 ; j <= 2 ; j++ ){

                System.out.print( matrizP[i][j] + " " );
    
            }
    
          System.out.println("");
    
        }
    
    }

    //  Comparacion de valores de la matrizM con el primer valor de la matrizP *************************************************

    public static int[] comparadorDePyM ( int[][] matrizM , int[][] matrizP ){
        
        int[] vectorDeCoincidencia = new int [2];
        
        int i , j;

        for( i = 0 ; i < 9 ; i++ ){

            for( j = 0 ; i < 9 ; j++ ){

                if ( matrizM[i][j] == matrizP[0][0] ){

                    vectorDeCoincidencia[0] = i;
                    vectorDeCoincidencia[1] = j;
                    
                    break;

                }

            }

        }
        
        return vectorDeCoincidencia;

    }

    //  En este metodo comparamos la matrizP con alguna sub matriz de 3x3 dentro de la matrizP.
    //
    //      Esta comparacion se realiza cuando el método 'comparadorDePyM' dá como valor 'true',
    //   cuando ocurre esto, el metodo va a partir de los indices en donde se encontró una coincidencia
    //   entre el primer valor de la matrizP (de indices [0,0]) y algun valor de la matrizM de cualquier
    //   indice dentro de los rangos de la misma, es decir, desde el 0 al 9 ; tanto en columnas como en
    //   filas.
    //  
    //  El método 'comparadorDeMatrizPyMatrizM' va a tomar los valores de la matrizP y luego va a comparar
    //  con la sub matriz 3x3 que se genera dentro de la matrizM 10x10 partiendo del valor que coincide de la
    //  matrizP con algun valor de la matrizM.

    public static Boolean comparadorDeMatrizPyMatrizM ( int[][] matrizM , int[][] matrizP , int[] vectorDeCoincidencia ){

        boolean comparadorMatriz;
        






        return null;

    }
    


}
