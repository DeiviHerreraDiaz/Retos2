import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) { //

        Scanner lectura = new Scanner(System.in);

        // Variables
        String palabra;
        int contador = 0;

        // Vectores adicionales para almacenar las palabras y la frecuencia
        String[] palabras = new String[9];
        int[] frecuencia = new int[9];
       
        

        System.out.println("Bienvenido al juego concentrese ");
        System.out.println("Rellene la matriz con 9 palabras");

        System.out.println();

        String[][] juego = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite la palabra en la posición: " + (i + 1) + " , " + (j + 1));
                palabra = lectura.next();
                juego[i][j] = palabra;
                // Agregar la palabra al arreglo de palabras
                palabras[contador] = palabra;
                contador++;
            }
        }

        System.out.println();

        for (int i = 0; i < juego.length; i++) {
            for (int j = 0; j < juego.length; j++) {
                System.out.print(juego[i][j] + "\t");
            }
            System.out.println();
        }

        // Comprobar cuántas veces aparece cada palabra
        for (int i = 0; i < palabras.length; i++) {
            int apariciones = 0;
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    apariciones++;
                }
            }
            frecuencia[i] = apariciones;
        }

        // Imprimir las palabras repetidas y su frecuencia
        System.out.println("Las palabras que se repiten son: ");
        for (int i = 0; i < palabras.length; i++) {
            if (frecuencia[i] > 1) {
                System.out.println(palabras[i] + " (aparece " + frecuencia[i] + " veces)");
            }
        }

        lectura.close();
    }
}
