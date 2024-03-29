/*
    46) Realizando através de busca binária iterativa, resolver o exercício no. 34 desta lista.
*/
package Busca_Binaria;

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite a string
        System.out.print("Digite uma string com no máximo 15 caracteres: ");
        String input = scanner.nextLine();

        // Verificar se a string tem mais que 15 caracteres
        if (input.length() > 15) {
            System.out.println("A string excede o limite de 15 caracteres.");
            return;
        }

        // Transformar a string em um vetor de char
        char[] vetor = input.toCharArray();

        // Solicitar ao usuário que digite o caractere de busca
        System.out.print("Digite o caractere de busca: ");
        char busca = scanner.next().charAt(0);

        // Realizar a busca linear
        int resultado = buscaBinaria(vetor, busca);

        // Apresentar o resultado
        if (resultado == -1) {
            System.out.println("O caractere de busca não foi encontrado.");
        } else {
            System.out.println("O caractere de busca foi encontrado no índice: " + resultado);
        }

        scanner.close();
    }

    // Método para busca linear
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
