/*
    67) Elaborar um programa, em linguagem Java, capaz de informar quantas operações de
    seleção realizaremos no exercício no. 64 para ordenar o vetor e, através dele, concluir
    quantas são realizadas para o melhor e para o pior caso?
*/
package Ordenacao_por_Selecao;
import javax.swing.JOptionPane;

public class Exercicio67 {
    public static void main(String[] args) {
        char vetor [] = new char [5];
        JOptionPane.showMessageDialog(null, "Digite 5 valores em ordem aleatória!");

        for(int i = 0; i < vetor.length; i++){
            String input = JOptionPane.showInputDialog("Digite o "  + (i+1) + "º caractere!");
            if (input.length() > 1){
                JOptionPane.showMessageDialog(null, "Digite apenas um caractere");
                i--;
            }else{
                vetor[i] = input.charAt(0);
            }
        }
        int tentativas = ordenarPorSelecao(vetor);
        JOptionPane.showMessageDialog(null, "Vetor ordenado! " + new String(vetor));
        JOptionPane.showMessageDialog(null, "Foram " + tentativas + " tentativas de ordenar o vetor");  
    }

    public static int ordenarPorSelecao(char[] vetor){
        int tentativas = 0;
        for (int i = 0; i < vetor.length - 1; i++){
            tentativas++;
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++){
                
                if(vetor[j] < vetor[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if (indiceMenor !=1 ){
                char temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor]=temp;
            }
        }

        return tentativas;
    }
}
