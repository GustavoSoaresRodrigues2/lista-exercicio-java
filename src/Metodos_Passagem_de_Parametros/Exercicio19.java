/*
    19) Rescrever o exercício no. 13 desta lista, utilizando métodos com passagem de
    parâmetros;
*/
package Metodos_Passagem_de_Parametros;

import javax.swing.JOptionPane;

public class Exercicio19 {
    
    public static void pregosRuinsREMASTED(int numeroDePregos) {
        int[][] pregos = new int[numeroDePregos][2];

        // Entrada de dados para cada prego
        for (int i = 0; i < numeroDePregos; i++) {
            pregos[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do prego " + (i + 1) + " em milímetros."));
            pregos[i][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o diâmetro do prego " + (i + 1) + " em milímetros."));
        }

        // Cálculo da média do comprimento e diâmetro
        int somaComprimento = 0;
        int somaDiametro = 0;
        for (int i = 0; i < numeroDePregos; i++) {
            somaComprimento += pregos[i][0];
            somaDiametro += pregos[i][1];

        }

        int mediaComprimento = somaComprimento / numeroDePregos;
        int mediaDiametro = somaDiametro / numeroDePregos;

        // Encontrar o comprimento da amostra mais longa e o número correspondente
        int comprimentoMaximo = pregos[0][0];
        int numeroAmostraComprimentoMaximo = 1;
        for (int i = 1; i < numeroDePregos; i++) {
            if (pregos[i][0] > comprimentoMaximo) {
                comprimentoMaximo = pregos[i][0];
                numeroAmostraComprimentoMaximo = i + 1;
            }
        }

        // Encontrar o diâmetro da amostra mais fina e o número correspondente
        int diametroMinimo = pregos[0][1];
        int numeroAmostraDiametroMinimo = 1;
        for (int i = 1; i < numeroDePregos; i++) {
            if (pregos[i][1] < diametroMinimo) {
                diametroMinimo = pregos[i][1];
                numeroAmostraDiametroMinimo = i + 1;
            }
        }

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, mediaComprimento, "Média do comprimento dos pregos: ", 1);
        JOptionPane.showMessageDialog(null, mediaDiametro, "Média do diâmetro dos pregos: ", 1);
        JOptionPane.showMessageDialog(null, "Amostra mais longa: Prego número " + numeroAmostraComprimentoMaximo + ", Comprimento: " + comprimentoMaximo + "mm", "Amostra mais longa", 1);
        JOptionPane.showMessageDialog(null, "Amostra mais fina: Prego número " + numeroAmostraDiametroMinimo + ", Diâmetro: " + diametroMinimo + "mm", "Amostra mais fina", 1);
    }

    public static void main(String[] args) {
        int numeroDePregos;

        numeroDePregos = Integer.parseInt(
            JOptionPane.showInputDialog("Quantos pregos estão com defeito?")
        );

        pregosRuinsREMASTED(numeroDePregos);
    }
}
