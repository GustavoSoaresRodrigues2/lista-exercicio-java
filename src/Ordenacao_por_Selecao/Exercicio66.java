/*
    66) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
    conteúdo de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
    executar uma ordenação decrescente do mesmo e apresentar o vetor ordenado em tela.
    Utilizar um método de ordenação por seleção.
*/  
package Ordenacao_por_Selecao;

import javax.swing.JOptionPane;

public class Exercicio66 {
    public static void main(String[] args) {
        double vetor [] = new double [20];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        ordenarPorSelecao(vetor);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado em ordem decrescente! \n");
        for (double elemento : vetor){
            vetorOrdenado.append(elemento).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }
    public static void ordenarPorSelecao(double[] vetor){
        for (int i = 0; i < vetor.length - 1; i++){
            int indiceMaior = i;
            for (int j = i + 1; j < vetor.length; j++){
                if(vetor[j] > vetor[indiceMaior]){
                    indiceMaior = j;
                }
            }
            if (indiceMaior !=1 ){
                double temp = vetor[i];
                vetor[i] = vetor[indiceMaior];
                vetor[indiceMaior]=temp;
            }
        }
    }
}
