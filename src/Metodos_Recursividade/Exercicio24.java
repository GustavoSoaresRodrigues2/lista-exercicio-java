/*
    24) Criar um método, em linguagem Java, que se utilize da recursividade, dentro de um
    programa capaz de receber, via teclado, um número inteiro qualquer e informar se o
    mesmo é ou não primo;
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificação: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
        } else {
            if (verificaPrimo(numero, 2)) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        scanner.close();
    }

    public static boolean verificaPrimo(int numero, int divisor) {

        if (divisor == numero) {
            return true;
        } else if (numero % divisor == 0) {
            return false;
        }

        return verificaPrimo(numero, divisor + 1);
    }

}
