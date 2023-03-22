// Simular la división usando solamente restas. Dados dos números enteros mayores que
// uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
// Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
// este resultado es el residuo, y el número de restas realizadas es el cociente.
// Por ejemplo: 50 / 13:
//              50 – 13 = 37 una resta realizada
//              37 – 13 = 24 dos restas realizadas50
//              24 – 13 = 11 tres restas realizadas
// dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
// ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

import java.util.Scanner;

public class ejercicio09Extra {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int dividendo, divisor;

        do {
            
            System.out.println("Ingrese el dividendo:");
            dividendo = entrada.nextInt();
    
            System.out.println("Ingrese el divisor:");
            divisor = entrada.nextInt();

        } while (dividendo < 1 || divisor < 1 );

        int restas = dividendo , contRestas = 0;

        System.out.println("");
        System.out.println("El resultado de dividir: " + dividendo + " / " + divisor);
        System.out.println("");

        while ( restas > divisor ) {

            contRestas++;
            
            restas = restas - divisor;

            System.out.println("Se realiza la resta nº: " + contRestas);
            System.out.println( dividendo + " - " + divisor + " = " + restas);
            System.out.println("");

        }

        System.out.println("Dado que " + restas + " es menor que " + divisor + " se detiene el procedimiento de RESTAS SUCESIVAS.");
        System.out.println("El COCIENTE de esta division es igual a: " + contRestas);
        System.out.println("El RESIDUO de esta division es igual a: " + restas);

        entrada.close();
    }
    
}
