/*
    73) Elaborar um programa, em linguagem Java, capaz de realizar a busca de um
    determinado caractere, digitado, em um vetor qualquer de tamanho 10, também com seus
    elementos do tipo char digitados, informando qual o índice do vetor que esse caractere se
    localiza. Utilizar ordenação do tipo inserção e busca binária recursiva.
*/
package Ordenação_por_Insercao;

import java.util.Scanner;

public class Exercicio73 {

    // Função para ordenação por inserção
    static void ordenacaoInsercao(char[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            char chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    // Função para busca binária recursiva
    static int buscaBinariaRecursiva(char[] vetor, int inicio, int fim, char chave) {
        if (fim >= inicio) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio] == chave)
                return meio;

            if (vetor[meio] > chave)
                return buscaBinariaRecursiva(vetor, inicio, meio - 1, chave);

            return buscaBinariaRecursiva(vetor, meio + 1, fim, chave);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[10];

        // Preenchendo o vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.next().charAt(0);
        }

        // Ordenando o vetor
        ordenacaoInsercao(vetor);

        // Imprimindo o vetor ordenado
        System.out.println("\nVetor ordenado:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Busca de caractere
        System.out.print("\nDigite o caractere a ser buscado: ");
        char caractere = scanner.next().charAt(0);

        // Realizando busca binária recursiva
        int indice = buscaBinariaRecursiva(vetor, 0, vetor.length - 1, caractere);

        // Exibindo resultado da busca
        if (indice != -1) {
            System.out.println("O caractere '" + caractere + "' foi encontrado no índice: " + indice);
        } else {
            System.out.println("O caractere '" + caractere + "' não foi encontrado no vetor.");
        }

        scanner.close();
    }
}