/*
    59) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
    conteúdo de cada elemento de um vetor do tipo char, de tamanho 5, via teclado, executar
    uma ordenação crescente no mesmo e apresentar o vetor ordenado em tela. Utilizar um
    método de ordenação por trocas.
*/
package Ordenacao_por_Trocas;

import javax.swing.JOptionPane;

public class Exercicio59 {
    public static void main(String[] args) {
        char vetor [] = new char [5];

        JOptionPane.showMessageDialog(null, "Digite 5 caracteres em ordem aleatoria");
        for (int i = 0; i < vetor.length; i++){
            String input = JOptionPane.showInputDialog("Digite o caracter" + (i+1));
            if (input.length() > 1 ){
                JOptionPane.showMessageDialog(null, "Digite apenas um caractere, por favor!");
                i--;
            }
            else{
                vetor[i] = input.charAt(0);
            }
        }

        ordenarPorTrocas(vetor);
        StringBuilder output = new StringBuilder("Vetor Ordenado!\n");
        for (char c : vetor){
            output.append(c).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
    public static void ordenarPorTrocas(char[] vetor){
        int n = vetor.length;
        boolean trocou;
        do{
            trocou = false;
            for(int i = 0; i < n - 1; i++){
                if(vetor[i] > vetor[i+1]){
                    char temp = vetor[i];
                    vetor[i] = vetor [i+1];
                    vetor [i+1] = temp;
                    trocou = true;
                }
            }
        }
        while(trocou);
    }
}
