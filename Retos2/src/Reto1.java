import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) { //Generar un programa que me permita saber si "n" cantidad de números registrados existen números múltiplos de 2 
        
        Scanner lectura = new Scanner(System.in); 

        //Variables

        int n, contador= 0,contador2= 0 ;
        


        System.out.println("Digite la cantidad de numeros que quiere almacenar: ");
        n = lectura.nextInt();


        int [] Numeros = new int [n];
        
        for (int i = 0; i < Numeros.length; i++) {

          System.out.println("Ingrese el numero en la posición: "+(i+1));
          Numeros[i] = lectura.nextInt();

          
            
        } for (int i = 0; i < Numeros.length; i++) {

            System.out.println("El numero de la posición "+(i+1)+" es: "+Numeros[i]);

            if (Numeros[i] % 2 == 0) {
                
                contador++;
                
            } else {

                contador2++;
            }
            
             
            
        }
        System.out.println("El contador de multiplos de dos es: "+contador);
        System.out.println("El contador de los NO multiplos es: "+contador2);

        lectura.close();
    }
   
}
