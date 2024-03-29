/*
    68) Elaborar um programa, em linguagem Java, capaz de realizar a busca de um
    determinado caractere, digitado, em um vetor qualquer de tamanho 10, também com seus
    elementos do tipo char digitados, informando qual o índice do vetor que esse caractere se
    localiza. Utilizar ordenação do tipo seleção e busca binária recursiva.
*/
package Ordenacao_por_Selecao;
import javax.swing.JOptionPane;

public class Exercicio68 {
    
    public static void main(String[] args) {
        int tamanho = 10;
        int vetor[] = new int[tamanho];

        int num, K, indice;

        for (int i = 0; i < vetor.length; i++) {
            num = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número " + (i + 1))
            );
            vetor[i] = num;
        }

        K = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o numero que queira encontrar.")
        );

        ordenarPorSelecao(vetor);

        indice = buscaBinariaRecursiva(vetor, 0, vetor.length - 1, K);

        if (indice >= 0)
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

    public static void ordenarPorSelecao(int[] vetor){
        for (int i = 0; i < vetor.length - 1; i++){
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++){
                
                if(vetor[j] < vetor[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if (indiceMenor !=1 ){
                int temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor]=temp;
            }
        }
    }
    

    public static int buscaBinariaRecursiva(int vetor[], int B, int A, int K) {
        int M = (B + A) / 2;
        if (B <= A) {
            if (vetor[M] == K) {
                int indice = buscaBinariaRecursiva(vetor, B, M - 1, K);
                
                return indice != -1 ? indice : M;
            }
            if (K < vetor[M]) {
                return buscaBinariaRecursiva(vetor, B, M - 1, K);
            } else {
                return buscaBinariaRecursiva(vetor, M + 1, A, K);
            }
        }
        return -1; // Elemento não encontrado
    }
}

