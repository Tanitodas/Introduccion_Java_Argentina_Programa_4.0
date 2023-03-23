import java.util.Scanner;

// Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
// N, con los valores ingresados por el usuario.

public class ejercicio18Extra {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos del vector");
        int n = entrada.nextInt();

        int[] vector = new int[n];
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Ingrese el valor del vector en la posicion [ " + i + " ]");
            vector[i] = entrada.nextInt();

            suma = vector[i] + suma;

        }

        System.out.println("El vector es igual a :");

        for (int i = 0; i < vector.length; i++) {
            
            System.out.print( vector[i] + " ");
        
        }

        System.out.println("");
        System.out.println("La suma de todos los elementos del vector es igual a: " + suma );

        entrada.close();

    }
    
}
