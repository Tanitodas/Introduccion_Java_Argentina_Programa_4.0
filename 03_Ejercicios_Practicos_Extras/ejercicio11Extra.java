// Escribir un programa que lea un número entero y devuelva el número de dígitos que
// componen ese número. Por ejemplo, si introducimos el número 12345, el programa
// deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
// operador de división. Nota: recordar que las variables de tipo entero truncan los
// números o resultados.

import java.util.Scanner;

public class ejercicio11Extra {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num ,  cantDigitos = 0;

        System.out.println("Ingrese el numero el cual desea saber su cantidad de digitos");
        num = entrada.nextInt();

        while (num>0) {
            
            num = num/10;

            cantDigitos++;

        }

        System.out.println("La cantidad de digitos del numero ingresado es igual a: " + cantDigitos);

        entrada.close();

    }

}
