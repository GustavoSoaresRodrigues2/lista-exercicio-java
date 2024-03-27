/*
    40) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, 10 elementos tipo char de um vetor e um outro elemento
    tipo char com o qual será feita uma busca linear no vetor digitado, ao longo de todos os
    seus índices, no sentido do maior índice para o menor índice. O programa deverá informar
    o valor do maior índice do vetor que contém o elemento igual ao valor digitado. Ex.:

    Índice:                 0 1 2 3 4 5 6 7 8 9
    Elementos Digitados:    c d a b k a f g a w
    Caractere Digitado: a → Resposta: O caractere a está localizado no índice 8 do vetor.
*/
package Busca_Linear_Recursiva;

import javax.swing.JOptionPane;

public class Exercicio40 {
    public static void main(String[] args) {
        int tamanho = 10;
        String vetor[] = new String[tamanho];
        String nums, indice, K;

        for (int i = 0; i < vetor.length; i++) {
            nums = JOptionPane.showInputDialog("Digite a letra Nº" + (i + 1));
            vetor[i] = nums;
        }

        K = JOptionPane.showInputDialog("Digite a letra que queira encontrar.");

        indice = busca(vetor, 0, K);

        if (!indice.equals(Integer.toString(vetor.length)))
            JOptionPane.showMessageDialog(
                null, 
                "A letra " + K + " está localizado no índice " + indice + " do vetor."
            );
        else   
            JOptionPane.showMessageDialog(
                null, 
                "A letra " + K + " não está localizado no vetor."
            );
    }

    public static String busca(String vetor[], int I, String K) {
        if ((I <= vetor.length - 1) && (!K.equals((vetor[I])))) {
            return busca(vetor, I + 1, K);
        }
        return Integer.toString(I);
    }
}
