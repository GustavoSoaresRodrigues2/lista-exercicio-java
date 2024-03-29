/*
    58) Realizando através de busca binária recursiva, resolver o exercício no. 48 desta lista.
*/
package Busca_Binaria_Recursiva;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio58 {
    public static int[] raAlunos;
    public static double[] notasAlunos;
    public static int quantidadeAlunos;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bem-vindo ao sistema da universidade!");

        System.out.print("Digite a quantidade de alunos matriculados: ");
        quantidadeAlunos = scanner.nextInt();
        raAlunos = new int[quantidadeAlunos];
        notasAlunos = new double[quantidadeAlunos];

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarRA();
                    break;
                case 2:
                    cadastrarNotas();
                    break;
                case 3:
                    buscarNotaPorRA();
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1) Cadastrar RA dos alunos");
        System.out.println("2) Cadastrar notas dos alunos");
        System.out.println("3) Buscar nota por RA");
        System.out.println("4) Sair do programa");
        System.out.print("Opção: ");
    }

    private static void cadastrarRA() {
        System.out.println("\nDigite o RA de cada aluno:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("RA do aluno " + (i + 1) + ": ");
            raAlunos[i] = scanner.nextInt();
        }
        Arrays.sort(raAlunos); // Ordena os RAs após o cadastro
        System.out.println("RA cadastrado com sucesso.");
    }

    private static void cadastrarNotas() {
        System.out.println("\nDigite a nota de cada aluno:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notasAlunos[i] = scanner.nextDouble();
        }
        System.out.println("Notas cadastradas com sucesso.");
    }

    private static void buscarNotaPorRA() {
        System.out.print("\nDigite o RA do aluno que deseja buscar: ");
        int raBusca = scanner.nextInt();
        int indice = buscaBinariaRecursiva(raAlunos, 0, raAlunos.length -1, raBusca);
        if (indice != -1) {
            System.out.println("Nota do aluno com RA " + raBusca + ": " + notasAlunos[indice]);
        } else {
            System.out.println("RA não encontrado.");
        }
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
