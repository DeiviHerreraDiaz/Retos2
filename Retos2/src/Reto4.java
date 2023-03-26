import java.util.Scanner;

public class Reto4 {        
 public static void main(String[] args) { 
    /*  Haciendo uso de matrices desarrolle un programa que permita simular
    las siguientes acciones de una maquina expendedora de dulces con
    capacidad para 16 productos: */
    /*Permita llenar la máquina con 16 nombres de productos y su respectivo precio.
     * Muestre el catálogo de productos con el código del producto (posición), nombre y precio de cada producto ingresado.
    */
    
    Scanner lectura = new Scanner(System.in);
    
    System.out.println("Bienvenido a la maquina expendedora ");
    System.out.println("Va a ingresar 16 productos");

    System.out.println();

    String [][] maquina = new String [4][4];

    for (int i = 0; i < maquina.length; i++) {
        for (int j = 0; j < maquina.length; j++) {
            
            System.out.print("Digite el producto y el precio en la posición: "+i+" , "+j+": ");
            maquina[i][j] = lectura.nextLine();
            
        }

        }

        System.out.println();

        for (int j = 0; j < maquina.length; j++) {
            for (int j2 = 0; j2 < maquina.length; j2++) {
                
                System.out.print(j);
                System.out.print(j2+"");
                System.out.print(" "+maquina[j][j2]+"\t");
            }
            System.out.println();
        }
     lectura.close();
    }
    
 }



        
        

        

    


    
