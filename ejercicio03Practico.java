// Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
// en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
// Java.

import java.util.Scanner;

public class ejercicio3Practico {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese la frase que quiere ver en mayusculas y en minusculas");
        frase = entrada.nextLine();

        System.out.println("");
        System.out.println("La frase ingresada en mayusculas es igual a: {" + frase.toUpperCase() + "}");
        System.out.println("");
        System.out.println("La frase ingresada en mayusculas es igual a: {" + frase.toLowerCase() + "}");

        entrada.close();

    }
}
