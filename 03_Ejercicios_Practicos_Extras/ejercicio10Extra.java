// Realice un programa para que el usuario adivine el resultado de una multiplicación entre
// dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
// si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
// al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
// utilizar la función Math.random() de Java.

import java.util.Random;
import java.util.Scanner;

public class ejercicio10Extra {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();

        int numAlt1 , numAlt2 , multiplicación , numIngresado;
     
        do {

            numAlt1 = aleatorio.nextInt(0,10);
            numAlt2 = aleatorio.nextInt(0,10);
    
            multiplicación = numAlt1 * numAlt2;    
            
            System.out.println("Adivine la multiplicacion de los 2 numeros generados aleatoriamente entre 0 y 10:");
            System.out.println("");
            numIngresado = entrada.nextInt();

            if( numIngresado == multiplicación){

                System.out.println("FELICIDADES!!");
                System.out.println("");
                System.out.println("Ha adivinado correctamente el resultado de la multiplicacion de " + numAlt1 + " y " + numAlt2 + " que es igual a: " + multiplicación );
                break;

            }else{

                System.out.println("Que malo :( ");
                System.out.println("");
                System.out.println("No ha acertado el resultado de la multiplicacion de " + numAlt1 + " y " + numAlt2 + " que es igual a: " + multiplicación );
            }

        } while ( numIngresado != multiplicación);

        entrada.close();

    }

}
