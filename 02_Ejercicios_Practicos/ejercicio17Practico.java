// Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
// de 2 dígitos, etcétera (hasta 5 dígitos).

import java.util.Random;
import java.util.Scanner;

public class ejercicio17Practico {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n , i;
        int c1 = 0 , c2 = 0 , c3 = 0 , c4 = 0 , c5 = 0;

        System.out.println("ingrese la dimension del vector");
        n = entrada.nextInt();

        //Limpiado de Buffer para poder contestar la siguiente instruccion
        entrada.nextLine();

        int[] vectorEnteros = new int[n];

        System.out.println("¿Desea rellenar el vector con numeros aleatorios de 1 a 5 digitos? S/N");
        String caracter = entrada.nextLine();

        if ( caracter.equalsIgnoreCase("S") ){

            llenadoDeVectorAleatorio(vectorEnteros, n);

            for ( i = 0; i < n ; i++ ) {

                switch ( contarDig( vectorEnteros[i] ) ) {
                    case 1:{
                        c1++;
                        break;
                    }
                    case 2:{
                        c2++;
                        break;
                    }
                    case 3:{
                        c3++;
                        break;
                    }
                    case 4:{
                        c4++;
                        break;
                    }
                    case 5:{
                        c5++;
                        break;
                    }
                }
            }

            System.out.println("");
            System.out.println("Siendo los elementos del vector los siguientes");
            System.out.println("");
                
            // Impresion de vector
            for ( i = 0 ; i < n ; i++ ){

                System.out.print(vectorEnteros[i] + " "); 

            }

            System.out.println("");
            System.out.println("Numberos con 1 digito: " + c1);
            System.out.println("Numberos con 2 digitos: " + c2);
            System.out.println("Numberos con 3 digitos: " + c3);
            System.out.println("Numberos con 4 digitos: " + c4);
            System.out.println("Numberos con 5 digitos: " + c5);
            System.out.println("");

            

        } else if ( caracter.equalsIgnoreCase("N") ) {

            System.out.println("Puede rellenar el vector con valores de forma manual");
            System.out.println("");
            System.out.println("¿Desea rellenar el vector de esta manera? S/N");
            caracter = entrada.nextLine();

            if(caracter.equalsIgnoreCase("S")){

                int valorVector;

                for( i = 0 ; i < n ; i++){

                    System.out.println("Ingrese un valor, de 1 a 5 digitos, para el vector en la posicion " + i);
                    
                    valorVector = entrada.nextInt();

                    vectorEnteros[i] = valorVector;

                }

                for ( i = 0; i < n ; i++ ) {

                    switch ( contarDig(vectorEnteros[i]) ) {
                        case 1:{
                            c1++;
                            break;
                        }
                        case 2:{
                            c2++;
                            break;
                        }
                        case 3:{
                            c3++;
                            break;
                        }
                        case 4:{
                            c4++;
                            break;
                        }
                        case 5:{
                            c5++;
                            break;
                        }
                    }
                }
    
                System.out.println("");
                System.out.println("Siendo los elementos del vector los siguientes");
                System.out.println("");
                    
                // Impresion de vector
                for ( i = 0 ; i < n ; i++ ){
    
                    System.out.print(vectorEnteros[i] + " "); 
    
                }
    
                System.out.println("");
                System.out.println("Numberos con 1 digito: " + c1);
                System.out.println("Numberos con 2 digitos: " + c2);
                System.out.println("Numberos con 3 digitos: " + c3);
                System.out.println("Numberos con 4 digitos: " + c4);
                System.out.println("Numberos con 5 digitos: " + c5);
                System.out.println("");    

            } else if(caracter.equalsIgnoreCase("N")){

                System.out.println("Saliendo del programa...");

            }

        }

        entrada.close();

    }

    //  Metodo para llenar el vector con valores aleatorios de dimension 'n'
    public static void llenadoDeVectorAleatorio( int[] vectorEnteros , int n ){

        int i;

        Random aleatorio = new Random(); // Creamos el OBJETO 'aleatorio' de la clase random que importamos antes. 

        for( i = 0 ; i < n ; i++){

            vectorEnteros[i] = aleatorio.nextInt(15000); // Aca asignamos valores aleatorios de tipo entero entre los limites de 0 y 14999 (ya que le pasamos un argumento de 15000 al metodo)

        }

    }

    /*  Funcion para calcular la cantidad de digitos que tiene un numero.
     *  
     *  La función contarDig recibe un número, y lo que hace es ir quitandole un dígito en cada vuelta del while, mientras
     *  aumenta el contador de dígitos. 
     *  Al final, cuando el número no se puede dividir más por 10 (o no se pueden quitar más dígitos, básicamente), 
     *  retorna el contador.
     * 
     */  
    private static int contarDig(int i) {

        int cont = 0;

        while (i > 0) {

            i = i / 10;
            cont++;
        }
        
        return cont;

    }

}