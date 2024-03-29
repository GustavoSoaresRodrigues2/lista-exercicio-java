package Ordenação_MergeSort;

import javax.swing.JOptionPane;

public class Exercicio82 {
    static class Counter {
        int count = 0;
    }

    public static void main(String[] args) {
        char vetor[] = new char[5];

        JOptionPane.showMessageDialog(null, "Digite 5 caracteres em ordem aleatoria");
        for (int i = 0; i < vetor.length; i++) {
            String input = JOptionPane.showInputDialog("Digite o caracter " + (i + 1));
            if (input.length() > 1) {
                JOptionPane.showMessageDialog(null, "Digite apenas um caractere, por favor!");
                i--;
            } else {
                vetor[i] = input.charAt(0);
            }
        }

        Counter mergeCount = new Counter();
        mergeSort(vetor, 0, vetor.length - 1, mergeCount);
        StringBuilder output = new StringBuilder("Vetor ordenado em ordem crescente:\n");
        for (char elemento : vetor) {
            output.append(elemento).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString() + "\nNúmero de operações de Merge-Sort: " + mergeCount.count);
    }

    public static void mergeSort(char[] vetor, int inicio, int fim, Counter mergeCount) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio, mergeCount);
            mergeSort(vetor, meio + 1, fim, mergeCount);
            merge(vetor, inicio, meio, fim, mergeCount);
        }
    }

    public static void merge(char[] vetor, int inicio, int meio, int fim, Counter mergeCount) {
        int tamEsq = meio - inicio + 1;
        int tamDir = fim - meio;

        char[] vetorEsq = new char[tamEsq];
        char[] vetorDir = new char[tamDir];

        for (int i = 0; i < tamEsq; i++) {
            vetorEsq[i] = vetor[inicio + i];
        }
        for (int j = 0; j < tamDir; j++) {
            vetorDir[j] = vetor[meio + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = inicio;
        while (i < tamEsq && j < tamDir) {
            mergeCount.count++; // Incrementa o contador em cada comparação
            if (vetorEsq[i] <= vetorDir[j]) {
                vetor[k] = vetorEsq[i];
                i++;
            } else {
                vetor[k] = vetorDir[j];
                j++;
            }
            k++;
        }
        while (i < tamEsq) {
            vetor[k] = vetorEsq[i];
            i++;
            k++;
        }
        while (j < tamDir) {
            vetor[k] = vetorDir[j];
            j++;
            k++;
        }
    }
}