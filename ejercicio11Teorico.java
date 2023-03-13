// Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
// en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
// reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
// vocales acentuadas) se mantienen sin cambios.
// a e i o u
// @ # $ % *

import java.util.Scanner;

public class ejercicio11Teorico {
     public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        String frase , mensajeEncriptado;
        int cantCaracteres;

        System.out.println("Ingrese una frase y terminela en punto");
        frase = entrada.nextLine();

        cantCaracteres = frase.length(); // Tomamos la longitud de la frase para asi valuar el ultimo caracter de la frase.

        while ( frase.charAt(cantCaracteres - 1) != '.' ) { // IMPORTANTE: Los caracteres se simbolizan con comillas simples ( ' ' ), en cambio los String's se los simboliza con comillas dobles ( " " ).

            System.out.println("No ha terminado de ingresar la frase con punto");
            System.out.println("Intentelo de nuevo, por favor");

            frase = entrada.nextLine();

        }

        mensajeEncriptado = cambiarVocales(frase); // Asignamos una variable nueva tipo string para trabajar con el retorno de la funcion de 'cambiarVocales'

        System.out.println("Su frase SIN encriptada es :" + "{ " + frase + " }");
        System.out.println("Su frase YA encriptada es :" + "{ " + mensajeEncriptado + " }");

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error

    }

    /* Declaracion de una FUNCION que nos cambia las vocales por los caracteres especiales que queremos.
     * Es una FUNCION por que nos retorna un valor a traves de una variable, en este caso, de tipo string
     * en donde se genera una nueva cadena de texto con las modificaciones pertinentes.
     */ 
    public static String cambiarVocales(String frase){

        frase.toLowerCase();

        frase = frase.replace('a','@');

        frase = frase.replace('e','#');

        frase = frase.replace('i','$');

        frase = frase.replace('o','%');

        frase = frase.replace('u','*');

        return frase;

    }

}
