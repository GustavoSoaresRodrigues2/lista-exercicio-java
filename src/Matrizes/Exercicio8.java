/*
    8) Elaborar um programa, em linguagem Java, capaz de informar quando uma matriz
    qualquer é simétrica. Essa matriz deverá ser global e todos os seus elementos digitados.
    Uma matriz é dita simétrica quando ela for igual à sua transposta.
*/
package Matrizes;

import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        if (verificarSimetria(matriz)) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        scanner.close();
    }

    public static boolean verificarSimetria(int[][] matriz) {
        // Verificando se o número de linhas é igual ao número de colunas
        if (matriz.length != matriz[0].length) {
            return false;
        }
    
        // Verificando se a matriz é igual à sua transposta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
    
        return true;
    }
    
}
