/*
    77) Elaborar um programa, em linguagem Java, capaz de informar quantas operações de
    Quick-Sort realizaremos no exercício no. 74 para ordenar o vetor e, através dele, concluir
    quantas são realizadas para o melhor e para o pior caso?
*/
package Ordenação_QuickSort;
import javax.swing.JOptionPane;

public class Exercicio77 {
    public static void main(String[] args) {
        char vetor [] = new char [5];

        JOptionPane.showMessageDialog(null, "Digite 5 caracteres em ordem aleatoria");
        for (int i = 0; i < vetor.length; i++){
            String input = JOptionPane.showInputDialog("Digite o caracter" + (i+1));
            if (input.length() > 1 ){
                JOptionPane.showMessageDialog(null, "Digite apenas um caractere, por favor!");
                i--;
            }
            else{
                vetor[i] = input.charAt(0);
            }
        }

        int tentativas = quickSort(vetor, 0, vetor.length - 1);
        StringBuilder output = new StringBuilder("Vetor ordenado em ordem crescente:\n");
        for (char elemento : vetor) {
            output.append(elemento).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
        JOptionPane.showMessageDialog(null, "Foram " + tentativas + " tentativas de ordenar o vetor");
        
    }
    
    public static int quickSort(char[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int[] tentativas = {0}; // Array para armazenar o número de tentativas
            int posicaoPivo = particionar(vetor, inicio, fim, tentativas);
            return quickSort(vetor, inicio, posicaoPivo - 1) + quickSort(vetor, posicaoPivo + 1, fim) + tentativas[0];
        }
        return 0; // Retorna 0 se não houver elementos a serem ordenados
    }
    
    public static int particionar(char[] vetor, int inicio, int fim, int[] tentativas) {
        char pivo = vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] < pivo) {
                i++;
                char temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
                tentativas[0]++; // Incrementa o número de tentativas
            }
        }
        char temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        tentativas[0]++; // Incrementa o número de tentativas
        return i + 1;
    }
}
