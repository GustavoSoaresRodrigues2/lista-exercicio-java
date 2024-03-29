/*
    53) Realizando através de busca binária recursiva, resolver o exercício no. 43 desta lista.
*/
package Busca_Binaria_Recursiva;
import javax.swing.JOptionPane;

public class Exercicio53 {

    public static void main(String[] args) {
        int tamanhoVetor = 10;
        char[] vetor = new char[tamanhoVetor];

        int num, K;

        for (int i = 0; i < vetor.length; i++) {
            num = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número.")  
            );
            vetor[i] = (char) num;
        }

        K = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o número que queira encontrar.")  
        );

        imprimirVetor(vetor);

        int tentativasLinear = buscaLinear(vetor, K);

        ordenacaoTrocasINT(vetor);

        int tentativasBinaria  = buscaBinariaRecursiva(vetor, 0, vetor.length-1, K);

        String mensagem = "Comparativo entre Busca Linear e Busca Binária:\n" +
                          "----------------------------------------------\n" +
                          "Busca Linear: " + tentativasLinear + " tentativas\n" +
                          "Busca Binária: " + tentativasBinaria + " tentativas\n\n" +
                          "Recomendações:\n" +
                          "----------------------------------------------\n";
        
        if (tentativasLinear <= tentativasBinaria) {
            mensagem += "Para vetores pequenos ou não ordenados, utilize a busca linear é altamente recomendada..\n" +
                        "Para vetores grandes e ordenados, utilize a busca binária recursiva.";
        } else {
            mensagem += "Para vetores pequenos ou não ordenados, utilize a busca linear.\n" +
                        "Para vetores grandes e ordenados, a busca binária recursiva é altamente recomendada.";
        }

        JOptionPane.showMessageDialog(
            null, 
            mensagem, 
            "Comparativo entre Busca Linear e Busca Binária", 
            JOptionPane.INFORMATION_MESSAGE
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

    public static int buscaLinear(char[] vetor, int K) {
        int tentativas = 0;
        for (int i = 0; i < vetor.length; i++) {
            tentativas++;
            if (vetor[i] == K) {
                return i; 
            }
        }
        return tentativas;
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

    public static void imprimirVetor(char[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}
