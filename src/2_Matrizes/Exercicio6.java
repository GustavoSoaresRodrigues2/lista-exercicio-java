/*
    6) Elaborar um programa, em linguagem Java, capaz de limpar (colocar -1 em todas as
    suas posições) qualquer tipo de matriz, inteira e positiva e que seja declarada globalmente.
    O programador deverá definir o tamanho da matriz (linhas e colunas), antes de compilar
    o programa.
*/
package Matrizes;
public class Exercicio6 {

    public static int LINHAS = 4;
    public static int COLUNAS = 4;
    
    public static void main(String[] args) {
        int[][] matriz = new int[LINHAS][COLUNAS];
        
        limparMatriz(matriz);

        System.out.println("Matriz Limpa:");
        imprimirMatriz(matriz);
    }

    public static void limparMatriz(int[][] matriz) {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                matriz[i][j] = -1; // Colocando -1 em todas as posições
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
