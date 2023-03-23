import java.util.Scanner;

// Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
// las personas ingresadas por teclado e indique si son mayores o menores de edad.
// Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
// mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

public class ejercicio16Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas que va a cargar");
        int n = entrada.nextInt();

        entrada.nextLine(); //  Limpiamos el buffer.

        while ( n > 0 ) {
            
            cargaDeDatosPersona(n, entrada);

            n = n - 1;

            if( n > 0){

                System.out.println("¿Quiere seguir cargando personas? S/N");
                String opcion = entrada.nextLine();
    
                if( opcion.equalsIgnoreCase("S") ){
    
                    continue;
    
                } else if (opcion.equalsIgnoreCase("N")) {
    
                    System.out.println("Saliendo del programa...");
                    break;
    
                }

            } else {

                System.out.println( "No hay mas personas para cargar.");

            }


        }

        entrada.close();

    }

    public static void cargaDeDatosPersona ( int n , Scanner entrada ) {

        String nombres , apellidos;
        int cont = 0 , edad;

        System.out.println("Ingrese el nombre o nombres de la persona " + cont);
        nombres = entrada.nextLine();

        System.out.println("Ingrese el apellido o apellidos de la persona " + cont);
        apellidos = entrada.nextLine();

        System.out.println("Ingrese la edad de la persona " + cont);
        edad = entrada.nextInt();

        if( edad >= 18) {

            System.out.println("La persona es MAYOR de edad.");

        } else if( edad < 18){

            System.out.println("La persona es MENOR de edad.");

        }

        entrada.nextLine(); //  Limpiamos el buffer.

    }

}
