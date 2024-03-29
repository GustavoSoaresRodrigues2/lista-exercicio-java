/*
    48) Realizando através de busca binária iterativa, resolver o exercício no. 36 desta lista.
*/
package Busca_Binaria;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio48 {
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
        int indice = buscaBinaria(raAlunos, raBusca);
        if (indice != -1) {
            System.out.println("Nota do aluno com RA " + raBusca + ": " + notasAlunos[indice]);
        } else {
            System.out.println("RA não encontrado.");
        }
    }

    public static int buscaBinaria(int[] array, int chave) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int valorMeio = array[meio];

            if (valorMeio == chave) {
                return meio; // Chave encontrada, retorna o índice
            } else if (valorMeio < chave) {
                inicio = meio + 1; // Busca na metade direita do array
            } else {
                fim = meio - 1; // Busca na metade esquerda do array
            }
        }

        return -1; // Chave não encontrada
    }
}
