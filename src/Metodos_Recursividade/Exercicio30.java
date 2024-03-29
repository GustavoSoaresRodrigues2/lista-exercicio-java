/*
    30) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, um número inteiro, positivo, que represente o termo da série
    abaixo. Calcular o valor da série, ou seja, a soma de todos os valores calculados, do 1º
    termo até o termo digitado.

    S = (1/20) + (1/21) + (1/22) + (1/23) + (1/24) + ... + (1/2N-1) + (1/2N)

    Exemplo: Digitado o termo: 4 => S = 1 + 1/2 + 1/4 + 1/8 => S = 1.875
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o termo da série positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número válido");
        } else {
            double resultado = calcularSerie(numero);
            System.out.println("O valor da série até o " + numero + "º termo é: " + resultado);
        }

        scanner.close();
    }

    public static double calcularSerie(int numeroSerie) {
        if (numeroSerie == 1) {
            return 1.0 / 20;
        } else {
            return calcularSerie(numeroSerie - 1) + 1.0 / calcularPotenciaDeDois(numeroSerie);
        }
    }

    public static double calcularPotenciaDeDois(int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return 2 * calcularPotenciaDeDois(expoente - 1);
        }
    }

}
