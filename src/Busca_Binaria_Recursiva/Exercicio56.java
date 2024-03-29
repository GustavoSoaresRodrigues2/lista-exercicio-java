/*
    56) Realizando através de busca binária recursiva, resolver o exercício no. 46 desta lista.
*/
package Busca_Binaria_Recursiva;
import java.util.Scanner;

public class Exercicio56 {
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
        int resultado = buscaBinariaRecursiva(vetor, 0, vetor.length - 1, busca);

        // Apresentar o resultado
        if (resultado == -1) {
            System.out.println("O caractere de busca não foi encontrado.");
        } else {
            System.out.println("O caractere de busca foi encontrado no índice: " + resultado);
        }

        scanner.close();
    }

    // Método para busca linear
    public static int buscaBinariaRecursiva(char vetor[], int B, int A, int K) {
        int M = (B + A) / 2;
        if (B <= A) {
            if (vetor[M] == K) {
                int indice = buscaBinariaRecursiva(vetor, B, M - 1, K);
                
                return indice != -1 ? indice : M;
            }
            if (K < vetor[M]) {
                return buscaBinariaRecursiva(vetor, B, M - 1, K);
            } else {
                return buscaBinariaRecursiva(vetor, M + 1, A, K);
            }
        }
        return -1; // Elemento não encontrado
    }
}
