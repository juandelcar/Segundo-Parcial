public class Matrices {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int valor = 1;
        // Metodo tradicionla para rellenar 
        for ( int i=0; i<matriz1.length; i++){
            for ( int j=0; j<matriz1[i].length; j++){
                matriz1[i][j] = valor;
                valor++;
            }
        }
        // Impresion con for tradicional
        for (int i = 0; i < matriz1.length; i++) {
            for( int j=0; j<matriz1.length; j++){
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }
}