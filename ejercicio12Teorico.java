// Crea un procedimiento 'EsMultiplo' que reciba los dos números pasados por el usuario, validando
// que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
// segundo, sino informe que no lo son.

import java.util.Scanner;

public class ejercicio12Teorico {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int cantPares, i , numero1 = 0 , numero2 = 0;

        System.out.println("Ingrese la cantidad de PARES de numeros que quiere comparar para saber si son multiplos o no");
        cantPares = entrada.nextInt();

        for ( i = 1 ; i <= cantPares ; i++) {

            System.out.println("Ingrese el numero 1 del par " + i );
            numero1 = entrada.nextInt();

            System.out.println("Ingrese el numero 2 del par " + i );
            numero2 = entrada.nextInt();

            multiploDeNum(numero1, numero2);

        }

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error

    }

    public static void multiploDeNum(int numero1 , int numero2){

        if ( numero1%numero2 == 0 ){

            System.out.println("El numero " + "'" + numero1 + "'" + " ES multiplo del numero " + "'" + numero2 + "'");

        } else if(numero1%numero2 != 0){

            System.out.println("El numero " + "'" + numero1 + "'" + " NO es multiplo del numero " + "'" + numero2 + "'");
            
        }
        
    }
}
