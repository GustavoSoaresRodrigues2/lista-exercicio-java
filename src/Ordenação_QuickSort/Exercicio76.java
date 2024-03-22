/*
    76) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
    conteúdo de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
    executar uma ordenação decrescente do mesmo e apresentar o vetor ordenado em tela.
    Utilizar uma função de ordenação Quick-Sort.
*/
package Ordenação_QuickSort;

import javax.swing.JOptionPane;

public class Exercicio76 {
    public static void main(String[] args) {
        double vetor [] = new double [20];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        quickSort(vetor, 0, vetor.length - 1);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado em ordem decrescente! \n");
        for (double elemento : vetor){
            vetorOrdenado.append(elemento).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }
    public static void quickSort (double[] vetor, int inicio, int fim) {
        if (inicio < fim){
            int posicaoPivo = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo -1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }
    public static int particionar(double[] vetor, int inicio, int fim) {
        double pivo = vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] < pivo) {
                i++;
                double temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        double temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        return i + 1;
    }
}
