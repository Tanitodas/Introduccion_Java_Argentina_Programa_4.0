// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
// pantalla

import java.util.Scanner;

public class ejercicio2Practico {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String nombre;

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Su nombre es: " + nombre);

        entrada.close();

    }

}