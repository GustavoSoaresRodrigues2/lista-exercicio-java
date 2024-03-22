/*
    16) Elaborar um método, em linguagem Java, com passagem de parâmetros, dentro de
    um programa teste, capaz de informar se o número digitado é par ou ímpar. A digitação
    do valor e a apresentação do resultado deverá acontecer externamente a este método;
*/
package Metodos_Passagem_de_Parametros;

import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void pegarNumero() {
        int num;

        num = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um número.")
        );

        if (verifNumero(num)) {
            JOptionPane.showMessageDialog(
                null, 
                "O número " + num + " é Par",
                "O número digitado é Par", 
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "O número " + num + " é Impar",
                "O número digitado é Impar", 
                1
            );
        }

    }

    public static boolean verifNumero(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        pegarNumero();
    }
}
