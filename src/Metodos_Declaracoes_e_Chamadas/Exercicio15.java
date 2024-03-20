/*
    15) Utilizando programação por chamada de métodos, elaborar um programa em
    linguagem Java, capaz de criar um menu em tela, com as seguintes opções:

    A- Inserir número secreto;
    B- Jogar;
    C- Apresentar resultados;
    D- Sair;

    - Se a opção A for digitada, o programa deverá fornecer instruções ao operador e receber,
    via teclado, um número inteiro e positivo, secreto, objetivo de adivinhação do jogo. Após
    isto, o programa deverá voltar ao menu principal;

    - Se a opção B for digitada, o jogo se iniciará e será colocado 0 no contador de palpites.
    O programa fornecerá instruções ao operador e receberá, via teclado, um número inteiro
    e positivo, a ser comparado com o número secreto. Se o número digitado for maior que o
    secreto, o programa informará ao operador a palavra ALTO, incrementará o contador de
    palpites e aguardará o próximo palpite; Se o número digitado for menor que o secreto, o
    programa informará ao operador a palavra BAIXO, incrementará o contador de palpites
    e aguardará o próximo palpite; Se o número digitado for igual ao secreto, o programa
    informará ao operador a palavra ACERTOU e retornará ao menu principal; Se o número
    digitado for negativo, o programa deverá retornar ao menu principal.

    - Se a opção C for digitada, o programa apresentará a quantidade de palpites que foram
    necessários para acontecer último acerto. Após isto, o programa deverá retornar ao menu
    principal.

    - Se a opção D for digitada, o programa deve encerrar-se.
*/
package Metodos_Declaracoes_e_Chamadas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio15 {

    int palpite;

    public Exercicio15(int palpite) {
        this.palpite = palpite;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    public static void numeroSecreto() {
        List<Exercicio15> lista = new ArrayList<>();

        String opcao;
        int numeroBonus = 54;

        do {
            opcao = JOptionPane.showInputDialog(
                    "( A ) : Inserir número secreto. \n" +
                    "( B ) : Jogar. \n" + 
                    "( C ) : Apresentar resultados. \n" +
                    "( D ) : Sair."
            );

            switch (opcao) {
                case "A":{
                    int numSecret;
                    numSecret = Integer.parseInt(
                        JOptionPane.showInputDialog("Insira o número secreto.")
                    );

                    if (numSecret == numeroBonus) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você acertou o número secreto !!!", 
                            "Acertou !!!", 
                            1
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você Errou o número secreto !!!", 
                            "Errou !!!", 
                            1
                        );
                    }
                }
                    break;
                case "B":{
                    int palpite;
                    palpite = Integer.parseInt(
                        JOptionPane.showInputDialog("Qual o número secreto?")
                    );

                    var fazerLista = new Exercicio15(palpite);
                    lista.add(fazerLista);

                    if (palpite == numeroBonus) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "O número que você escreveu parece falimiar.", 
                            "Interessante.", 
                            1
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você Errou o número secreto !!!", 
                            "Errou !!!", 
                            1
                        );
                    }
                }
                    break;
                case "C":{
                    StringBuilder sb = new StringBuilder();

                    for (Exercicio15 palpite : lista) {
                        sb.append(palpite.getPalpite());
                        sb.append("\n");
                    }

                    JOptionPane.showMessageDialog(
                            null, 
                            sb.toString(), 
                            "Lista de palpites", 
                            1
                    );
                }
                    break;
            }

        } while (!opcao.equals("D"));
    }
    
    public static void main(String[] args) {
        numeroSecreto();
    }
}
