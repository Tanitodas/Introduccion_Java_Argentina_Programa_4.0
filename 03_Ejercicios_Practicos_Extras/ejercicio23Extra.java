// Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
// que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
// 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
// será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
// rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
// por pantalla la sopa de letras creada.
// Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
// de Java substring(), Length() y Math.random().

import java.util.Random;
import java.util.Scanner;

public class ejercicio23Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String[] vectorPalabras = new String[5];
        String [][] sopaDeLetras = new String[20][20]; 
        String opcion;

        System.out.println("¿Desea Jugar a la sopa de letras? S/N");
        opcion = entrada.nextLine();

        if ( opcion.equalsIgnoreCase("S")) {
            
            llenadoDeVectorPalabras(vectorPalabras, entrada);

            ubicacionPalabras(sopaDeLetras, vectorPalabras);

            rellenadoDeEspaciosVaciosMatriz(sopaDeLetras);

            impresionDeMatriz(sopaDeLetras);

        } else if ( opcion.equalsIgnoreCase("N")) {

            System.out.println("Que lastima :(");
            System.out.println("No jugaremos...");

        }

    }

    // *************************************************************************************************************************

    // Metodo para ingresar las 5 palabras y luego cargarlas en un vector.

    public static void llenadoDeVectorPalabras( String[] vectorPalabras , Scanner entrada ){

        String palabras;
        int contador = 0 ;

        System.out.println("Debe ingresar las 5 palabras que luego buscara dentro de la sopa de letras.");
        System.out.println(" ");
        System.out.println("Las 5 palabras deben tener un minimo 3 caracteres y un maximo de 5 caracteres");
        System.out.println(" ");

        do {
            
            System.out.println("Ingrese la palabra nº " + ( contador + 1 ) );
            palabras = entrada.nextLine();

            //  Bloque de validacion para que la palabra ingresada tenga mas de 3 caracteres.
            while ( palabras.length() <= 3 ) {
                
                System.out.println("Ingreso una palabra con 3 caracteres o menos");
                System.out.println("");
                System.out.println("Intentelo nuevamente");
                palabras = entrada.nextLine();

            }

            //  Bloque de validacion para que la palabra ingresada tenga 5 o menos caracteres.
            while ( palabras.length() > 5 ) {
                
                System.out.println("Ingreso una palabra con mas de 5 caracteres");
                System.out.println("");
                System.out.println("Intentelo nuevamente");
                palabras = entrada.next().toUpperCase(); // Se ingresan las palabras y luego se convierten en mayusculas

            }

            //  En este bloque de codigo asignamos la palabra ingresada anteriormente a uno de los
            //  casilleros del vector 'vectorPalabras' para conservar su valor fuera del bucle do-while.
            vectorPalabras[contador] = palabras;
    
            contador++;

        } while ( contador < 5  ) ;

    }

    // *************************************************************************************************************************

    //  En este metodo ubicaremos en posiciones aleatorias las palabras ingresadas por el usuario dentro de
    //  una matriz 20 x 20

    public static void ubicacionPalabras ( String[][] sopaDeLetras ,  String[] vectorPalabras ) {

        Random aleatorio = new Random();

        
        //  Este primer bucle for lo ejecutamos para obtener 5 valores aleatorios de dos variables ('numColumnaAleatoria' y
        //  'numFilaAleatoria'). Con esto posicionamos ,de forma aleatoria la primer letra de las 5 palabras que ingreso el 
        //   usuario dentro de la matriz 20x20.
        for (int k = 0; k < vectorPalabras.length; k++) {
            
            // Creamos un numero aleatorio entre 0 y 19 que sera la posicion de la primer letra de cada
            // palabra ingresada.
            int numColumnaAleatoria = aleatorio.nextInt(0 , 19);
            // Creamos un numero aleatorio entre 0 y 19 que sera la posicion de la primer letra de cada
            // palabra ingresada.
            int numFilaAleatoria = aleatorio.nextInt(0 , 19);
            
            //  Recorremos filas de la matriz 20x20
            for (int i = 0; i < 19; i++) {
            
                //  Recorremos columnas de la matrix 20x20
                for (int j = 0; j < 19; j++) {

                    //  Cuando lo indices 'i' y 'j' coinciden con los numeros aleatorios. Colocamos el inicio de la palabra 'k'
                    //  en la posicion de los indices 'i' y 'j'.
                    if ( i == numFilaAleatoria && j == numColumnaAleatoria && j < 15 ) {
                        
                        sopaDeLetras[i][j] = vectorPalabras[k];
    
                    } else if ( i == numFilaAleatoria && j == numColumnaAleatoria && j >= 15 ){
                        //  Si el indice 'j' es mayor a 15 le restamos '5' para que estemos seguros de que en esa fila va a caber
                        //  una de las palabras que ingreso el usuario. Esto lo hacemos con una variable auxiliar.

                        int columnaAux = j - 5;
                        
                        sopaDeLetras[i][columnaAux] = vectorPalabras[k];

                    }
    
                }
    
            }

        }
        
    }

    // *************************************************************************************************************************

    //  En este metodo cargamos el resto de la matriz 20x20 con valores numericos aleatorios.

    public static void rellenadoDeEspaciosVaciosMatriz ( String[][] sopaDeLetras ) {

        Random aleatorio = new Random();
        int numAleatorio;
        String numEnString;

        for (int i = 0; i < 19 ; i++) {
            
            for (int j = 0; j < 19 ; j++) {

                //  Creamos un numero aleatorio para rellenar la matriz
                numAleatorio = aleatorio.nextInt(0 , 9 );
                //  Convertimos el numero aleatorio de tipo 'int' a tipo 'string' asi lo podemos colocar en la matriz de 20x20
                //  ya que la misma es de tipo 'string' y no acepta otro tipo de dato.
                numEnString = Integer.toString(numAleatorio); 
                
                if ( sopaDeLetras[i][j] == null ) {
                    
                    sopaDeLetras[i][j] = numEnString;

                }

            }

        }

    }

    // *************************************************************************************************************************

    public static void impresionDeMatriz ( String [][] sopaDeLetras ){

        System.out.println("");
        System.out.println("La sopa de letras es:");
        System.out.println("");

        for (int i = 0; i < 19; i++) {
            
            for (int j = 0; j < 19; j++) {
                
                System.out.print( sopaDeLetras[i][j] + " ");

            }

            System.out.println("");

        }

    }

    // *************************************************************************************************************************

    // FIJARSE LA FUNCION 'toCharArray' para insertar la palabra en la matriz
}
