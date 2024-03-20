/*
    32) Elaborar um programa, em linguagem Java, capaz de carregar, em um vetor do tipo
    int, 15 números digitados pelo operador, formando uma espécie de base de dados. Após
    isto, o programa deverá solicitar a digitação de outro número, denominado número de
    busca, o qual será localizado no vetor anterior. O programa deverá apresentar, em tela, o
    resultado de uma busca linear, informando o índice do vetor no qual se encontra o número
    de busca (utilizar o tamanho máximo do vetor como terminador da operação, caso o
    número de busca não seja localizado). A busca linear deverá ser um método que se utilize
    de passagem de parâmetros e o vetor não deverá ser variável global do programa.
*/
package Busca_Linear;

import java.util.Scanner;

public class Exercicio32 {
    
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
        int indice = buscaLinear(vetor, numeroBusca);

        // Verificando o resultado da busca
        if (indice != -1) {
            System.out.println("O número " + numeroBusca + " foi encontrado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

    // Método para busca linear
    public static int buscaLinear(int[] vetor, int numeroBusca) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBusca) {
                return i; // Retorna o índice onde o número foi encontrado
            }
        }
        return -1; // Retorna -1 se o número não for encontrado no vetor
    }
}
