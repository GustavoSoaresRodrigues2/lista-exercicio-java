/*
    33) Elaborar um programa, em linguagem Java, capaz de carregar uma String, com 15
    caracteres, digitada, em um vetor do tipo char, com 15 posições, formando uma espécie
    de base de dados. Após isto, o programa deverá solicitar a digitação de um caractere,
    denominado caractere de busca, o qual será localizado no vetor anterior. O programa
    deverá apresentar, em tela, o resultado de uma busca linear, informando o índice do vetor
    no qual se encontra o caractere de busca (utilizar o tamanho máximo do vetor como
    terminador da operação, caso o caractere de busca não seja localizado). A busca linear
    deverá ser um método que se utilize de passagem de parâmetros e o vetor não deverá ser
    uma variável global do programa.
*/
package Busca_Linear;

import java.util.Scanner;

public class Exercicio33 {

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
        int indice = buscaLinear(vetor, caractereBusca);

        // Exibir o resultado da busca
        if (indice != -1) {
            System.out.println("O caractere " + caractereBusca + " foi encontrado no índice " + indice + ".");
        } else {
            System.out.println("O caractere " + caractereBusca + " não foi encontrado no vetor.");
        }

        scanner.close();

    }

    // Método para realizar busca linear em um vetor de char
    public static int buscaLinear(char[] vetor, char caractereBusca) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == caractereBusca) {
                return i;
            }
        }
        // Retorna -1 se o caractere não for encontrado
        return -1;
    }
}
