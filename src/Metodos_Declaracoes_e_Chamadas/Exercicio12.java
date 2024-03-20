/*
    12) Criar um método, que se utilize de malhas, capaz de informar se o número inteiro e
    maior que zero digitado pelo operador é ou não primo. Este método deverá ser utilizado
    por um programa em linguagem Java, que pedirá ao operador a digitação do número,
    verificará se o mesmo é ou não primo e apresentará a conclusão em tela;
*/
package Metodos_Declaracoes_e_Chamadas;

import javax.swing.JOptionPane;

public class Exercicio12 {

    public static boolean verifPrimo() {
        int numero;
        numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um numero maior que zero.")
        );
        
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        if (verifPrimo()) {
            JOptionPane.showMessageDialog(
                null, 
                "O número é primo", 
                "Primo",
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "O número não é primo", 
                "Não é primo",
                0
            );
        }
    }
}
