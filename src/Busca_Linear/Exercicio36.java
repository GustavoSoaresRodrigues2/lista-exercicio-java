/*
    36) Elaborar um programa, em linguagem Java, que receba, via digitação, a quantidade
    de alunos matriculados em uma universidade e apresente um menu contendo 3
    possibilidades de escolha para o operador, realizando as respectivas funções:

    A) Cadastrar RA de todos os alunos matriculados. (Utilizar um vetor do tipo int
    para o RA, ocupando os mesmos índices do respectivo vetor de NOTA);

    B) Cadastrar NOTA de prova para todos os alunos matriculados. (Utilizar um
    vetor do tipo double para a NOTA, ocupando os mesmos índices do respectivo
    vetor de RA);

    C) Realizar a busca linear e apresentar a NOTA para um determinado RA, a ser
    digitado;

    D) Sair do programa.
*/
package Busca_Linear;

import java.util.Scanner;

public class Exercicio36 {
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
        boolean encontrado = false;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (raAlunos[i] == raBusca) {
                System.out.println("Nota do aluno com RA " + raBusca + ": " + notasAlunos[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("RA não encontrado.");
        }
    }
}
