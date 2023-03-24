// Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
// adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
// desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
// trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//
//      Primer trabajo práctico evaluativo 10%
//      Segundo trabajo práctico evaluativo 15%
//      Primer Integrador 25%
//      Segundo integrador 50%
//
// Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
// programa los profesores necesitan obtener por pantalla la cantidad de aprobados y52
// desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
// igual al 7 de sus notas del curso.

import java.util.Scanner;

public class ejercicio21Extra {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double[][] matrizDeNotas = new double[10][4];

        double[] vectorDePromedios = new double[10];

        llenadoDeMatriz(matrizDeNotas);

        calculoDePromedioPonderado(matrizDeNotas, vectorDePromedios);

        impresionDeMatriz(matrizDeNotas);
        System.out.println("");

        impresionDeVector(vectorDePromedios);
        System.out.println("");

        int cantAprobados = 0 , cantDesaprobados = 0;

        for (int i = 0; i < 10 ; i++) {
            if ( vectorDePromedios[i] >= 7 ) {

                cantAprobados++;

            } else {

                cantDesaprobados++;

            }
        }

        System.out.println("");
        System.out.println("La cantidad de alumnos APROBADOS es igual a: " + cantAprobados);
        System.out.println("");
        System.out.println("La cantidad de alumnos DESAPROBADOS es igual a: " + cantDesaprobados);

        entrada.close();

    }

    // *************************************************************************************************************************

    public static void llenadoDeMatriz ( double [][] matrizDeNotas ){

        for (int i = 0; i < 10 ; i++) {
            
            for (int j = 0; j < 4 ; j++) {
                
                matrizDeNotas[i][j] = ( Math.random() * 10 ); // Asignamos valores aleatorios de tipo 'double' a la matriz.

                matrizDeNotas[i][j] = (double) Math.round(  matrizDeNotas[i][j] * 100d ) / 100; // Acortamos los decimales de los valores cargados aleatoriamente a solamente 2.
 
            }

        }

    }

    // *************************************************************************************************************************

    public static void calculoDePromedioPonderado ( double[][] matrizDeNotas , double[] vectorDePromedios ){

        for ( int i = 0; i < 10; i++ ) {
            
            for ( int j = 0; j < 4 ; j++ ) {

                if ( j == 0 ){

                    //  En esta posicion de la matriz se carga la nota del primer integrador, por eso multiplicamos 0.1 .
                    vectorDePromedios[i] = ( matrizDeNotas[i][j] * 0.10 );

                } else if ( j == 1 ) {

                    //  En esta posicion de la matriz se carga la nota del segundo integrador, por eso multiplicamos 0.15 .
                    vectorDePromedios[i] = ( ( matrizDeNotas[i][j] * 0.15 ) + vectorDePromedios[i] );

                } else if ( j == 2 ) {
                    //  En esta posicion de la matriz se carga la nota del primer parcial, por eso multiplicamos 0.25 .
                    vectorDePromedios[i] =( ( matrizDeNotas[i][j] * 0.25 ) + vectorDePromedios[i] ) ;
 
                } else if ( j == 3 ){

                    //  En esta posicion de la matriz se carga la nota del segundo parcial, por eso multiplicamos 0.5 .
                    vectorDePromedios[i] = ( ( matrizDeNotas[i][j] * 0.5 ) + vectorDePromedios[i] );
                    
                }

                vectorDePromedios[i] = (double) Math.round(vectorDePromedios[i]*100d)/100;
                
            }

        }

    }

    // *************************************************************************************************************************

    public static void impresionDeVector( double[] vectorDePromedios ) {
        
        System.out.println("El vector de promedios es igual a:");

        for (int i = 0 ; i < 10 ; i++) {
            
            System.out.print( vectorDePromedios[i] + " ");

        }

    }

    // *************************************************************************************************************************

    public static void impresionDeMatriz( double[][] matrizDeNotas ) {
        
        System.out.println("La matriz de notas es igual a:");

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 4 ; j++) {
                
                System.out.print( matrizDeNotas[i][j] + " ");

            }

            System.out.println("");
            
        }

    }

    // *************************************************************************************************************************

}