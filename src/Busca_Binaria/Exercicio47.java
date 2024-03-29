/*
    47) Realizando através de busca binária iterativa, resolver o exercício no. 35 desta lista.
*/
package Busca_Binaria;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio47 {

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
        int indice = buscaBinaria(dadosCorredores, numeroInscricaoBusca);
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

    public static int buscaBinaria(int[][] dadosCorredores, int numeroInscricaoBusca) {
        int B, A, M;

        B = 0;
        A = dadosCorredores.length - 1;

        while (B <= A) {
            M = (B + A) / 2;
            int numeroInscricaoMeio = dadosCorredores[M][0];

            if (numeroInscricaoMeio < numeroInscricaoBusca) A = M - 1;
            else if (numeroInscricaoMeio > numeroInscricaoBusca) B = M + 1;
            else return M;
        }

        return -1;
    }
}
