// Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
// detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
// y la cantidad de números impares. Al igual que en el ejercicio anterior los números
// negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

import java.util.Scanner;

public class ejercicio08Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num , numLeidos = 0 , numPares = 0  , numImpares = 0;

        do {
            
            System.out.println("Ingrese un numero:");
            num = entrada.nextInt();

            if( num%2 == 0 ){

                numPares++;

            }else if (num%2 != 0 && num%num == 0){

                numImpares++;

            }

            numLeidos++;

        } while(num%5 != 0);

        System.out.println("");
        System.out.println("La cantidad de numeros LEIDOS es igual a: " + numLeidos );
        System.out.println("");
        System.out.println("La cantidad de numero PARES es igual a: " + numPares);
        System.out.println("");
        System.out.println("La cantidad de numeros IMPARES es igual a: " + numImpares);

        entrada.close();

    }

}
