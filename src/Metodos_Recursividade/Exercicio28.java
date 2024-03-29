/*
    28) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, dois números inteiros e positivos, calculando a
    multiplicação entre esses dois números, porém, não se utilizando a multiplicação para
    realizar o cálculo e sim a operação de soma sucessiva.

    Exemplo: 4 * 3 é igual a 3 + 3 + 3 + 3.
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Por favor, digite números válidos");
        } else {
            int resultado = multiplicacaoPelaSoma(num1, num2);
            System.out.println(num1 + " * " + num2 + " é igual a: " + resultado);
        }

        scanner.close();
    }

    public static int multiplicacaoPelaSoma(int numero1, int numero2) {
        if (numero2 == 0) {
            return 0;
        } else {
            return numero1 + multiplicacaoPelaSoma(numero1, numero2 - 1);
        }
    }

}
