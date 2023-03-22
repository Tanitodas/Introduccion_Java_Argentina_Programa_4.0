// Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
// promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
// números serán introducidos por el usuario. Realice dos versiones del programa, una
// usando el bucle “while” y otra con el bucle “do - while”.

import java.util.Scanner;

public class ejercicio07ExtraV2 {
    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que va a cargar");
        int n = entrada.nextInt();

        int repeticiones = 0;

        double num , valMax = 0.0 , valMin = 1000000.0 , sumaNumeros = 0.0;

        do {

            System.out.println("Ingrese el número de la posicion nº" + repeticiones + "(Ingrese numeros enteros y positivos)");
            num = entrada.nextDouble();

            if ( valMax < num ){

                valMax = num;

            }
            if ( valMin > num ){

                valMin = num;

            }

            sumaNumeros = num + sumaNumeros;

            repeticiones++;

        } while ( repeticiones < n );

        double promedioNumeros = (sumaNumeros/repeticiones) ;

        System.out.println("");
        System.out.println("El número MAXIMO ingresado es igual a: " + valMax );
        System.out.println("");
        System.out.println("El número MINIMO ingresado es igual a: " + valMin );
        System.out.println("");
        System.out.println("El promedio de todos los números es igual a: " + promedioNumeros );

        entrada.close();
        
    }

}
