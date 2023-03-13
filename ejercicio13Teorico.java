// Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
// define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

import java.util.Scanner;

public class ejercicio13Teorico {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n ; // Declaracion de un entero ('n') para definir la cantidad de elementos que va a tener el arreglo.

        System.out.println("Ingrese la cantidad de jugadores que tiene su equipo:");
        n = entrada.nextInt();

        /* Declaracion de un Arreglo de una dimension que almacena cadena de caracteres.
         * donde su dimension esta dada por la cantidad de jugadores establecida por el
        usuario a traves de la variable 'n'. */

        String[] nombresEquipo = new String[n]; 

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error

    }


}
