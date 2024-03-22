/*
    65) Elaborar um programa, em linguagem Java, capaz de receber, via teclado e em ordem
    aleatória, o conteúdo de cada um dos elementos de um vetor do tipo int, de tamanho
    variável, também digitado, executar a ordenação crescente do mesmo e apresentar o vetor
    ordenado em tela. Utilizar um método de ordenação por seleção.
*/
package Ordenacao_por_Selecao;

import javax.swing.JOptionPane;

public class Exercicio65 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: ")); 
        
        int vetor [] = new int [n];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        ordenarPorSelecao(vetor);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado! \n");
        for (int i = 0; i < n; i++){
            vetorOrdenado.append(vetor[i]).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
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
}
