/*
    4) Dado o vetor gerado pelo exercício 3 ( [ ‘A’, ‘B’, ‘C’, ‘D’, ... , ‘W’, ‘X’, ‘Y’, ‘Z’ ] ),
    elaborar um programa em linguagem Java capaz de trocar a ordem de seus elementos, de
    dois em dois, até o final do mesmo ( [ ‘B’, ‘A’, ‘D’, ‘C’, ... , ‘X’, ‘W’, ‘Z’, ‘Y’ ] ),
    utilizando malhas;
*/

package Vetores;
public class Exercicio4 {
    
    public static void main(String[] args) {
        int n = 26;
        char[] vetor = new char[n];
        char inicial = 'A';

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = inicial;
            inicial++;
        }

        System.out.println("Alfabeto ao contrario: ");
        imprimirVetor(vetor);
    }

    public static void imprimirVetor(char[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
