package ListaJavaUsjt;

import java.util.Random;

public class Vetores {


    /* 1) Elaborar um programa, em linguagem Java, capaz inicializar com 0 (zero) um vetor
    do tipo int de 100 elementos, utilizando-se das malhas (laços, loops, etc.) while, do-while
    e for; */

    public static void exercicio1(){
        int n = 100;
        int[] vetor = new int[n];

        for (int i = 0; i < 100; i++) {
            vetor[i] = 0;
        }

        System.out.println("Vetor Vazio: ");
        
        for (int element : vetor) {
            System.out.print(element + " ");
        } 
    }
    
    /* 2) Elaborar um programa, em linguagem Java, capaz de, em um vetor do tipo int de 100
     elementos, carregar seus índices pares com o número 0 (zero) e seus índices ímpares com
     o valor do próprio índice (ex.: [ 0, 1, 0, 3, 0, 5, 0, 7, ..., 97, 0, 99 ] ), utilizando-se de
     malhas; */
    
    
    public static void exercicio2(){
        int n = 100;
        int[] vetor = new int[n];

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                vetor[i] = 0;
            else 
                vetor[i] = i;
        }

        System.out.println("Vetor onde par = 0: ");
        
        for (int element : vetor) {
            System.out.print(element + " ");
        }
    }

    /* 3o) Elaborar um programa, em linguagem Java, capaz de carregar um vetor do tipo char
    de 26 elementos com os caracteres de A até Z pelo próprio programa, sem que haja
    digitação, utilizando malhas; */

    public static void exercicio3(){
        int n = 26;
        char[] vetor = new char[n];
        char inicial = 'A';

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = inicial;
            inicial++;
        }

        System.out.println("Alfabeto: ");
        
        for (char element : vetor) {
            System.out.print(element + " ");
        }

    }

    /* 4o) Elaborar um programa em linguagem Java capaz de trocar a ordem de seus elementos, de
    dois em dois, até o final do mesmo, utilizando malhas;
    */
    public static void exercicio4() {
        
        int n = 26;
        char[] vetor = new char[n];
        char inicial = 'A';

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = inicial;
            inicial++;
        }

        System.out.println("Alfabeto: ");
        
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

    /* 5o) Dado um vetor do tipo int de 16 elementos, elaborar um programa em linguagem Java,
    capaz de apresentar a quantidade de capicuas de 4 elementos existentes ao longo desse vetor
    (capicua: número que representa o mesmo valor quando lido da esquerda para a direita e vice-versa).
    */

    public static void exercicio5() {

        // Criar um vetor de inteiros com 16 elementos
        int[] vetor = new int[16];

        // Preencher o vetor com números aleatórios de 1 a 9
        preencherVetor(vetor);

        // Contar a quantidade de capicuas de 4 elementos no vetor
        int quantidadeCapicuas = contarCapicuas(vetor);

        // Exibir o vetor
        System.out.println("Vetor:");
        imprimirVetor(vetor);

        // Exibir a quantidade de capicuas de 4 elementos
        System.out.println("\nQuantidade de capicuas de 4 elementos: " + quantidadeCapicuas);
        
    }


    //Funcoes Auxiliares abaixo

    public static void preencherVetor(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(9) + 1; // Números aleatórios de 1 a 9
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }

    public static int contarCapicuas(int[] vetor) {
        int count = 0;
        for (int i = 0; i <= vetor.length - 4; i++) {
            if (ehCapicua(vetor, i, i + 3)) {
                count++;
            }
        }
        return count;
    }

    public static boolean ehCapicua(int[] vetor, int inicio, int fim) {
        while (inicio < fim) {
            if (vetor[inicio] != vetor[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

}
