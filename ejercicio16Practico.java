// Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
// al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
// numero y si se encuentra repetido.

import java.util.Scanner;
import java.util.Random; // Importamos la CLASE 'Random' para crear un objeto de esta misma clase y utilizarlo para asignar numeros aleatorios a nuestro vector

public class ejercicio16Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n;
        int buscado;

        System.out.println("Ingrese la dimension del vector");
        n = entrada.nextInt();

        int[] vectorEnteros = new int[n];

        llenadoDeVector(vectorEnteros,n);

        System.out.println("Ingrese el numero que desea buscar en el vector");
        buscado = entrada.nextInt();

        buscadoDeNumero(vectorEnteros, n, buscado);

        entrada.close();

    }

    //  Metodo para llenar el vector de dimension 'n'
    public static void llenadoDeVector( int[] vectorEnteros , int n ){

        int i;

        Random aleatorio = new Random(); // Creamos el OBJETO 'aleatorio' de la clase random que importamos antes. 

        for( i = 0 ; i < n ; i++){

            vectorEnteros[i] = aleatorio.nextInt(10); // Aca asignamos valores aleatorios de tipo entero entre los limites de 0 y 9 (ya que le pasamos un argumento de 10 al metodo)

        }

    }

    //  Metodo para mostrar por pantalla si hay coincicencia o no con algun numero del vector y el numero buscado.
    public static void buscadoDeNumero( int[] vectorEnteros , int n , int buscado ){

        int i , contadoEncontrado = 0;

        for( i = 0 ; i < n ; i++){

            if(vectorEnteros[i] == buscado){

                contadoEncontrado++;
                System.out.println("Se encontro una coincidencia con el valor buscado [" + buscado + "] en la posicion " + i + " del vector.");
                
            } 

        }

        if(contadoEncontrado == 0 ){

            System.out.println("No se encontrado coincidencias entre el numero buscado [" + buscado + "] y algun valor ingresado en el vector");
            
        }

        System.out.println("");
        System.out.println("Siendo los elementos del vector los siguientes");
        System.out.println("");
            
        // Impresion de vector
        for ( i = 0 ; i < n ; i++ ){

            System.out.print(vectorEnteros[i] + " "); 

        }

    }

}
