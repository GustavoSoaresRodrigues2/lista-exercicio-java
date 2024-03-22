/*
    60) Elaborar um programa, em linguagem Java, capaz de receber, via teclado e em ordem
    aleatória, o conteúdo de cada um dos elementos de um vetor do tipo int, de tamanho
    variável, também digitado, executar a ordenação crescente do mesmo e apresentar o vetor
    ordenado em tela. Utilizar um método de ordenação por trocas.
*/
package Ordenacao_por_Trocas;

import javax.swing.JOptionPane;

public class Exercicio60 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: ")); 
        
        int vetor [] = new int [n];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        ordenarPorTrocas(vetor);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado! \n");
        for (int i = 0; i < n; i++){
            vetorOrdenado.append(vetor[i]).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }
    public static void ordenarPorTrocas(int[] vetor){
        int n = vetor.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++){
                if (vetor[i] > vetor[i + 1]){
                    int temp = vetor[i];
                    vetor[i] = vetor [i + 1];
                    vetor [i + 1] = temp;
                    trocou = true;
                  }
                }
            }
        while(trocou);
    }
}
