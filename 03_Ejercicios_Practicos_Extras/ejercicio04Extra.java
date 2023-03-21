//  Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//  equivalente en romano.

import java.util.Scanner;

public class ejercicio04Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero ENTRE 1 y 10 que quiera convertir a número romano");
        num = entrada.nextInt();

        while(num < 1 || num > 10 ){

            System.out.println("");
            System.out.println("No ingresó un numero en el rango de 1 y 10");
            System.out.println("");
            System.out.println("Intentelo de vuelta:");
            num = entrada.nextInt();

        }        

        switch (num) {
            case 1: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'I' ");
                break;
            case 2: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'II' ");
                break;
            case 3: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'III' ");
                break;
            case 4: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'IV' ");
                break;
            case 5: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'V' ");
                break;
            case 6: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'VI' ");
                break;
            case 7: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'VII' ");
                break;
            case 8: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'VIII' ");
                break;
            case 9: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'IX' ");
                break;
            case 10: 
                System.out.println("El número romano equivalente al numero [" + num + "] es igual a: 'X' ");
                break;
       
        }

        entrada.close();

    }

}
