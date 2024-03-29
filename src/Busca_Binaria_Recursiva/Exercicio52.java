/*
    52) Realizando através de busca binária recursiva, resolver o exercício no. 42 desta lista.
*/
package Busca_Binaria_Recursiva;
import javax.swing.JOptionPane;

public class Exercicio52 {

    public static void main(String[] args) {
        int tamanhoVetor = 10;
        char[] vetor = new char[tamanhoVetor];

        int num, indice, K;

        for (int i = 0; i < vetor.length; i++) {
            num = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número.")  
            );
            vetor[i] = (char) num;
        }

        K = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o número que queira encontrar.")  
        );

        ordenacaoTrocasINT(vetor);

        indice = buscaBinariaRecursiva(vetor, 0, vetor.length - 1 , K);

        if (indice >= 0)
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " está localizado no índice " + indice + " do vetor", 
                "Número localizado", 
                1
            );
        else
            JOptionPane.showMessageDialog(
                null, 
                "O número " + K + " não está localizado no vetor", 
                "Número localizado", 
                1
            );
    }

    public static int buscaBinariaRecursiva(char vetor[], int B, int A, int K) {
        int M = (B + A) / 2;
        if (B <= A) {
            if (vetor[M] == K) {
                int indice = buscaBinariaRecursiva(vetor, B, M - 1, K);
                
                return indice != -1 ? indice : M;
            }
            if (K < vetor[M]) {
                return buscaBinariaRecursiva(vetor, B, M - 1, K);
            } else {
                return buscaBinariaRecursiva(vetor, M + 1, A, K);
            }
        }
        return -1; // Elemento não encontrado
    }

    public static void ordenacaoTrocasINT(char vetor[]) {
        int A, B, T;

        for (A = 1; A < vetor.length; A++) {
            for (B = vetor.length - 1; B >= A; B--) {
                if (vetor[B - 1] > vetor[B]) {
                    T = vetor[B - 1];
                    vetor[B - 1] = vetor[B];
                    vetor[B] = (char) T;
                }
            }
        }
    }
}