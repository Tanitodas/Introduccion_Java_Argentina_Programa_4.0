// Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
// por parámetro para que nos indique si es o no un número primo, debe devolver true si es
// primo, sino false.
// 
// Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
// primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
// ¿Qué son los números primos?
// Básicamente, un número primo es un número natural que tiene solo dos divisores o
// factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir
// por uno y por el mismo número.
// El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5,
// 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97

import java.util.Scanner;

public class ejercicio17Extra {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Ingrese el numero");
        num = entrada.nextInt();

        Boolean primo = primoOno(num);

        if( primo ){

            System.out.println("El numero ingresado [ " + num + " ] ES primo");

        } else if ( !primo ) {

            System.out.println("El numero ingresado [ " + num + " ] NO ES primo");

        }

        entrada.close();

    }

    /* En la funcion 'primoOno' realizamos la division de el numero ingresado y de los numeros anteriores al mismo
     * hasta cero, es decir, si ingresamos un dos dividimos al '4' entre '4','3','2' y '1'.
     * Si, de estas divisiones solamente 2 dan con resto igual a cero, estamos en presencia de un numero primo. Por definicion.
     * Por eso colocamos, en la variable de retorno, que si 'cont' es igual a dos tendremos una condicion de 'true' para la pregunta
     * si el numero ingresado es primo o no.
     */
    public static Boolean primoOno( int num ){

        int i , cont = 0;

        for ( i = 1; i < num + 1 ; i++) {
            
            if (num % i == 0) {

                cont++;

            }

        }

        return cont == 2;
    }

}
