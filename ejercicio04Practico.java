// Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
// Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class ejercicio4Practico {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int gradosCelsius;

        System.out.println("Ingrese la cantidad de grados Celsius que quiere transformar:");
        gradosCelsius = entrada.nextInt();

        System.out.println("La cantidad de grados celsius expresado en grados Farenheit es:");
        System.out.println( ( 32 + (9 * gradosCelsius/5)) ); 

        entrada.close();

    }

}
