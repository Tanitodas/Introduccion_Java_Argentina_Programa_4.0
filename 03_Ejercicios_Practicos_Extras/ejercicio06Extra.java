// Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
// por debajo de 1.60 mts. y el promedio de estaturas en general.

import java.util.Scanner;

public class ejercicio06Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numPersonas , i;
        double alturas;

        System.out.println("Ingrese la cantidad de personas de las que va a cargar sus alturas");
        numPersonas = entrada.nextInt();

        //  Creamos el vector que va a almacernar las alturas de las diferentes personas.
        double[] vectorAlturas = new double[numPersonas];

        //  Llenado de vector con las diferentes alturas ingresadas.
        for( i = 0 ; i < numPersonas ; i++ ){

            System.out.println("Ingrese la altura de la persona numero [" + ( i + 1 ) + "]");
            alturas = entrada.nextDouble();
            
            vectorAlturas[i] = alturas; 

        }

        // Recorremos el vector para contar cuanta cantidad de personas estan por debajo de los 1.6mts (cantBajos)
        //  y tambien para cuantificar cuantas personas estan por encima de 1.6mts (cantAltos).
        int cantBajos = 0;

        for ( i = 0; i < numPersonas; i++) {

            if ( vectorAlturas[i] < 1.60 ) {

                cantBajos++;

            } 
            
        }

        //  Recorremos el vector para sumar las alturas de los que son bajos (<1.6m) y de los que son altos (>1.6m).
        double sumaAlturaBajos = 0 , sumaAlturaTodos = 0;

        for ( i = 0; i < numPersonas; i++) {

            if ( vectorAlturas[i] < 1.60 ) {

                sumaAlturaBajos = vectorAlturas[i] + sumaAlturaBajos;

            }

            sumaAlturaTodos = vectorAlturas[i] + sumaAlturaTodos;
            
        }

        //  Realizamos el promedio de los bajos y de los altos.
        double promedioBajos = 0 , promedioTodos = 0;

        promedioBajos = sumaAlturaBajos / cantBajos;

        promedioTodos = sumaAlturaTodos / numPersonas;

        //  Impresion del vector para mostrar las diferentes alturas.
        System.out.println("El vector de alturas de las personas es igual:");

        for( i = 0 ; i < numPersonas ; i++ ){

            System.out.print(vectorAlturas[i] + " ");

        }

        // Impresion de ambos promedios.
        System.out.println("");
        System.out.println("El promedio de las personas que miden MENOS de 1.6m es igual a: [" + promedioBajos + "]");
        System.out.println("");
        System.out.println("El promedio de TODAS las personas es igual a: [" + promedioTodos + "]");

        entrada.close();

    }

}
