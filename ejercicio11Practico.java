// Realizar un programa que pida dos números enteros positivos por teclado y muestre por
// pantalla el siguiente menú:
//
//      MENU
//      1. Sumar
//      2. Restar
//      3. Multiplicar
//      4. Dividir
//      5. Salir
//      Elija opción:
//
// El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
// pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
// opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
// programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
// seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
// del programa, caso contrario se vuelve a mostrar el menú.

import java.util.Scanner;

public class ejercicio11Practico {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero1 , numero2 , opcion = 0;

        System.out.println("Ingrese dos numeros enteros positivos y luego decida que hacer con ellos");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        while (numero1 <= 0 || numero2 <= 0){

            System.out.println("Ingreso un numero que no es entero o positivo");
            System.out.println("");
            System.out.println("Intentelo de nuevo:");
            numero1 = entrada.nextInt();
            numero2 = entrada.nextInt();
            
        }

        if (numero1 > 0 && numero2 > 0){

            do{

                System.out.println("");
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Elija una opcion: ");
                System.out.println("");
                
                opcion = entrada.nextInt();

                //Limpiado de Buffer
                entrada.nextLine();

                switch (opcion) {

                    case 1:
                     
                        int suma = numero1 + numero2;
                        System.out.println("La SUMA de los dos numeros ingresados (" + numero1 + " y " + numero2 + ") es igual a: " + suma );
                        break;
        
                    case 2:
        
                        int resta = numero1 - numero2;
                        System.out.println("La RESTA de los dos numeros ingresados (" + numero1 + " y " + numero2 + ") es igual a: " + resta );
                        break;
        
                    case 3:
        
                        int multiplicacion = numero1 * numero2;
                        System.out.println("La MULTIPLICACION de los dos numeros ingresados (" + numero1 + " y " + numero2 + ") es igual a: " + multiplicacion );
                        break;
        
                    case 4:
        
                        int divicion = numero1 / numero2;
                        System.out.println("La DIVICION de los dos numeros ingresados (" + numero1 + " y " + numero2 + ") es igual a: " + divicion );
                        break;
        
                    case 5:
        
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        String palabra = entrada.nextLine();
        
                        if ( palabra.equalsIgnoreCase("S") ){
        
                            System.out.println("Saliendo del programa...");
                            opcion = 6;
        
                        }else if ( palabra.equalsIgnoreCase("N") ){

                            System.out.println("Volviendo al menu...");
                            opcion = 0;

                        } break;

                };

            } while ( opcion != 6 );

        }

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error aunque el codigo corre igual

    }

}
