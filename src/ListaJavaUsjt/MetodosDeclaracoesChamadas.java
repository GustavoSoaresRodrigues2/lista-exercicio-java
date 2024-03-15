package ListaJavaUsjt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MetodosDeclaracoesChamadas {

        /* 11o) Utilizando programação por chamadas de métodos, elaborar um programa, em
    linguagem Java, capaz de receber os valores de a, b e c de uma equação de 2º grau
    qualquer ( a x2 + b x + c = 0 ), calcular e apresentar o valor de  (delta) e informar se suas
    raízes são imaginárias, reais iguais ou reais diferentes, apresentando seus valores para os
    casos quando foram reais. Dica: Criar um método para calcular a raiz 1 e outro método
    para calcular a raiz 2;
    */
    public static void exercicio11() {
        int A, B, C;
        double delta, X_P, X_N;

        A = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de A: ")
        );
        B = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de B: ")
        );
        C = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de C: ")
        );

        delta = (B * B) - 4 * A * C;
        System.out.println("Delta: " + delta);
        
        X_P = (-B + Math.sqrt(delta)) / 2 * A;
        X_N = (-B - Math.sqrt(delta)) / 2 * A;
        System.out.println("X¹: " + X_N + ", e X²: " + X_P);

        if (delta == 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e iguais." + 
                "\nX¹: " + X_P +
                "\nX²: " + X_N, 
                "Δ = 0", 
                1
            );
        } else if (delta < 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são imaginárias.", 
                "Δ < 0", 
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e diferentes." + 
                "\nX¹: " + X_P +
                "\nX²: " + X_N, 
                "Δ > 0", 
                1
            );
        }
    }

    /* 12o) Criar um método, que se utilize de malhas, capaz de informar se o número inteiro e
    maior que zero digitado pelo operador é ou não primo. Este método deverá ser utilizado
    por um programa em linguagem Java, que pedirá ao operador a digitação do número,
    verificará se o mesmo é ou não primo e apresentará a conclusão em tela;
    */
    public static boolean exercicio12() {
        int numero;
        numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um numero maior que zero.")
        );
        
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    /* PARTE NECESSARIA PARA FUNCIONAR
    public static void main(String[] args) {
        if (exercicio12()) {
            JOptionPane.showMessageDialog(
                null, 
                "O número é primo", 
                "Primo",
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "O número não é primo", 
                "Não é primo",
                0
            );
        }
    }
    */

    /* 13o) Da linha de produção de uma metalúrgica serão pegos, aleatoriamente, no decorrer
    de um dia, pelo controle de qualidade da empresa, 10 pregos sem cabeça para análise.
    Para cada amostra de prego pego, serão medidos seu comprimento e diâmetro, ambos em
    milímetros. Durante a medição, esses dados serão inseridos, um a um, em um programa
    de computador desenvolvido especialmente para isso. Após a digitação dos 10 pares de
    valores (comprimento e diâmetro), o programa deverá fornecer:
    a) Comprimento e Diâmetro Médios das amostras verificadas;
    b) O número e o comprimento da amostra mais longa (comprimento maior);
    c) O número e o diâmetro da amostra mais fina (diâmetro menor).
    Obs: Valor médio do comprimento das amostras: Cmédio = (C1+C2+ ... + C9 + C10) / 10
    Valor médio do diâmetro das amostras: Dmédio = (D1+D2+ ... + D9 + D10) / 10
    */
    public static void exercicio13() {
        int numPregos = 10;
        int[][] vetor = new int[numPregos][2];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i][0] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o comprimento do prego Nº" + (i + 1) + " em milímetros.")
            );
            vetor[i][1] = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o diâmetro do prego Nº" + (i + 1) + "  em milímetros.")
            );
        }

        int somaCompri = 0;
        int somaDiame = 0;
        int maiorComprimento = vetor[0][0]; // Inicializa com o comprimento do primeiro prego
        int maiorDiametro = vetor[0][1];    // Inicializa com o diâmetro do primeiro prego

        for (int j = 0; j < vetor.length; j++) {
            somaCompri += vetor[j][0];
            somaDiame += vetor[j][1];

            // Verifica se o comprimento atual é maior que o maiorComprimento
            if (vetor[j][0] > maiorComprimento) {
                maiorComprimento = vetor[j][0];
            }

            // Verifica se o diâmetro atual é maior que o maiorDiametro
            if (vetor[j][1] > maiorDiametro) {
                maiorDiametro = vetor[j][1];
            }
        }

        double mediaCompri = somaCompri / numPregos;
        double mediaDiame = somaDiame / numPregos;

        JOptionPane.showMessageDialog(
            null, 
            "Média da soma do comprimento é: " + mediaCompri, 
            "Média da soma do comprimento.", 
            1
        );
        JOptionPane.showMessageDialog(
            null, 
            "Média da soma do diâmetro é: " + mediaDiame, 
            "Média da soma do diâmetro.", 
            1
        );
        JOptionPane.showMessageDialog(
                null,
                "O maior comprimento é: " + maiorComprimento,
                "Maior comprimento.",
                1
        );
        JOptionPane.showMessageDialog(
                null,
                "O maior diâmetro é: " + maiorDiametro,
                "Maior diâmetro.",
                1
        );
    }

    /* 14o) Utilizando programação por chamadas de métodos, elaborar um programa, em
    linguagem Java, capaz de carregar, via teclado, os 10 elementos de um vetor do tipo
    double. Após isto, apresentar ao operador um menu contendo 3 opções e aguardar a
    digitação da opção por ele escolhida: Digitar ‘+’ para apresentar o próximo elemento do
    vetor; Digitar ‘-‘ para apresentar o elemento anterior do vetor; Digitar ‘. ‘ para sair.
    Dependendo da opção digitada, apresentar o respectivo elemento do vetor carregado.
    Obs.: O 1º elemento a ser apontado é o de índice 0;
    */
    public static void exercicio14() {
        String opcao;

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 12;
        }

        do {
            opcao = JOptionPane.showInputDialog(
                    "( + ) : Para ir no próximo elemento. \n" +
                    "( - ) : Para ir no elemento anterior. \n" + 
                    "( . ) : Para sair. \n" +
                    "\n" +
                    "Elemento do Vetor: " + vetor[cont]
            );

            switch (opcao) {
                case "+":
                    if (cont == 9) {
                        cont = 0;
                    } else {
                        cont++;
                    }
                    break;
                case "-":
                    if (cont == 0) {
                        cont = 9;
                    } else {
                        cont--;
                    }
                    break;
            }
        } while (!opcao.equals("."));
    }

    /* 15o) Utilizando programação por chamada de métodos, elaborar um programa em
    linguagem Java, capaz de criar um menu em tela, com as seguintes opções:
    A- Inserir número secreto;
    B- Jogar;
    C- Apresentar resultados;
    D- Sair;
    Proibida a reprodução, total ou parcial, do conteúdo sem prévia autorização do autor. Todos os direitos reservados ©.
    USJT-2024-1-ESDALG-Lista de Exercícios 1-ProfCalvetti.docx
    4/16
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
    - Se a opção D for digitada, o programa deve encerrar-se
    */
    public static void exercicio15() {
        List<MetodosDeclaracoesChamadas> lista = new ArrayList<>();

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

                    var fazerLista = new MetodosDeclaracoesChamadas(palpite);
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

                    for (MetodosDeclaracoesChamadas palpite : lista) {
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

    int palpite;

    public MetodosDeclaracoesChamadas(int palpite) {
        this.palpite = palpite;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }
}
