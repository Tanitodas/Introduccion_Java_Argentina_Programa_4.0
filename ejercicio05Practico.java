import java.util.Scanner;

// Escribir un programa que lea un número entero por teclado y muestre por pantalla el
// doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
// Math.sqrt().

public class ejercicio5Practico {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();

        System.out.println("");
        System.out.println("El doble del numero " + numero + " es igual a: " + (numero*2) );
        System.out.println("");
        System.out.println("El triple del numero " + numero + " es igual a: " + (numero*3) );
        System.out.println("");
        System.out.println("La raiz cuadrada del numero " + numero + " es igual a: " + ( Math.sqrt(numero) ) );

        entrada.close();

    }

}
