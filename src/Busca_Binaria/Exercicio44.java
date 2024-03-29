/*
    44) Realizando através de busca binária iterativa, resolver o exercício no. 32 desta lista.
*/
package Busca_Binaria;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando vetor para armazenar os números
        int[] vetor = new int[15];

        // Pedindo ao usuário para digitar os números
        System.out.println("Digite 15 números:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Pedindo ao usuário para digitar o número de busca
        System.out.print("Digite o número que deseja buscar: ");
        int numeroBusca = scanner.nextInt();

        // Chamando o método de busca linear
        int indice = buscaBinaria(vetor, numeroBusca);

        // Verificando o resultado da busca
        if (indice != -1) {
            System.out.println("O número " + numeroBusca + " foi encontrado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

    public static int buscaBinaria(int[] vetor, int K) {
        int B, A, M;

        B = 0;
        A = vetor.length - 1;

        while (B <= A) {
            M = (B + A) / 2;

            if (K < vetor[M]) A = M - 1;
            else if (K > vetor[M]) B = M + 1;
            else return M;
        }

        return -1;
    }
}
