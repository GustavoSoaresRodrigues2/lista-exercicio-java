/*
    27) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, dois números inteiros e positivos, calculando o primeiro
    elevado ao segundo.
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número(base): ");
        int base = scanner.nextInt();

        System.out.print("Digite o segundo número(expoente): ");
        int expoente = scanner.nextInt();

        if (base < 0 || expoente < 0) {
            System.out.println("Por favor, digite números válidos");
        } else {
            long resultado = calculoPotencia(base, expoente);
            System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
        }

        scanner.close();
    }

    public static long calculoPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        return base * calculoPotencia(base, expoente - 1);
    }

}
