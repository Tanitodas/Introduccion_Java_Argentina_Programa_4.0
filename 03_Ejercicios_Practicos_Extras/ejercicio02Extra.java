// Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
// una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
// C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
// iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

import java.util.Scanner;

public class ejercicio02Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        

        int A , B , C , D , auxiliar = 0;

        System.out.println("Ingrese el valor de la letra 'A' ");
        A = entrada.nextInt();

        System.out.println("Ingrese el valor de la letra 'B' ");
        B = entrada.nextInt();

        System.out.println("Ingrese el valor de la letra 'C' ");
        C = entrada.nextInt();

        System.out.println("Ingrese el valor de la letra 'D' ");
        D = entrada.nextInt();

        System.out.println("");
        System.out.println("El valor INICIAL de 'A' es: [" + A + "].");
        System.out.println("");
        System.out.println("El valor INICIAL de 'B' es: [" + B + "].");
        System.out.println("");
        System.out.println("El valor INICIAL de 'C' es: [" + C + "].");
        System.out.println("");
        System.out.println("El valor INICIAL de 'D' es: [" + D + "].");

        auxiliar = B;

        B = C;

        C = A;

        A = D;

        D = auxiliar;

        System.out.println("");
        System.out.println("El valor FINAL de 'A' es: [" + A + "].");
        System.out.println("");
        System.out.println("El valor FINAL de 'B' es: [" + B + "].");
        System.out.println("");
        System.out.println("El valor FINAL de 'C' es: [" + C + "].");
        System.out.println("");
        System.out.println("El valor FINAL de 'D' es: [" + D + "].");

        entrada.close();

    }

}
