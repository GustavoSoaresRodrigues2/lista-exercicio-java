/*
    39) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, 10 elementos tipo int de um vetor e um outro elemento tipo
    int com o qual será feita uma busca linear no vetor digitado, ao longo dos seus índices
    ímpares somente, no sentido do menor índice para o maior índice. O programa deverá
    informar o valor do menor índice do vetor que contém o elemento igual ao valor digitado.

    Ex.:
    Índice:                 0 1 2 3 4 5 6 7 8 9
    Elementos Digitados:    7 3 4 5 8 4 7 8 9 4
    Número Digitado: 4 → Resposta: O número 4 está localizado no índice 5 do vetor.
*/
package Busca_Linear_Recursiva;

import javax.swing.JOptionPane;

public class Exercicio39 {
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

        indice = busca(vetor, 0, K);

        if (indice < vetor.length)
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

    public static int busca(int vetor[], int I, int K) {
        if ((I <= vetor.length - 1) && (K != vetor[I])) {
            return busca(vetor, I + 1, K);
        }
        return I;
    }
}
