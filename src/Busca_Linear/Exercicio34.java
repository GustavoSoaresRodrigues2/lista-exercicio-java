/*
    34) Elaborar um programa, em linguagem Java, capaz de carregar uma String, digitada
    em um vetor do tipo char, com no máximo 15 posições, formando uma espécie de base
    de dados. Após isto, o programa deverá solicitar a digitação de um caractere, denominado
    caractere de busca, o qual será localizado no vetor anterior. O programa deverá
    apresentar, em tela, o resultado de uma busca linear, informando o índice do vetor no qual
    se encontra o caractere de busca (utilizar o tamanho máximo do vetor ou o tamanho
    máximo da String digitada como terminadores da operação, caso o caractere de busca não
    seja localizado). A busca linear deverá ser um método que se utilize de passagem de
    parâmetros e o vetor não deverá ser uma variável global do programa.
*/
package Busca_Linear;

import java.util.Scanner;

public class Exercicio34 {

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
        int resultado = buscaLinear(vetor, busca);

        // Apresentar o resultado
        if (resultado == -1) {
            System.out.println("O caractere de busca não foi encontrado.");
        } else {
            System.out.println("O caractere de busca foi encontrado no índice: " + resultado);
        }

        scanner.close();
    }

    // Método para busca linear
    public static int buscaLinear(char[] vetor, char busca) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                return i; // Retorna o índice onde o caractere foi encontrado
            }
        }
        return -1; // Retorna -1 se o caractere não for encontrado
    }
}
