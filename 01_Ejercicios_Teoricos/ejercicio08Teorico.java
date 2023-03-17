// Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
// pedirá de nuevo hasta que la nota sea correcta

import java.util.Scanner;

public class ejercicio08Teorico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int notas;

        System.out.println("Ingrese la nota del alumno (debe estar entre 1 y 10)");

        notas = entrada.nextInt();

        while (notas > 10 || notas < 1){
            
            System.out.println("Ingreso una nota invalida");
            System.out.println("");
            System.out.println("Intentelo nuevamente");

            notas = entrada.nextInt();

        }
        
        if (notas <= 10 && notas >= 1){

            System.out.println("Ingreso una nota correcta y la nota del alumno es igual a " + notas);

        }
        
        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error

    }
    
}
