/*
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
 * Scanner.
 */

 import java.util.Scanner;  //Importacion de la CLASE "Scanner"

public class ejercicio5Teorico {
    public static void main(String[] args) {

        /*  
         *  Creaccion de un OBJETO (que nos va a permitir leer un dato ingresado por teclado) de la CLASE 'Scanner'.
         *  
         *  MAS ADELANTE Utilizaremos el '.useDelimiter("\n")' para que cuando leamos un string o un char no nos quede almacenada en boofer un intro (que se simboliza con "\n")
         *  Asi podremos seguir leyendo datos sin ningun problema. Sino realizamos esto la proxima lectura que realizamos no nos la toma ya que queda almacenado
         *  el intro en el boofer.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un valor para una variable de tipo Boolean(Verdadero o Falso)");
        boolean valorBoolean = entrada.nextBoolean(); 

        System.out.println("Ingrese un numero decimal");
        double num1 = entrada.nextDouble();

        System.out.println("Ingrese un caracter");
        char caracter = entrada.next().charAt(0);// Con el comando .next().charAt leemos un caracter ya que no podemos leer un char igual que un string.

        System.out.println("Ingrese una palabra");
        String palabra = entrada.next(); // Aqui con el comando .next() leemos lo que ingresa el usuario hasta que encuentra un espacio vacio.


        System.out.println("El valor de la variable booleana es: " + valorBoolean + ".");
        System.out.println("El valor del numero decimal es: " + num1 + ".");
        System.out.println("El valor del char ingresado es: " + caracter + ".");
        System.out.println("El valor de la palabra ingresada es: " + palabra + ".");

        entrada.close(); // Cerramos el objeto de 'entrada' para que no nos tire error
    }
}