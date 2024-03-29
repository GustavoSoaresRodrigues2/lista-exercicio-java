/*
    22) Elaborar um programa, em linguagem Java, para calcular o N-ésimo elemento da
    série de Fibonacci. O índice desse elemento deverá ser digitado para a realização do
    cálculo. Criar um método que calcula o resultado da série, utilizando-se da recursividade.

    Série de Fibonacci: O próximo elemento tem o valor igual à soma dos dois elementos
    anteriores da série: 1, 1, 2, 3, 5, 8, 13, 21, ..., ;
*/
package Metodos_Recursividade;

public class Exercicio22 {

    public static int calcularFibonacci(int numFibo) {

        if (numFibo == 0) {
            return 0;
        } else if (numFibo == 1) {
            return 1;
        }

        return calcularFibonacci(numFibo - 1) + calcularFibonacci(numFibo - 2);
    }

}
