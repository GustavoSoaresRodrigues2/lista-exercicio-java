/*
    11) Utilizando programação por chamadas de métodos, elaborar um programa, em
    linguagem Java, capaz de receber os valores de a, b e c de uma equação de 2º grau
    qualquer ( a x2 + b x + c = 0 ), calcular e apresentar o valor de  (delta) e informar se suas
    raízes são imaginárias, reais iguais ou reais diferentes, apresentando seus valores para os
    casos quando foram reais. Dica: Criar um método para calcular a raiz 1 e outro método
    para calcular a raiz 2;
*/
package Metodos_Declaracoes_e_Chamadas;

import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void equacao2grau() {
        int A, B, C;
        double delta, X_P, X_N;

        A = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de A: ")
        );
        B = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de B: ")
        );
        C = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de C: ")
        );

        delta = (B * B) - 4 * A * C;
        System.out.println("Delta: " + delta);
        
        X_P = (-B + Math.sqrt(delta)) / 2 * A;
        X_N = (-B - Math.sqrt(delta)) / 2 * A;
        
        System.out.println("X¹: " + X_N + ", e X²: " + X_P);

        if (delta == 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e iguais." + 
                "\nX¹: " + X_P +
                "\nX²: " + X_N, 
                "Δ = 0", 
                1
            );
        } else if (delta < 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são imaginárias.", 
                "Δ < 0", 
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e diferentes." + 
                "\nX¹: " + X_P +
                "\nX²: " + X_N, 
                "Δ > 0", 
                1
            );
        }
    }
    
    public static void main(String[] args) {
        equacao2grau();
    }
}
