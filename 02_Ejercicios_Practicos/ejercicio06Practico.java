// Crear un programa que dado un numero determine si es par o impar.

import java.util.Scanner;

public class ejercicio06Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();

        System.out.println("");

        if (numero%2 == 0){

            System.out.println("El numero ingresado es PAR");

        } else if (numero%2 != 0){

            System.out.println("El numero ingresado es IMPAR");

        }
        
        entrada.close();

    }
    
}
