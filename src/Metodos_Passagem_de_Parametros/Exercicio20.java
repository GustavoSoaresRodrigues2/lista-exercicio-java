/*
    20) Rescrever o exercício no. 14 desta lista, utilizando métodos com passagem de
    parâmetros;
*/
package Metodos_Passagem_de_Parametros;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio20 {
    
    public static void programaVetorREMASTED(int tamanhoVetor) {
        String opcao;

        int[] vetor = new int[tamanhoVetor];

        int cont = 0;

        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(9) + 1;
        }
        
        do {
            opcao = JOptionPane.showInputDialog(
                "( + ) : Apresentar o proximo elemento do vetor\n" +
                "( - ) : Apresentar o antigo elemento do vetor\n" +
                "( . ) : Para sair\n" +
                "\n" +
                "Vetor do indice [" + cont + "]: " + vetor[cont]
            );

            if (opcao.equals("+")) {
                if (cont == 9) {
                    cont = 0;
                } else {
                    cont++;
                }
            }

            if (opcao.equals("-")) {
                if (cont == 0) {
                    cont = 9;
                } else {
                    cont--;
                }
            }
        } while (!opcao.equals("."));
    }

    public static void main(String[] args) {
        int tamanhoVetor;

        tamanhoVetor = Integer.parseInt(
            JOptionPane.showInputDialog("Qual o tamanho do vetor que queira?")
        );
        
        programaVetorREMASTED(tamanhoVetor);
    }
}
