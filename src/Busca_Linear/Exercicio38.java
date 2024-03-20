/*
    38) Elaborar um programa, em linguagem Java, que utilize apenas métodos iterativos,
    capaz de receber, via teclado, 10 elementos tipo double de um vetor e um outro elemento
    tipo double com o qual será feita uma busca linear no vetor digitado, ao longo de todos
    os seus índices, no sentido do menor índice para o maior índice. O programa deverá
    informar o valor do maior índice do vetor que contém o elemento igual ao valor digitado.

    Ex.:
    Índice:                 0 1 2 3 4 5 6 7 8 9
    Elementos Digitados:    7 3 4 5 8 4 7 4 9 8
    Número Digitado: 4 → Resposta: O número 4 está localizado no índice 7 do vetor.
*/
package Busca_Linear;

import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];
        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Digite o elemento a ser buscado:");
        double elementoBuscado = scanner.nextDouble();

        int indice = buscarElemento(vetor, elementoBuscado);
        if (indice != -1) {
            System.out.println("O número " + elementoBuscado + " está localizado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O número " + elementoBuscado + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

    public static int buscarElemento(double[] vetor, double elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado no vetor
    }
}
