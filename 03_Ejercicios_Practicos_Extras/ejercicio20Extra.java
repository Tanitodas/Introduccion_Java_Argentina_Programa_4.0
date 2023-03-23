import java.util.Random;
import java.util.Scanner;

// Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
// parámetro. Después haremos otra función o procedimiento que imprima el vector.

public class ejercicio20Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension que desea que tenga el vector");
        int n = entrada.nextInt();

        int[] vector1 = new int[n];

        llenadoDeVectores(vector1);

        impresionDeVectores(vector1);

        entrada.close();

    }

    public static void llenadoDeVectores ( int[] vector1 ){

        Random aleatorio = new Random();

        for (int i = 0; i < vector1.length; i++) {
            
            vector1[i] = aleatorio.nextInt(100); // Se generan numeros alatorios desde 0 a 99.

        }

    }

    public static void impresionDeVectores( int[] vector1 ) {
        
        System.out.println("El vector 1 es igual a:");

        for (int i = 0; i < vector1.length; i++) {
            
            System.out.print( vector1[i] + " ");

        }

    }


}
