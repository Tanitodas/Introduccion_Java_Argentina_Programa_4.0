// Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
// dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
// fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
// ser X y el último tiene que ser una O.
// Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
// especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
// distinta de FDE, que no respete el formato se considera incorrecta.
// Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
// e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
// siguientes funciones de Java Substring(), Length(), equals().

import java.util.Scanner;

public class ejercicio12Practico {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String cadena;

        int contadorCorrecto = 0;
        int contadorIncorrecto = 0;

        do {
            
            System.out.println("Ingresa una cadena");
            cadena = entrada.nextLine();

            cadena = cadena.toUpperCase();

            if (cadena.length() <= 5) {

                if ( ( cadena.charAt(0) == 'X' ) && ( cadena.charAt( (cadena.length() - 1) ) == 'O' ) ) {

                    contadorCorrecto++;

                } else {

                    contadorIncorrecto++;

                }

            } else {

                System.out.println("Ingreso una cadena de longitud invalida");
                System.out.println("");
                System.out.println("Intentelo nuevamente:");
                
            }

        } while (!cadena.equals("&&&&&"));

        System.out.println("Total lecturas correctas: " + contadorCorrecto);
        System.out.println("Total lecturas incorrectas: " + ( contadorIncorrecto - 1 ) ); //Le restamos 1 al 'contadorIncorrecto' por el paso de cuando se introduce "&&&&&"

        entrada.close();

    }
}
