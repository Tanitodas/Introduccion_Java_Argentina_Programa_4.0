import java.util.Scanner;

// Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
// es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
// que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
// investigar la función Substring y equals() de Java.

public class ejercicio09Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una frase o una palabra que empiece con 'A'");
        frase = entrada.nextLine();

        frase.toUpperCase();

        if( frase.charAt(0) == 'A'){

            System.out.println("CORRECTO!");

        } else {

            System.out.println("INCORRECTO!");
            
        }

        entrada.close();

    }
}
