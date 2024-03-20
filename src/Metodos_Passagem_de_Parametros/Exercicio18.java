/*
    18) Rescrever o exercício no. 12 desta lista, utilizando métodos com passagem de
    parâmetros;
*/
package Metodos_Passagem_de_Parametros;

import javax.swing.JOptionPane;

public class Exercicio18 {
    
    public static void verifPrimoREMASTED() {
        int Num;

        do {
            Num = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número: ")
            );

            if (Num <= 0)
                JOptionPane.showMessageDialog(
                    null, 
                    "Por favor, que seja maior que zero !"
                );
        } while (Num <= 0);

        if (verifPrimo(Num)) {
            JOptionPane.showMessageDialog(
                null, 
                Num + " é Primo !"
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                Num + " não é Primo !"
            );
        }
    }

    public static boolean verifPrimo(int Num) {
        if (Num == 1)
            return false;
        
        for (int i = 2; i < Num; i++) {
            if (Num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        verifPrimoREMASTED();
    }
}
