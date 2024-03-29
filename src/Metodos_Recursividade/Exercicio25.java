/*
    25) Elaborar um programa, em linguagem Java, que utilize apenas métodos recursivos,
    capaz de receber, via teclado, 10 elementos tipo float, formando um vetor, e um outro
    elemento tipo float, o qual deverá ser comparado à cada elemento do vetor. O programa
    deverá informar o valor do primeiro índice do vetor, a partir do 0, que contém um
    elemento igual ao valor digitado. Ex.:

    Índice:                 0 1 2 3 4 5 6 7 8 9
    Elementos Digitados:    1 2 3 4 5 6 7 8 9 10
    
    Número Digitado: 4 → Resposta: O número 4 está localizado no índice 3 do vetor.
*/
package Metodos_Recursividade;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] userNumArray = new float[10];

        for (int i = 0; i < userNumArray.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento: ");
            userNumArray[i] = scanner.nextFloat();
        }

        System.out.print("Digite um número para buscar no vetor: ");
        float numeroProcurado = scanner.nextFloat();

        int indice = buscarIndice(userNumArray, numeroProcurado, 0);

        if (indice == -1) {
            System.out.println("O número " + numeroProcurado + " não está no vetor.");
        } else {
            System.out.println("O número " + numeroProcurado + " está localizado no índice " + indice + " do vetor.");
        }

        scanner.close();
    }

    public static int buscarIndice(float[] arrayFloat, float numero, int indiceAtual) {

        if (indiceAtual >= arrayFloat.length) {
            return -1;
        } else if (arrayFloat[indiceAtual] == numero) {
            return indiceAtual;
        }

        return buscarIndice(arrayFloat, numero, indiceAtual + 1);
    }

}
