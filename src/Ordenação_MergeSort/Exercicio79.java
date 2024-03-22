package Ordenação_MergeSort;
import javax.swing.JOptionPane;

public class Exercicio79 {
    public static void main(String[] args) {
        char vetor [] = new char [5];

        JOptionPane.showMessageDialog(null, "Digite 5 caracteres em ordem aleatoria");
        for (int i = 0; i < vetor.length; i++){
            String input = JOptionPane.showInputDialog("Digite o caracter " + (i+1));
            if (input.length() > 1 ){
                JOptionPane.showMessageDialog(null, "Digite apenas um caractere, por favor!");
                i--;
            }
            else{
                vetor[i] = input.charAt(0);
            }
        }

        mergeSort(vetor, 0, vetor.length - 1);
        StringBuilder output = new StringBuilder("Vetor ordenado em ordem crescente:\n");
        for (char elemento : vetor) {
            output.append(elemento).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
    
    public static void mergeSort(char[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);

        }
    }
    
    public static int merge(char[] vetor, int inicio, int meio, int fim) {
        int tamEsq = meio - inicio + 1;
        int tamDir = fim - meio;

        char[] vetorEsq = new char[tamEsq];
        char[] vetorDir = new char[tamDir];

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
                vetor[k] = vetorEsq[j];
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
