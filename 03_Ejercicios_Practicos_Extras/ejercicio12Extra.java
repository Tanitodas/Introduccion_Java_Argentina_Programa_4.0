// Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
// 0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
// Ejemplo:
// 0-0-0
// 0-0-1
// 0-0-2
// 0-0-E
// 0-0-4
// 0-1-2
// 0-1-E
// Nota: investigar función equals() y como convertir números a String.

public class ejercicio12Extra {
    
    public static void main(String[] args) {

        int i , j , k;

        String numCadena1 , numCadena2 , numCadena3;

        for ( i = 0 ; i < 10 ; i++ ) {
            
            for ( j = 0 ; j < 10 ; j++) {

                for ( k = 0; k < 10; k++) {

                    numCadena1 = String.valueOf(i); //  Valuamos el string con el valor que toma la variable 'i' pero con formato de string, es decir, i=2 quedaria numCadena1 = "2"
                    numCadena2 = String.valueOf(j); //  Valuamos el string con el valor que toma la variable 'i' pero con formato de string, es decir, i=2 quedaria numCadena1 = "2"
                    numCadena3 = String.valueOf(k); //  Valuamos el string con el valor que toma la variable 'i' pero con formato de string, es decir, i=2 quedaria numCadena1 = "2"

                    numCadena1 = numCadena1.replace("3", "E");  //  Reemplazamos el numero en forma de string "3" por la letra "E".
                    numCadena2 = numCadena2.replace("3", "E");  //  Reemplazamos el numero en forma de string "3" por la letra "E".
                    numCadena3 = numCadena3.replace("3", "E");  //  Reemplazamos el numero en forma de string "3" por la letra "E".

                    System.out.println( numCadena1 + " - " + numCadena2 + " - " + numCadena3 );

                }

            }

        }

    }

}
