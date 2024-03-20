/*
    3) Elaborar um programa, em linguagem Java, capaz de carregar um vetor do tipo char
    de 26 elementos com os caracteres de A até Z pelo próprio programa, sem que haja
    digitação, utilizando malhas;
*/

package Vetores;
public class Exercicio3 {
    
    public static void main(String[] args) {
        int n = 26;
        char[] vetor = new char[n];
        char inicial = 'A';

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = inicial;
            inicial++;
        }

        System.out.println("Alfabeto: ");
        imprimirVetor(vetor);
    }

    public static void imprimirVetor(char[] vetor) {
        for (char elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}
