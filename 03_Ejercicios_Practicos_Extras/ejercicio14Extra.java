import java.util.Scanner;

// Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
// hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
// cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.

public class ejercicio14Extra {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n , m = 0 , repeticionesFamilia = 0 , repeticionesHijos = 0 , edadHijo , promedioEdad = 0;

        System.out.println("Ingrese la cantidad de familias");
        n = entrada.nextInt();

        while (n > repeticionesFamilia) {
            
            System.out.println("Ingrese la cantidad de hijos que tiene la familia [" + repeticionesFamilia + "]");
            m = entrada.nextInt();

            while ( m > repeticionesHijos) {
             
                System.out.println("Ingrese la EDAD del hijo [" + repeticionesHijos + "] perteneciente a la familia  [" + repeticionesFamilia + "]");
                edadHijo = entrada.nextInt();

                promedioEdad = edadHijo + promedioEdad;

                repeticionesHijos++;

            }

            promedioEdad = promedioEdad/m;

            System.out.println("El promedio de edad de los hijos de la familia [" + repeticionesFamilia + "] es igual a: ' " + promedioEdad + " ' ");

            repeticionesFamilia++;

        }

        entrada.close();
    
    }

}
