package Ordenação_MergeSort;

import javax.swing.JOptionPane;

public class Exercicio81 {
    public static void main(String[] args) {
        double vetor [] = new double [20];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        mergeSort(vetor, 0, vetor.length - 1);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado em ordem decrescente! \n");
        for (double elemento : vetor){
            vetorOrdenado.append(elemento).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }
    public static void mergeSort(double[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
    
    public static int merge(double[] vetor, int inicio, int meio, int fim) {
        int tamEsq = meio - inicio + 1;
        int tamDir = fim - meio;

        double[] vetorEsq = new double[tamEsq];
        double[] vetorDir = new double[tamDir];

        for(int i = 0; i < tamEsq; i++){
            vetorEsq[i] = vetor[inicio + i];
        }
        for(int j = 0; j < tamDir; j++){
            vetorDir[j] = vetor[meio + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = inicio;
        while(i < tamEsq && j < tamDir){
            if(vetorEsq[i] <= vetorDir[j]){
                vetor[k] = vetorEsq[i];
                i++;
            }else{
                vetor[k] =vetorDir[j];
                j++;
            }
            k++;
        }
        while(i < tamEsq){
            vetor[k] = vetorEsq[i];
            i++;
            k++;
        }
        while(j < tamDir){
            vetor[k] = vetorDir[j];
            j++;
            k++;
        }
        return k;
    }
}
