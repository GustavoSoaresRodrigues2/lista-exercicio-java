/*
    72) Elaborar um programa, em linguagem Java, capaz de informar quantas operações de
    inserção realizaremos no exercício no. 69 para ordenar o vetor e, através dele, concluir
    quantas são realizadas para o melhor e para o pior caso?
*/
package Ordenação_por_Insercao;
import javax.swing.JOptionPane;

public class Exercicio72{
    public static void main(String[] args) {
        char vetor[] = new char[5];
        JOptionPane.showMessageDialog(null, "Digite 5 valores em ordem aleatória!");

        for (int i = 0; i < vetor.length; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º caractere!");
            if (input.length() > 1) {
                JOptionPane.showMessageDialog(null, "Digite apenas um caractere");
                i--;
            } else {
                vetor[i] = input.charAt(0);
            }
        }
        ordenarPorInsercao(vetor);
        JOptionPane.showMessageDialog(null, "Vetor ordenado! " + new String(vetor));

        // Calcula e exibe o número de operações de inserção para o melhor e pior caso
        int melhorCaso = vetor.length;
        int piorCaso = (vetor.length * (vetor.length + 1)) / 2;
        JOptionPane.showMessageDialog(null, "Número de operações de inserção:\nMelhor caso: " + melhorCaso
                + "\nPior caso: " + piorCaso);
    }

    public static void ordenarPorInsercao(char[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            char chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }
}