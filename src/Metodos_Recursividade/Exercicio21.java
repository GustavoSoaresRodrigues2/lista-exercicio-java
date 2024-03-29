/*
    21) Elaborar um programa, em linguagem Java, para calcular o fatorial de um número a
    ser digitado. Criar um método para cálculo do mesmo utilizando recursividade;
*/
package Metodos_Recursividade;

public class Exercicio21 {

    public static int calcularFatorial(int numFat) {
        if (numFat <= 1) {
            return numFat;
        }

        return numFat * calcularFatorial(numFat - 1);
    }
}
