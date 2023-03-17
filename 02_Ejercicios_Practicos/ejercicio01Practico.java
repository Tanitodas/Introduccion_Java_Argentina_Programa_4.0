// Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
// dos. El programa deberá después mostrar el resultado de la suma

import java.util.Scanner;

public class ejercicio01Practico {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero1 , numero2 , suma;

        System.out.println("Ingrese dos numeros:");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;

        System.out.println("La suma de los dos numeros ingresados es igual a: " + suma );

        entrada.close();

    }

}
