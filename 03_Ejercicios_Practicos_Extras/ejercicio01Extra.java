// Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
// usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

import java.util.Scanner;

public class ejercicio01Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int minutos;

        System.out.println("Ingrese la cantidad de MINUTOS que desea convertir a DIAS y HORAS");
        minutos = entrada.nextInt();

        //  Bloque de codigo de validacion para que no se ingrese un valor negativo.
        while( minutos < 0 ){

            System.out.println("");
            System.out.println("Ingreso un valor no valido");
            System.out.println("");
            System.out.println("Intentelo nuevamente:");
            minutos = entrada.nextInt();

        }

        System.out.println("La cantidad de minutos ingresados es igual a: [" + minutos + "] ");
        System.out.println("");

        convertirMinutos_a_DiasHoras(minutos);

        entrada.close();

    }

    //  Metodo para convertir los minutos en su cantidad equivalente de dias y horas.

    public static void convertirMinutos_a_DiasHoras ( int minutos){

        int dias = 0 , horas = 0;

        while( minutos > 0 ){

            if( minutos >= 1440 ){

                dias++;
    
                minutos = minutos - 1440;
    
            } else if( minutos >= 60 ){

                horas++;

                minutos = minutos - 60;
    
            } else if( minutos < 60) {

                minutos = 0;

            }

        }
        
        System.out.println("La cantidad de dias y horas equivalentes a los minutos ingresados es igual a: ");
        System.out.println("");
        System.out.println("Dias: [" + dias + "] y Horas: [" + horas + "]");

    }
    
}
