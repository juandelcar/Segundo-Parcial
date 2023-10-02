import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practica2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca el tamaño del arreglo: ");
        int tam = Integer.parseInt(reader.readLine());
        int[] arreglo = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Introduzca el valor del elemento " + (i) + ": ");
            arreglo[i] = Integer.parseInt(reader.readLine());
        }
        int max = arreglo[0];
        int min = arreglo[0];
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < tam; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println();
        System.out.println("El valor máximo del arreglo es: " + max);
        System.out.println();
        System.out.println("El valor mínimo del arreglo es: " + min);
        System.out.println();
        System.out.println("Hay " + pares + " valores pares en el arreglo.");
        System.out.println();
        System.out.println("Hay " + impares + " valores impares en el arreglo.");
    }
}