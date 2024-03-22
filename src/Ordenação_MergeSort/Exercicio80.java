package Ordenação_MergeSort;
import javax.swing.JOptionPane;

public class Exercicio80 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: ")); 
        
        int vetor [] = new int [n];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        mergeSort(vetor, 0, n - 1);
        StringBuilder output = new StringBuilder("Vetor ordenado em ordem crescente:\n");
        for (int elemento : vetor) {
            output.append(elemento).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
    
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
    
    public static int merge(int[] vetor, int inicio, int meio, int fim) {
        int tamEsq = meio - inicio + 1;
        int tamDir = fim - meio;

        int[] vetorEsq = new int[tamEsq];
        int[] vetorDir = new int[tamDir];

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
