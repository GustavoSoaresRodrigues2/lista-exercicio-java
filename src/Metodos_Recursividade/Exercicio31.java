/*
    31) Reescrever o exercício anterior, porém colocando mensagens dentro do método
    recursivo, de valores de entrada e valores de retorno, afim de acompanhar-se a evolução
    da execução do programa.
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o termo da série (número inteiro positivo): ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            double resultado = calcularSerie(numero);
            System.out.println("O valor da série até o " + numero + "termo é: " + resultado);
        }

        scanner.close();
    }

    public static double calcularSerie(int numeroSerie) {
        return calcularSerieRecursivo(numeroSerie, 1);
    }

    public static double calcularSerieRecursivo(int numeroSerie, int termo) {
        System.out.println("Calculando o " + termo + "º termo para n = " + numeroSerie);

        if (numeroSerie == 1) {
            System.out.println("Base da recursão alcançada. Retornando 1.0 / 20.");
            return 1.0 / 20;
        } else {
            double valorTermo = 1.0 / calcularPotenciaDe2(termo);
            System.out.println("Valor do " + termo + "º termo: " + valorTermo);

            double valorRecursivo = calcularSerieRecursivo(numeroSerie - 1, termo + 1);
            System.out.println("Soma do " + termo + "º termo com a série restante: " + valorRecursivo);

            double resultado = valorTermo + valorRecursivo;
            System.out.println("Resultado parcial para n = " + numeroSerie + ": " + resultado);
            return resultado;
        }
    }

    public static double calcularPotenciaDe2(int expoente) {
        System.out.println("Calculando a potência de 2 para o expoente " + expoente);

        if (expoente == 0) {
            System.out.println("Expoente 0 alcançado. Retornando 1.");
            return 1;
        } else {
            double resultado = 2 * calcularPotenciaDe2(expoente - 1);
            System.out.println("Potência de 2 para o expoente " + expoente + ": " + resultado);
            return resultado;
        }
    }

}
