/*
    14) Utilizando programação por chamadas de métodos, elaborar um programa, em
    linguagem Java, capaz de carregar, via teclado, os 10 elementos de um vetor do tipo
    double. Após isto, apresentar ao operador um menu contendo 3 opções e aguardar a
    digitação da opção por ele escolhida: Digitar ‘+’ para apresentar o próximo elemento do
    vetor; Digitar ‘-‘ para apresentar o elemento anterior do vetor; Digitar ‘. ‘ para sair.
    Dependendo da opção digitada, apresentar o respectivo elemento do vetor carregado.
    
    Obs.: O 1º elemento a ser apontado é o de índice 0;
*/
package Metodos_Declaracoes_e_Chamadas;

import javax.swing.JOptionPane;

public class Exercicio14 {
    
    public static void programaVetor() {
        String opcao;

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 12;
        }

        do {
            opcao = JOptionPane.showInputDialog(
                    "( + ) : Para ir no próximo elemento. \n" +
                    "( - ) : Para ir no elemento anterior. \n" + 
                    "( . ) : Para sair. \n" +
                    "\n" +
                    "Elemento do Vetor: " + vetor[cont]
            );

            switch (opcao) {
                case "+":
                    if (cont == 9) {
                        cont = 0;
                    } else {
                        cont++;
                    }
                    break;
                case "-":
                    if (cont == 0) {
                        cont = 9;
                    } else {
                        cont--;
                    }
                    break;
            }
        } while (!opcao.equals("."));
    }
    public static void main(String[] args) {
        programaVetor();
    }
}
