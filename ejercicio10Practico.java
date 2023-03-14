// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
// solicite números al usuario hasta que la suma de los números introducidos supere el
// límite inicial.

import java.util.Scanner;

public class ejercicio10Practico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int limiteDeSuma , numeros = 0 , suma = 0 , i = 1 ;

        System.out.println("Ingrese el límite superior de la suma");
        limiteDeSuma = entrada.nextInt();

        System.out.println("");
        System.out.println("A continuacion debera ingresar diferentes numeros y podra ingresarlos hasta que su suma supere al limite superior que coloco anteriormente");

        do {

            System.out.println("ingrese el numero " + i );
            numeros = entrada.nextInt();

            suma = numeros + suma;

            i++;

        } while ( limiteDeSuma > suma );

        if (suma > limiteDeSuma){

            System.out.println("");
            System.out.println("Se supero el limite superior de suma " + limiteDeSuma);
            System.out.println("");

            suma = suma - numeros; //   Hacemos este paso para restar el numero que supero el limite de suma y asi presentar a la suma por debajo del dicho limite

            System.out.println("La suma queda con el siguiente valor " + "[" + suma + "]" );
            System.out.println("sin contar el numero que al sumarlo superaba el limite, en este caso es el numero: " + "[" + numeros + "]");

        }

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error aunque el codigo corre igual

    }
    
}
    