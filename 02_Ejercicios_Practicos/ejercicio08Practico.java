// Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
// el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
// por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
// “INCORRECTO”. Nota: investigar la función Lenght() en Java.

import java.util.Scanner;

public class ejercicio08Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una frase con 8 caracteres");
        frase = entrada.nextLine();

        while (frase.length() != 8) {
                
            System.out.println("INCORRECTO!");
            System.out.println("");
            System.out.println("Ingreso una frase con mas o con menos de 8 caracteres. Intentelo devuelta:");
            frase = entrada.nextLine();

        }

        if( frase.length() == 8 ){

            System.out.println("CORRECTO!");

        }

        entrada.close();

    }
}
