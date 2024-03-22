/*
    69) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
    conteúdo de cada elemento de um vetor do tipo char, de tamanho 5, via teclado, executar
    uma ordenação crescente do mesmo e apresentar o vetor ordenado em tela. Utilizar um
    método de ordenação por inserção.
*/
package Ordenação_por_Insercao;

import javax.swing.JOptionPane;

public class Exercicio69 {
    public static void main(String[] args) {
            char vetor [] = new char [5];
            JOptionPane.showMessageDialog(null, "Digite 5 valores em ordem aleatória!");
    
            for(int i = 0; i < vetor.length; i++){
                String input = JOptionPane.showInputDialog("Digite o "  + (i+1) + "º caractere!");
                if (input.length() > 1){
                    JOptionPane.showMessageDialog(null, "Digite apenas um caractere");
                    i--;
                }else{
                    vetor[i] = input.charAt(0);
                }
            }
            ordenarPorInsercao(vetor);
            JOptionPane.showMessageDialog(null, "Vetor ordenado! " + new String(vetor));
        }
    
        public static void ordenarPorInsercao(char[] vetor){
            for (int i = 1; i < vetor.length ; i++){
                char chave = vetor[i];
                int j = i - 1;
                while (j >= 0 && vetor[j] > chave){
                    vetor[j+1] = vetor [j];
                    j--;
                }
                vetor[j+1]= chave;
            }
        }
}
