import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) { //COMPETICIÓN: Realizar un programa que ingrese el # de competidores que van a participar, dando el nombre y el tiempo que tuvieron en la competición y al final dar el resultado del ganador 
        
        Scanner lectura = new Scanner (System.in);

        // Variables

        String ganador = "";
        int n, menor = Integer.MAX_VALUE;

        System.out.println("Cuantos competidores van a participar: ");
        n = lectura.nextInt();


        String [] Nombres = new String [n];

        for (int i = 0; i < Nombres.length; i++) {
            System.out.println("Digite el nombre del concursante "+(i+1));
            Nombres[i] = lectura.next();
        }

        int [] Tiempos = new int [n];

     

        for (int i = 0; i < Tiempos.length; i++) {
            System.out.println("Digite el tiempo del concursante "+(i+1));
            Tiempos[i] = lectura.nextInt();

            if (Tiempos[i] < menor) {
                menor = Tiempos[i];
            }
        }

        for (int i = 0; i < Tiempos.length; i++) {
            if (Tiempos[i] == menor) {
                ganador = Nombres[i];
                break; 
            }
        }

        System.out.println("El ganador es " + ganador + " con un tiempo de " + menor + " segundos.");
        lectura.close();
    }
}
