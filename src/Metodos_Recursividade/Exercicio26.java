/*
    26) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, dois números inteiros e positivos, calculando o Máximo
    Divisor Comum entre eles.
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Por favor, digite números válidos");
        } else {
            int mdc = verificseMDC(num1, num2);
            System.out.println("O M.D.C entre " + num1 + " e " + num2 + " é: " + mdc);
        }

        scanner.close();
    }

    public static int verificseMDC(int numero1, int numero2) {
        if (numero2 == 0) {
            return numero1;
        } 
        return verificseMDC(numero2, numero1 % numero2);
    }

}
