/*
    41) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, 10 elementos tipo double de um vetor e um outro elemento
    tipo double com o qual será feita uma busca linear no vetor digitado, ao longo de todos
    os seus índices, no sentido do menor índice para o maior índice. O programa deverá
    informar o valor do maior índice do vetor que contém o elemento igual ao valor digitado.

    Ex.:
    Índice:                 0 1 2 3 4 5 6 7 8 9
    Elementos Digitados:    7 3 4 5 8 4 7 4 9 8
    Número Digitado: 4 → Resposta: O número 4 está localizado no índice 7 do vetor.
*/
package Busca_Linear_Recursiva;
import javax.swing.JOptionPane;

public class Exercicio41 {
    public static void main(String[] args) {
        int tamanho = 10;
        double vetor[] = new double[tamanho];
        double nums, K;
        int indice;

        for (int i = 0; i < vetor.length; i++) {
            nums = Double.parseDouble(
                JOptionPane.showInputDialog("Digite um número " + (i + 1))
            );
            vetor[i] = nums;
        }

        K = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o numero que queira encontrar.")
        );

        indice = busca(vetor, 0, K);

        if (indice < vetor.length)
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " está localizado no índice " + indice + " do vetor."
            );
        else   
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " não está localizado no vetor."
            );
    }

    public static int busca(double vetor[], int I, double K) {
        if ((I <= vetor.length - 1) && (K != vetor[I])) {
            return busca(vetor, I + 1, K);
        }
        return I;
    }
}

