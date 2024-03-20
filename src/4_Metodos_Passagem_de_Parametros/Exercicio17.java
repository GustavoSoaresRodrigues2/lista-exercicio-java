/*
    17) Rescrever o exercício no. 11 desta lista, utilizando métodos com passagem de
    parâmetros;
*/
package Metodos_Passagem_de_Parametros;

import javax.swing.JOptionPane;

public class Exercicio17 {
    
    public static void equacao2grausREMASTED() {
        int A, B, C;

        A = Integer.parseInt(
          JOptionPane.showInputDialog("Digite o valor de A: ")  
        );
        B = Integer.parseInt(
          JOptionPane.showInputDialog("Digite o valor de B: ")  
        );
        C = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de C: ")  
        );

        double Delta = Delta(A, B, C);
        double raiz1 = RaizUm(A, B, Delta);
        double raiz2 = RaizDois(A, B, Delta);

        JOptionPane.showMessageDialog(
            null, 
            "Resolvendo a equação " + A + "x² + " + B + "x + " + C + " = 0",
            "Equação", 
            1
        );
        JOptionPane.showMessageDialog(
            null, 
            "Valor de Delta: " + Delta,
            "Equação", 
            1
        );

        if (Delta == 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e iguais.\n" +
                "Valor do X¹ e X²: " + raiz1,
                "Equação", 
                1
            );
        } else if (Delta < 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são imaginárias.",
                "Equação", 
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e diferentes.\n" +
                "Valor do X¹: " + raiz1 + "\n" +
                "Valor do X²: " + raiz2,
                "Equação", 
                1
            );
        }
    }

    public static double Delta(int A, int B, int C) {
        return B * B - 4 * A * C;
    }

    public static double RaizUm(int A, int B, double Delta) {
        return (-B + Math.sqrt(Delta)) / (2 * A);
    }

    public static double RaizDois(int A, int B, double Delta) {
        return (-B - Math.sqrt(Delta)) / (2 * A);
    }

    public static void main(String[] args) {
        equacao2grausREMASTED();
    }
}
