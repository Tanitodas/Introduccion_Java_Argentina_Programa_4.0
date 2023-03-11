
/*  Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
 *  alguno de ellos es mayor a 25.
 */

import java.util.Scanner; //Importacion de la CLASE "Scanner"

public class ejercicio6Teorico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); //     Creaccion de un OBJETO (que nos va a permitir leer un dato ingresado por teclado) de la CLASE 'Scanner'.

        int num1 , num2; //     Creacion de variables numericas

        System.out.println("Ingrese dos numeros enteros");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        if(num1 > num2){

            System.out.println("El numero " + num1 + " es mas grande que el numero " + num2 + ".");

        }
            else{

                 System.out.println("El numero " + num2 + " es mas grande que el numero " + num1 + ".");

             }

    }

    
}
