public class Ejemplo {
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int[][] matrizB = {
            {2, 0},
            {1, 2},
            {0, 3},
            {1, 1}
        };

        System.out.println();

        int[][] resultado = multiplicarMatrices(matrizA, matrizB);

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

        if (columnasA != matrizB.length) {
            throw new IllegalArgumentException("No se pueden multiplicar estas matrices. Las columnas de A deben ser iguales a las filas de B.");
        }

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
