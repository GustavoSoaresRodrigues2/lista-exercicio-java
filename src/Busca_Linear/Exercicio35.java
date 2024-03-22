/*
    35) Elaborar um programa, em linguagem Java, capaz de controlar os dados de uma
    prova de atletismo, onde, via matriz, possamos armazenar, através de digitação, a
    quantidade de corredores inscritos na prova, o número de inscrição de cada um, sua
    posição de chegada e seu respectivo tempo de prova, conforme os mesmos forem
    passando pela linha de chegada. Os atletas inscritos que não ultrapassarem a linha de
    chegada deverão ter cadastrados 0 (zero) para a posição de chegada e tempo de prova. Ao
    término da digitação, o programa deverá realizar a busca da posição de chegada e do
    tempo de prova, para um determinado corredor, dada a digitação de seu número de
    inscrição. Utilizar matriz para armazenamento das informações, porém não sendo globais.
    O número de inscrição deve ser variável do tipo int. O tempo de prova deve ser em
    segundos e armazenado em variável do tipo int.
*/
package Busca_Linear;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de corredores inscritos na prova:");
        int quantidadeCorredores = scanner.nextInt();

        // Declaração da matriz para armazenar as informações dos corredores
        int[][] dadosCorredores = new int[quantidadeCorredores][3]; // [Nº de inscrição, posição de chegada, tempo de prova]

        // Preenchimento dos dados dos corredores
        for (int i = 0; i < quantidadeCorredores; i++) {
            System.out.println("Digite o número de inscrição do corredor " + (i + 1) + ":");
            dadosCorredores[i][0] = scanner.nextInt();

            System.out.println("Digite a posição de chegada do corredor " + (i + 1) + ":");
            dadosCorredores[i][1] = scanner.nextInt();

            System.out.println("Digite o tempo de prova (em segundos) do corredor " + (i + 1) + ":");
            dadosCorredores[i][2] = scanner.nextInt();
        }

        // Busca de informações de um corredor pelo número de inscrição
        System.out.println("Digite o número de inscrição do corredor para buscar suas informações:");
        int numeroInscricaoBusca = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < quantidadeCorredores; i++) {
            if (dadosCorredores[i][0] == numeroInscricaoBusca) {
                encontrado = true;
                System.out.println("Informações do corredor:");
                System.out.println("Número de inscrição: " + dadosCorredores[i][0]);
                System.out.println("Posição de chegada: " + dadosCorredores[i][1]);
                System.out.println("Tempo de prova (em segundos): " + dadosCorredores[i][2]);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Corredor não encontrado.");
        }

        scanner.close();
    }
}
