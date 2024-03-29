/*
    49) Elaborar um programa, em linguagem Java, capaz de receber, via teclado, 10
    elementos tipo int de um vetor e um outro elemento tipo int com o qual será feita uma
    busca binária recursiva no vetor digitado, ao longo de todos os seus índices e no sentido
    do menor para o maior índice. O programa deverá informar o valor do menor índice do
    vetor que contém o elemento igual ao valor digitado. Ex.:

    Índice:                 0 1 2 3 4 5 6 7 8 9
    Elementos Digitados:    7 3 4 5 8 4 7 8 9 4
    Número Digitado: 4 → Resposta: O número 4 está localizado no índice 2 do vetor.
*/
package Busca_Binaria_Recursiva;

import javax.swing.JOptionPane;

public class Exercicio49 {

    public static void main(String[] args) {
        int tamanho = 10;
        int vetor[] = new int[tamanho];

        int indice, K;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número " + (i + 1))
            );
        }

        K = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o numero que queira encontrar.")
        );

        indice = buscaBinariaRecursiva(vetor, 0, vetor.length - 1, K);

        if (indice >= 0)
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " está localizado no índice " + indice + " do vetor."
            );
        else   
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " não está localizado no vetor."
            );
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
