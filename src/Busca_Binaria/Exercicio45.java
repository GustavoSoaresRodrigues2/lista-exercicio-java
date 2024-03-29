/*
    45) Realizando através de busca binária iterativa, resolver o exercício no. 33 desta lista.
*/
package Busca_Binaria;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Carregar a String em um vetor de char
        char[] vetor = new char[15];
        System.out.println("Digite uma string de 15 caracteres:");
        String inputString = scanner.nextLine();

        // Verificar se a string digitada possui 15 caracteres
        if (inputString.length() != 15) {
            System.out.println("A string digitada não possui 15 caracteres. Por favor, tente novamente.");
            return;
        }

        // Preencher o vetor com os caracteres da string
        for (int i = 0; i < 15; i++) {
            vetor[i] = inputString.charAt(i);
        }

        // Solicitar o caractere de busca
        System.out.println("Digite o caractere que deseja buscar:");
        char caractereBusca = scanner.next().charAt(0);

        // Realizar a busca linear
        int indice = buscaBinaria(vetor, caractereBusca);

        // Exibir o resultado da busca
        if (indice != -1) {
            System.out.println("O caractere " + caractereBusca + " foi encontrado no índice " + indice + ".");
        } else {
            System.out.println("O caractere " + caractereBusca + " não foi encontrado no vetor.");
        }

        scanner.close();

    }

    // Método para realizar busca linear em um vetor de char
    public static int buscaBinaria(char[] vetor, int K) {
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
