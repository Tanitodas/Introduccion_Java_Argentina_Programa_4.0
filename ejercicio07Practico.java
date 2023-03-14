import java.util.Scanner;

// Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
// pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
// investigar la función equals() en Java.

public class ejercicio07Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una palabra");
        frase = entrada.next();

        frase.toLowerCase(); // Pasamos a minuscula toda la frase.

        if(frase.equals("eureka")){

            System.out.println("CORRECTO!");

        } else {

            System.out.println("INCORRECTO!");

        }

        entrada.close();

    }
}
