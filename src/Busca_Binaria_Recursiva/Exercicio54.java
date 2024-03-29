/*
    54) Realizando através de busca binária recursiva, resolver o exercício no. 44 desta lista.
*/
package Busca_Binaria_Recursiva;
import java.util.Scanner;

public class Exercicio54 {
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
        int indice = buscaBinariaRecursiva(vetor, 0, vetor.length, numeroBusca);

        // Verificando o resultado da busca
        if (indice != -1) {
            System.out.println("O número " + numeroBusca + " foi encontrado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

    public static int buscaBinariaRecursiva(int vetor[], int B, int A, int K) {
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
