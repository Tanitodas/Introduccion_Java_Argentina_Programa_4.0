// Crea una aplicación que a través de una función nos convierta una cantidad de euros
// introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
// función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
// una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
// (void).
//      El cambio de divisas es:
//      * 0.86 libras es un 1 €
//      * 1.28611 $ es un 1 €
//      * 129.852 yenes es un 1 €

import java.util.Scanner;

public class ejercicio14Practico {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int euros;
        String nombreDivisas;

        System.out.println("Ingrese la cantidad de Euros que quiere cambiar a otro moneda:");
        euros = entrada.nextInt();

        //Limpiado de Buffer
        entrada.nextLine();

        System.out.println("Ingrese la divisa a la que quiere transformar los euros (libra/dolar/yenes)");
        nombreDivisas = entrada.nextLine();

        while( nombreDivisas == "libra" || nombreDivisas == "dolar" || nombreDivisas == "yenes" ){

            System.out.println("Ingreso una opcion invalida");
            System.out.println("");
            System.out.println("Intentelo nuevamente");
            nombreDivisas = entrada.nextLine();

        }

        conversionDivisas(euros, nombreDivisas);

    }

    public static void conversionDivisas( int euros , String nombreDivisas){

        double[] divisas = new double[3];
        
        divisas[0] = 0.86;
        divisas[1] = 1.28611;
        divisas[2] = 129.852;

        switch (nombreDivisas) {

            case "libra":

                System.out.println("La cantidad " + euros + " euros, transformado a LIBRAS es igual a: " + (divisas[0]*euros) );
                break;

            case "dolar":

                System.out.println("La cantidad " + euros + " de euros, transformado a DOLARES es igual a: " + (divisas[1]*euros) );
                break;

            case "yenes":

                System.out.println("La cantidad " + euros + " de euros, transformado a YENES es igual a: " + (divisas[2]*euros) );
                break;

        }

    }

}
