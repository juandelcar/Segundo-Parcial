import java.util.Scanner;

public class EMarices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese el tamaño de las filas de la matriz A: ");
        int filasA = scanner.nextInt();
        System.out.println("Ingrese el tamaño de las columnas de la matriz A: ");
        int columnasA = scanner.nextInt();
        
        System.out.println("Ingrese los valores de la matriz A: ");
        int[][] matrizA = new int[filasA][columnasA];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Ingrese el tamaño de las filas de la matriz B:");
        int filasB = scanner.nextInt();
        System.out.println("Ingrese el tamaño de las columnas de la matriz B:");
        int columnasB = scanner.nextInt();
        
        System.out.println("Ingrese los valores de la matriz B:");
        int[][] matrizB = new int[filasB][columnasB];
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }
        
        if (columnasA != filasB) {
            System.out.println("No se pueden multiplicar estas matrices porque las columnas de A deben ser iguales a las filas de B.");
            return;
        }
        
        System.out.println();
        int[][] resultado = multiplicarMatrices(matrizA, matrizB);
        
        System.out.println("El resultado de la multiplicación es:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;
        
        int[][] resultado = new int[filasA][columnasB];
        
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        
        return resultado;
    }
}