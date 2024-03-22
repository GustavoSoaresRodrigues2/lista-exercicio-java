/*
    71) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
    conteúdo de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
    executar uma ordenação decrescente do mesmo e apresentar o vetor ordenado em tela.
    Utilizar um método de ordenação por inserção.
*/
package Ordenação_por_Insercao;

import javax.swing.JOptionPane;

public class Exercicio71 {
    public static void main(String[] args) {
        double vetor [] = new double [20];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        ordenarPorInsercao(vetor);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado em ordem decrescente! \n");
        for (double elemento : vetor){
            vetorOrdenado.append(elemento).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }
    public static void ordenarPorInsercao(double[] vetor){
        for (int i = 1; i < vetor.length; i++){
            double chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }
}
