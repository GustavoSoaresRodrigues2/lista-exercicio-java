/*
    62) Elaborar um programa, em linguagem Java, capaz de informar quantas operações de
    troca realizaremos no exercício no. 59 para ordenar o vetor e, através dele, concluir
    quantas são realizadas para o melhor e para o pior caso?
*/
package Ordenacao_por_Trocas;
import javax.swing.JOptionPane;

public class Exercicio62 {
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

        int tentativas = ordenarPorTrocas(vetor);
        StringBuilder output = new StringBuilder("Vetor Ordenado!\n");
        for (char c : vetor){
            output.append(c).append(" ");
        }
        JOptionPane.showMessageDialog(null, output.toString());
        JOptionPane.showMessageDialog(null, "Foram " + tentativas + " tentativas de ordenar o vetor");  
    }
    public static int ordenarPorTrocas(char[] vetor){
        int tentativas = 0;
        int n = vetor.length;
        boolean trocou;
        do{
            trocou = false;
            for(int i = 0; i < n - 1; i++){
                if(vetor[i] > vetor[i+1]){
                    tentativas++;
                    
                    char temp = vetor[i];
                    vetor[i] = vetor [i+1];
                    vetor [i+1] = temp;
                    trocou = true;
                }
            }
        } while(trocou);

        return tentativas;
    }
}
