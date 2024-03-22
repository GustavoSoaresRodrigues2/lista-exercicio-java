/*
    70) Elaborar um programa, em linguagem Java, capaz de receber, via teclado e em ordem
    aleatória, o conteúdo de cada um dos elementos de um vetor do tipo int, de tamanho
    variável, também digitado, executar a ordenação crescente do mesmo e apresentar o vetor
    ordenado em tela. Utilizar um método de ordenação por inserção.
*/
package Ordenação_por_Insercao;

import javax.swing.JOptionPane;

public class Exercicio70 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: ")); 
        
        int vetor [] = new int [n];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        ordenarPorInsercao(vetor);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado! \n");
        for (int i = 0; i < n; i++){
            vetorOrdenado.append(vetor[i]).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }
    public static void ordenarPorInsercao(int[] vetor){
        for (int i = 1; i < vetor.length; i++){
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }
}
