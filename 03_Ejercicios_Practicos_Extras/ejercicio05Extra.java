// Una obra social tiene tres clases de socios:
//      o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//      todos los tipos de tratamientos.
//      
//      o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
//      para los mismos tratamientos que los socios del tipo A.
//
//      o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//      tratamientos.
//
//      o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//      real que represente el costo del tratamiento (previo al descuento) y determine el
//      importe en efectivo a pagar por dicho socio.

import java.util.Scanner;

public class ejercicio05Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String tipoSocio;
        double montoTratamiento;

        System.out.println("Ingrese el monto del tratamiento a realizar:");
        montoTratamiento = entrada.nextDouble();

        entrada.nextLine(); //  Limpiamos el Buffer.

        System.out.println("Ingrese el tipo de socio del cliente. ( A / B / C )");
        tipoSocio = entrada.nextLine();

        // tipoSocio = tipoSocio.toUpperCase();

        // while ( tipoSocio != "A" ) {
            
        //     System.out.println("");
        //     System.out.println("Ingreso un tipo de cliente no valido.");
        //     System.out.println("");
        //     tipoSocio = entrada.nextLine();

        //     tipoSocio = tipoSocio.toUpperCase();

        // }

        //  Comente las lineas de codigo anteriores porque no pude hacer funcionar la validacion en el bloque del codigo 'while'.

        switch (tipoSocio) {
            case "A":

                System.out.println("El socio [ De tipo 'A'] tiene un costo de tratamiento (SIN el descuento del 50%) igual a: " + montoTratamiento );

                montoTratamiento = montoTratamiento - ( montoTratamiento * 0.5 );

                System.out.println("El socio [ De tipo 'A'] tiene un costo de tratamiento (CON el descuento del 50%) igual a: " + montoTratamiento );

                break;

            case "B":

                System.out.println("El socio [ De tipo 'B'] tiene un costo de tratamiento (SIN el descuento del 35%) igual a: " + montoTratamiento );
                
                montoTratamiento = montoTratamiento - ( montoTratamiento * 0.35 );

                System.out.println("El socio [ De tipo 'B'] tiene un costo de tratamiento (CON el descuento del 35%) igual a: " + montoTratamiento );

                break;

            case "C":

                //  Al tipo de socio 'C' no se le realiza ningun descuento sobre el tratamiento.

                System.out.println("El socio [ De tipo 'C'] tiene un costo de tratamiento (SIN el descuento posible) igual a: " + montoTratamiento );

                break;
        }

        entrada.close();

    }

}
