/*
    1) Elaborar um programa, em linguagem Java, capaz inicializar com 0 (zero) um vetor
    do tipo int de 100 elementos, utilizando-se das malhas (laços, loops, etc.) while, do-while
    e for;
*/
package Vetores;
public class Exercicio1 {

    public static void main(String[] args) {
        int n = 100;
        int[] vetor = new int[n];

        for (int i = 0; i < 100; i++) {
            vetor[i] = 0;
        }

        System.out.println("Vetor Vazio: ");
        imprimirVetor(vetor);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}