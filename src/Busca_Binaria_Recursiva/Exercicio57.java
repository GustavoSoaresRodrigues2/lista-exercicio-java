/*
    57) Realizando através de busca binária recursiva, resolver o exercício no. 47 desta lista.
*/
package Busca_Binaria_Recursiva;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de corredores inscritos na prova:");
        int quantidadeCorredores = scanner.nextInt();

        // Declaração da matriz para armazenar as informações dos corredores
        int[][] dadosCorredores = new int[quantidadeCorredores][3]; // [Nº de inscrição, posição de chegada, tempo de prova]

        // Preenchimento dos dados dos corredores
        for (int i = 0; i < quantidadeCorredores; i++) {
            System.out.println("Digite o número de inscrição do corredor " + (i + 1) + ":");
            dadosCorredores[i][0] = scanner.nextInt();

            System.out.println("Digite a posição de chegada do corredor " + (i + 1) + ":");
            dadosCorredores[i][1] = scanner.nextInt();

            System.out.println("Digite o tempo de prova (em segundos) do corredor " + (i + 1) + ":");
            dadosCorredores[i][2] = scanner.nextInt();
        }

        // Ordenar os dados dos corredores pelo número de inscrição
        Arrays.sort(dadosCorredores, (a, b) -> Integer.compare(a[0], b[0]));

        // Busca binária de informações de um corredor pelo número de inscrição
        System.out.println("Digite o número de inscrição do corredor para buscar suas informações:");
        int numeroInscricaoBusca = scanner.nextInt();
        int indice = buscaBinariaRecursiva(dadosCorredores, 0, dadosCorredores.length - 1, numeroInscricaoBusca);
        if (indice != -1) {
            System.out.println("Informações do corredor:");
            System.out.println("Número de inscrição: " + dadosCorredores[indice][0]);
            System.out.println("Posição de chegada: " + dadosCorredores[indice][1]);
            System.out.println("Tempo de prova (em segundos): " + dadosCorredores[indice][2]);
        } else {
            System.out.println("Corredor não encontrado.");
        }

        scanner.close();
    }

    public static int buscaBinariaRecursiva(int vetor[][], int B, int A, int K) {
        int M = (B + A) / 2;
        if (B <= A) {
            if (vetor[M][0] == K) {
                int indice = buscaBinariaRecursiva(vetor, B, M - 1, K);
                return indice != -1 ? indice : M;
            }
            if (K < vetor[M][0]) {
                return buscaBinariaRecursiva(vetor, B, M - 1, K);
            } else {
                return buscaBinariaRecursiva(vetor, M + 1, A, K);
            }
        }
        return -1; // Elemento não encontrado
    }
    
}
