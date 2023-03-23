// Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
// restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
// matemática y deben devolver sus resultados para imprimirlos en el main.

import java.util.Scanner;

public class ejercicio15Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double num1 , num2;

        System.out.println("Ingrese el PRIMER numero (numero 1)");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el SEGUNDO numero (numero 2)");
        num2 = entrada.nextDouble();

        int opcion;

        do {
            
            System.out.println("¿Que desea hacer con los numeros?");
            System.out.println("");
            System.out.println("1. Sumar N1 con N2");
            System.out.println("2. Restar N1 con N2");
            System.out.println("3. Multiplicar N1 con N2");
            System.out.println("4. Dividir N1 con N2");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();

            //  Bloque de codigo de validacion para que se ingrese una opcion existente en el menú
            while ( opcion < 1 || opcion > 5 ) {

                System.out.println("Ha ingresado una opcion no valida");
                System.out.println("Intentelo nuevamente");
                opcion = entrada.nextInt();

            }

            switch ( opcion ) {
                case 1:
                    
                    sumarNumeros(num1, num2);
                    break;

                case 2:

                    restarNumeros(num1, num2);
                    break;

                case 3:

                    multiplicarNumeros(num1, num2);
                    break;

                case 4:

                    dividirNumeros(num1, num2);
                    break;

                case 5:

                    System.out.println("Saliendo del programa...");
                    break;

            }

        } while ( opcion != 5 );

        entrada.close();

    }

    // ********************************************************************************************************************

    public static void sumarNumeros ( double num1 , double num2) {
        
        double suma;

        suma = num1 + num2;

        System.out.println("La SUMA del numero [ " + num1 + " ] y [ " + num2 +" ] es igual a ' " + suma + " ' ");


    }

    // ********************************************************************************************************************

    public static void restarNumeros ( double num1 , double num2) {
        
        double resta;

        resta = num1 - num2;

        System.out.println("La RESTA del numero [ " + num1 + " ] y [ " + num2 +" ] es igual a ' " + resta + " ' ");


    }

    // ********************************************************************************************************************

    public static void multiplicarNumeros ( double num1 , double num2) {

        double multiplicacion;

        multiplicacion = num1 * num2;

        System.out.println("La MULTIPLICACION del numero [ " + num1 + " ] y [ " + num2 +" ] es igual a ' " + multiplicacion + " ' ");
            
    }

    // ********************************************************************************************************************

    public static void dividirNumeros ( double num1 , double num2) {

        double division;

        division = num1 / num2;

        System.out.println("La DIVISION del numero [ " + num1 + " ] y [ " + num2 +" ] es igual a ' " + division + " ' ");
            
    }


}
