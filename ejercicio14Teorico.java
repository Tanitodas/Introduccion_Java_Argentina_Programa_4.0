import java.util.Scanner;

// Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo

public class ejercicio14Teorico {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        int n , i; // Declaracion de un entero ('n') para definir la cantidad de elementos que va a tener el arreglo.
        String nombres;

        System.out.println("Ingrese la cantidad de jugadores que tiene su equipo:");
        n = entrada.nextInt();

        //Limpiado de Buffer para poder llenar todos los elementos del vector con el siguiente 'for'
        entrada.nextLine();

        /* Declaracion de un Arreglo de una dimension que almacena cadena de caracteres.
         * donde su dimension esta dada por la cantidad de jugadores establecida por el
        usuario a traves de la variable 'n'. */

        String[] nombresEquipo = new String[n]; 

        // Llenado de vector de nombres
        for ( i = 0 ; i < n ; i++ ){
           
            System.out.println("Ingrese el nombre del jugador numero " + (i + 1) );
            
            nombres = entrada.nextLine();

            nombresEquipo[i] = nombres;

        }

        System.out.println("El vector de nombres del equipo es:");
       
        // Impresion de vector
        for ( i = 0 ; i < n ; i++ ){

            System.out.println(nombresEquipo[i]); 

        }
        
        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error

    }

}
