/*
    7) Determinar a matriz transposta de uma matriz global qualquer e digitada, através de
    um programa em linguagem Java. Uma matriz é dita transposta quando a matriz original
    tiver suas linhas transformadas em colunas e suas colunas transformadas em linhas.
*/
package Matrizes;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Insira o número de colunas da matriz: ");
        int colunas = scanner.nextInt();
        
        int[][] matriz = new int[linhas][colunas];
        
        System.out.println("Insira os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        
        System.out.println();
        
        System.out.println("Matriz transposta:");
        int[][] transposta = calcularTransposta(matriz);
        imprimirMatriz(transposta);
        
        scanner.close();
    }

    public static int[][] calcularTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        int[][] transposta = new int[colunas][linhas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        return transposta;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
