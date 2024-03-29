/*
    43) Tomando o exercício anterior como base, desenvolver dois métodos de busca
    especiais, um linear e outro binário (iterativo), para o mesmo vetor e o mesmo elemento
    chave, informando ao final, ao invés do índice onde foi encontrado o elemento chave,
    quantas tentativas foram necessárias para se localizar ou não o elemento chave pelos dois
    métodos. Com o programa sendo executado diversas vezes, para diversos valores
    armazenados ou não no vetor, redigir um comparativo entre os métodos de busca linear e
    busca binária, tentando concluir quando devemos utilização de um método é vantajosa
    em relação ao outro.
*/
package Busca_Binaria;

import javax.swing.JOptionPane;

public class Exercicio43 {

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

        int tentativasBinaria  = buscaBinaria(vetor, K);

        String mensagem = "Comparativo entre Busca Linear e Busca Binária:\n" +
                          "----------------------------------------------\n" +
                          "Busca Linear: " + tentativasLinear + " tentativas\n" +
                          "Busca Binária: " + tentativasBinaria + " tentativas\n\n" +
                          "Recomendações:\n" +
                          "----------------------------------------------\n";
        
        if (tentativasLinear <= tentativasBinaria) {
            mensagem += "Para vetores pequenos ou não ordenados, utilize a busca linear é altamente recomendada..\n" +
                        "Para vetores grandes e ordenados, utilize a busca binária.";
        } else {
            mensagem += "Para vetores pequenos ou não ordenados, utilize a busca linear.\n" +
                        "Para vetores grandes e ordenados, a busca binária é altamente recomendada.";
        }

        JOptionPane.showMessageDialog(
            null, 
            mensagem, 
            "Comparativo entre Busca Linear e Busca Binária", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static int buscaBinaria(char vetor[], int K) {
        int B, A, M, tentativas = 0;

        B = 0;
        A = vetor.length - 1;

        while (B <= A) {
            tentativas++;
            M = (B + A) / 2;

            if (K < vetor[M]) A = M - 1;
            else if (K > vetor[M]) B = M + 1;
            else return M;
        }

        return tentativas;
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
