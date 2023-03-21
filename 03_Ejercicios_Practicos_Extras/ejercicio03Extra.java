//  Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//  Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
//  String.

import java.util.Scanner;

public class ejercicio03Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String caracter;
        
        System.out.println("Ingrese algún caracter:");
        caracter = entrada.nextLine();

        caracter = caracter.toUpperCase();  //  Volvemos a asignar un valor a la variable caracter asi se transforma todo a mayúscula.

        switch (caracter) {
            case "A":

                System.out.println("El caracter es la vocal 'A'");
                break;

            case "E":

                System.out.println("El caracter es la vocal 'E'");
                break;

            case "I":

                System.out.println("El caracter es la vocal 'I'");
                break;

            case "O":

                System.out.println("El caracter es la vocal 'O'");
                break;

            case "U":

                System.out.println("El caracter es la vocal 'O'");
                break;

            default:

                System.out.println("No se ha ingresado una vocal");
                break;

        }

        entrada.close();

    }

}
