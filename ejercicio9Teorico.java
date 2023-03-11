// Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
// bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
// el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
// Nota: recordar el uso de la sentencia break.

import java.util.Scanner;

class ejercicio9Teorico{
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        int num , suma , i;

        suma = 0;
        i = 0;
        
        do{

            System.out.println("Ingrese un numero (tiene 20 intentos).");
            System.out.println("Para terminar la suma ingrese un CERO(0)");

            num = entrada.nextInt();

            if (num > 0){

                suma = num + suma;

            }
            
            i++; // Contador. Lo utilizamos para que nos cuente el numero de veces que se pasa por el bucle, para no superar los 20 intentos.

        } while (num != 0 && i < 20); 

        if (num == 0){

            System.out.println("Se ha capturado un CERO(0)");
            
        }

        if (i == 20){

            System.out.println("Se ha llegado al limite de 20 intentos");

        }

        System.out.println("La suma de los numeros ingresados es igual a: " + "'" + suma + "'");

    }
    
}