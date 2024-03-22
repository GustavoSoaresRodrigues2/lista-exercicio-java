/*
    61) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
    conteúdo de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
    executar uma ordenação decrescente do mesmo e apresentar o vetor ordenado em tela.
    Utilizar um método de ordenação por trocas.
*/
package Ordenacao_por_Trocas;

import javax.swing.JOptionPane;

public class Exercicio61 {
    public static void main(String[] args) {
        double vetor [] = new double [20];
        JOptionPane.showMessageDialog(null, "Digite os caracteres, em ordem aleatoria:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o caractere " + (i+1)));
        }
        ordenarPorTrocas(vetor);
        
        StringBuilder vetorOrdenado = new StringBuilder("Vetor ordenado em ordem decrescente! \n");
        for (double elemento : vetor){
            vetorOrdenado.append(elemento).append(" "); 
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado.toString());
    }
    public static void ordenarPorTrocas(double[] vetor){
        int n = vetor.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++){
                if (vetor[i] < vetor[i + 1]){
                    double temp = vetor[i];
                    vetor[i] = vetor [i + 1];
                    vetor [i + 1] = temp;
                    trocou = true;
                  }
                }
            }
        while(trocou);
    }
}
