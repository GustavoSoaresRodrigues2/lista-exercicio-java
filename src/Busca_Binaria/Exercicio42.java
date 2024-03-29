/*
    42) Elaborar um programa, em linguagem Java, capaz de receber 10 elementos diferentes
    do tipo char, em ordem crescente, armazená-los em um vetor do mesmo tipo e tamanho,
    no sentido do menor para o maior índice. O programa deverá pedir ao operador para que
    digite mais um caractere, o qual será localizado no determinado vetor. O programa
    apresentará em tela o resultado de uma busca binária por todos os índices, do menor para
    o maior, informando ao operador o número do índice do vetor no qual se encontra o
    caractere digitado, ou, se for o caso, que o caractere não se encontra no vetor (utilizar o
    tamanho máximo do vetor como terminador da busca no vetor). Utilizar um método
    iterativo de busca binária construído com passagem de parâmetros.
*/
package Busca_Binaria;

import javax.swing.JOptionPane;

public class Exercicio42 {

    public static void main(String[] args) {
        int tamanhoVetor = 10;
        char[] vetor = new char[tamanhoVetor];

        int num, indice, K;

        for (int i = 0; i < vetor.length; i++) {
            num = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número.")  
            );
            vetor[i] = (char) num;
        }

        K = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o número que queira encontrar.")  
        );

        ordenacaoTrocasINT(vetor);

        indice = buscaBinaria(vetor, K);

        if (indice >= 0)
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " está localizado no índice " + indice + " do vetor", 
                "Número localizado", 
                1
            );
        else
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " não está localizado no vetor", 
                "Número localizado", 
                1
            );
    }

    public static int buscaBinaria(char vetor[], int K) {
        int B, A, M;

        B = 0;
        A = vetor.length - 1;

        while (B <= A) {
            M = (B + A) / 2;

            if (K < vetor[M]) A = M - 1;
            else if (K > vetor[M]) B = M + 1;
            else return M;
        }

        return -1;
    }

    public static void ordenacaoTrocasINT(char vetor[]) {
        int A, B, T;

        for (A = 1; A < vetor.length; A++) {
            for (B = vetor.length - 1; B >= A; B--) {
                if (vetor[B - 1] > vetor[B]) {
                    T = vetor[B - 1];
                    vetor[B - 1] = vetor[B];
                    vetor[B] = (char) T;
                }
            }
        }
    }
}
