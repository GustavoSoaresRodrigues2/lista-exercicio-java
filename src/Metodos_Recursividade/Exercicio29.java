/*
    29) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, dois números inteiros e positivos, calculando a subtração
    do segundo no primeiro, porém, não se utilizando da subtração para realizar o cálculo e
    sim a operação de comparação sucessivamente.

    Exemplo: 5 – 3 => 3+1 = 4; 3+2=5. Portanto 5 – 3 = 2.
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Por favor, digite números válidos");
        } else {
            int resultado = subtracaoComparacao(num1, num2);
            System.out.println(num1 + " - " + num2 + " é igual a: " + resultado);
        }

        scanner.close();
    }

    public static int subtracaoComparacao(int numero1, int numero2) {
        if (numero2 == 0) {
            return numero1;
        }

        return subtracaoComparacao(numero1 + 1, numero2 - 1);
    }

}
