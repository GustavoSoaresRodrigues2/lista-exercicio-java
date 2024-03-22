/*
    75) Elaborar um programa, em linguagem Java, capaz de receber, via teclado e em ordem
    aleatória, o conteúdo de cada um dos elementos de um vetor do tipo int, de tamanho
    variável, também digitado, executar a ordenação crescente do mesmo e apresentar o vetor
    ordenado em tela. Utilizar um método de ordenação Quick-Sort.
*/
package Ordenação_QuickSort;

import javax.swing.JOptionPane;

public class Exercicio75 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: ")); 
        
        int vetor [] = new int [n];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }

        quickSort (vetor, 0, vetor.length - 1);
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado! \n");
        for (int elemento : vetor){
            vetorOrdenado.append(elemento).append(" ");
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }

    public static void quickSort (int[] vetor, int inicio, int fim) {
        if (inicio < fim){
            int posicaoPivo = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo -1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }
    public static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] < pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        return i + 1;
    }
}
