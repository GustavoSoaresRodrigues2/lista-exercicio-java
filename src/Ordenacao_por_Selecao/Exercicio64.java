/*
    64) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
    conteúdo de cada elemento de um vetor do tipo char, de tamanho 5, via teclado, executar
    uma ordenação crescente do mesmo e apresentar o vetor ordenado em tela. Utilizar um
    método de ordenação por seleção.
*/
package Ordenacao_por_Selecao;

import javax.swing.JOptionPane;

public class Exercicio64 {
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
        ordenarPorSelecao(vetor);
        JOptionPane.showMessageDialog(null, "Vetor ordenado! " + new String(vetor));
    }

    public static void ordenarPorSelecao(char[] vetor){
        for (int i = 0; i < vetor.length - 1; i++){
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if (indiceMenor !=1 ){
                char temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor]=temp;
            }
        }
    }
}
