/*
    13) Da linha de produção de uma metalúrgica serão pegos, aleatoriamente, no decorrer
    de um dia, pelo controle de qualidade da empresa, 10 pregos sem cabeça para análise.
    Para cada amostra de prego pego, serão medidos seu comprimento e diâmetro, ambos em
    milímetros. Durante a medição, esses dados serão inseridos, um a um, em um programa
    de computador desenvolvido especialmente para isso. Após a digitação dos 10 pares de
    valores (comprimento e diâmetro), o programa deverá fornecer:

    a) Comprimento e Diâmetro Médios das amostras verificadas;
    b) O número e o comprimento da amostra mais longa (comprimento maior);
    c) O número e o diâmetro da amostra mais fina (diâmetro menor).

    Obs:    Valor médio do comprimento das amostras: Cmédio = (C1+C2+ ... + C9 + C10) / 10
            Valor médio do diâmetro das amostras: Dmédio = (D1+D2+ ... + D9 + D10) / 10
*/
package Metodos_Declaracoes_e_Chamadas;

import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void pregosRuins() {
        int numPregos = 10;
        int[][] vetor = new int[numPregos][2];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i][0] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o comprimento do prego Nº" + (i + 1) + " em milímetros.")
            );
            vetor[i][1] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o diâmetro do prego Nº" + (i + 1) + "  em milímetros.")
            );
        }

        int somaCompri = 0;
        int somaDiame = 0;
        int maiorComprimento = vetor[0][0]; // Inicializa com o comprimento do primeiro prego
        int maiorDiametro = vetor[0][1];    // Inicializa com o diâmetro do primeiro prego

        for (int j = 0; j < vetor.length; j++) {
            somaCompri += vetor[j][0];
            somaDiame += vetor[j][1];

            // Verifica se o comprimento atual é maior que o maiorComprimento
            if (vetor[j][0] > maiorComprimento) {
                maiorComprimento = vetor[j][0];
            }

            // Verifica se o diâmetro atual é maior que o maiorDiametro
            if (vetor[j][1] > maiorDiametro) {
                maiorDiametro = vetor[j][1];
            }
        }

        double mediaCompri = somaCompri / numPregos;
        double mediaDiame = somaDiame / numPregos;

        JOptionPane.showMessageDialog(
            null, 
            "Média da soma do comprimento é: " + mediaCompri, 
            "Média da soma do comprimento.", 
            1
        );
        JOptionPane.showMessageDialog(
            null, 
            "Média da soma do diâmetro é: " + mediaDiame, 
            "Média da soma do diâmetro.", 
            1
        );
        JOptionPane.showMessageDialog(
                null,
                "O maior comprimento é: " + maiorComprimento,
                "Maior comprimento.",
                1
        );
        JOptionPane.showMessageDialog(
                null,
                "O maior diâmetro é: " + maiorDiametro,
                "Maior diâmetro.",
                1
        );
    }
    
    public static void main(String[] args) {
        pregosRuins();
    }
}
