/*
    23) Utilizando recursividade, criar um programa, em linguagem Java, que calcule e
    apresente a soma de todos os elementos de um vetor, inteiro, de tamanho 10, o qual deverá
    ser preenchido, anteriormente ao cálculo, pelo operador;
*/
package Metodos_Recursividade;

public class Exercicio23 {
    public static int somaVetor(int array[], int size) {

        if (size == 0) {
            return 0;
        }

        return array[size - 1] + somaVetor(array, size - 1);
    }

}
