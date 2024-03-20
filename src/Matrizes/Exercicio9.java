/*
    9) Determinar se uma matriz é identidade (ou unidade), através de um programa em
    linguagem Java. A matriz deverá ser global e todos os seus elementos digitados. Uma
    matriz é dita identidade (ou unidade) quando ela for quadrada (no. de linhas iguais ao no.
    de colunas), tiver todos os elementos de sua diagonal principal (no. da linha igual ao no.
    da coluna) iguais a 1 (um) e todos os demais elementos iguais a 0 (zero).
*/
package Matrizes;

import java.util.Scanner;

public class Exercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do tamanho da matriz
        System.out.println("Digite o tamanho da matriz quadrada (n x n):");
        int tamanho = scanner.nextInt();

        // Inicializando a matriz com o tamanho fornecido
        int[][] matriz = new int[tamanho][tamanho];

        // Entrada dos elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificando se a matriz é uma matriz identidade
        if (verificarIdentidade(matriz)) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz NÃO é uma matriz identidade.");
        }

        scanner.close();
    }

    public static boolean verificarIdentidade(int[][] matriz) {
        // Verificando se a matriz é quadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }

        // Verificando se todos os elementos da diagonal principal são iguais a 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                }
                // Verificando se todos os outros elementos são iguais a 0
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        // Se passar por todas as verificações, a matriz é identidade
        return true;
    }
}
