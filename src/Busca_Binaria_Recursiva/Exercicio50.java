/*
    50) Realizando através de busca binária recursiva, resolver o exercício no. 40 desta lista.
    Os dados devem estar ordenados decrescentemente, ou seja, o dado com o valor mais
    baixo deverá estar posicionado no maior índice do vetor e o dado com o valor mais alto
    deverá estar posicionado no menor índice do vetor.
*/
package Busca_Binaria_Recursiva;

import javax.swing.JOptionPane;

public class Exercicio50 {
    public static void main(String[] args) {
        int tamanho = 10;
        String vetor[] = new String[tamanho];
        String nums, K;
        int indice;

        for (int i = 0; i < vetor.length; i++) {
            nums = JOptionPane.showInputDialog("Digite a letra Nº" + (i + 1));
            vetor[i] = nums;
        }

        K = JOptionPane.showInputDialog("Digite a letra que queira encontrar.");

        indice = buscaBinariaRecursiva(vetor, 0, vetor.length-1, K);

        if (indice < vetor.length)
            JOptionPane.showMessageDialog(
                null, 
                "A letra " + K + " está localizado no índice " + indice + " do vetor."
            );
        else   
            JOptionPane.showMessageDialog(
                null, 
                "A letra " + K + " não está localizado no vetor."
            );

        ordenacaoTrocasString(vetor);
        imprimirVetor(vetor);
    }

    public static int buscaBinariaRecursiva(String vetor[], int B, int A, String K) {
        int M = (B + A) / 2;
        if (B <= A) {
            if (vetor[M].equals(K)) {
                int indice = buscaBinariaRecursiva(vetor, B, M - 1, K);
                
                return indice != -1 ? indice : M;
            }
            if (K.compareTo(vetor[M]) < 0) {
                return buscaBinariaRecursiva(vetor, B, M - 1, K);
            } else {
                return buscaBinariaRecursiva(vetor, M + 1, A, K);
            }
        }
        return -1; // Elemento não encontrado
    }

    public static void ordenacaoTrocasString(String vetor[]) {
        String temp;
    
        for (int i = 1; i < vetor.length; i++) {
            for (int j = vetor.length - 1; j >= i; j--) {
                if (vetor[j - 1].compareTo(vetor[j]) > 0) { // Compara as strings usando compareTo
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }
    
    public static void imprimirVetor(String[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
