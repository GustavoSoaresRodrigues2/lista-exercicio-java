package ListaJavaUsjt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MetodosPassagemParametros {

    /* 16o) Elaborar um método, em linguagem Java, com passagem de parâmetros, dentro de
    um programa teste, capaz de informar se o número digitado é par ou ímpar. A digitação
    do valor e a apresentação do resultado deverá acontecer externamente a este método;
    */
    public static void exercicio16() {
        int A, B, C;

        A = Integer.parseInt(
          JOptionPane.showInputDialog("Digite o valor de A: ")  
        );
        B = Integer.parseInt(
          JOptionPane.showInputDialog("Digite o valor de B: ")  
        );
        C = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o valor de C: ")  
        );

        double Delta = Delta(A, B, C);
        double raiz1 = RaizUm(A, B, Delta);
        double raiz2 = RaizDois(A, B, Delta);

        JOptionPane.showMessageDialog(
            null, 
            "Resolvendo a equação " + A + "x² + " + B + "x + " + C + " = 0",
            "Equação", 
            1
        );
        JOptionPane.showMessageDialog(
            null, 
            "Valor de Delta: " + Delta,
            "Equação", 
            1
        );

        if (Delta == 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e iguais.\n" +
                "Valor do X¹ e X²: " + raiz1,
                "Equação", 
                1
            );
        } else if (Delta < 0) {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são imaginárias.",
                "Equação", 
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "As raízes são reais e diferentes.\n" +
                "Valor do X¹: " + raiz1 + "\n" +
                "Valor do X²: " + raiz2,
                "Equação", 
                1
            );
        }
    }

    public static double Delta(int A, int B, int C) {
        return B * B - 4 * A * C;
    }

    public static double RaizUm(int A, int B, double Delta) {
        return (-B + Math.sqrt(Delta)) / (2 * A);
    }

    public static double RaizDois(int A, int B, double Delta) {
        return (-B - Math.sqrt(Delta)) / (2 * A);
    }    

    /* 17o) Rescrever o exercício no. 11 desta lista, utilizando métodos com passagem de
    parâmetros;
    */
    public static void exercicio17() {
        int Num;

        do {
            Num = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número: ")
            );

            if (Num <= 0)
                JOptionPane.showMessageDialog(
                    null, 
                    "Por favor, que seja maior que zero !"
                );
        } while (Num <= 0);

        if (verifPrimo(Num)) {
            JOptionPane.showMessageDialog(
                null, 
                Num + " é Primo !"
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                Num + " não é Primo !"
            );
        }
    }

    public static boolean verifPrimo(int Num) {
        if (Num == 1)
            return false;
        
        for (int i = 2; i < Num; i++) {
            if (Num % i == 0)
                return false;
        }

        return true;
    }

    /* 18o) Rescrever o exercício no. 12 desta lista, utilizando métodos com passagem de
    parâmetros;
    */
    public static void exercicio18() {
        int numeroDePregos = 10;
        int[][] pregos = new int[numeroDePregos][2];

        // Entrada de dados para cada prego
        for (int i = 0; i < numeroDePregos; i++) {
            pregos[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do prego " + (i + 1) + " em milímetros."));
            pregos[i][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o diâmetro do prego " + (i + 1) + " em milímetros."));
        }

        // Cálculo da média do comprimento e diâmetro
        int somaComprimento = 0;
        int somaDiametro = 0;
        for (int i = 0; i < numeroDePregos; i++) {
            somaComprimento += pregos[i][0];
            somaDiametro += pregos[i][1];

        }

        int mediaComprimento = somaComprimento / numeroDePregos;
        int mediaDiametro = somaDiametro / numeroDePregos;

        // Encontrar o comprimento da amostra mais longa e o número correspondente
        int comprimentoMaximo = pregos[0][0];
        int numeroAmostraComprimentoMaximo = 1;
        for (int i = 1; i < numeroDePregos; i++) {
            if (pregos[i][0] > comprimentoMaximo) {
                comprimentoMaximo = pregos[i][0];
                numeroAmostraComprimentoMaximo = i + 1;
            }
        }

        // Encontrar o diâmetro da amostra mais fina e o número correspondente
        int diametroMinimo = pregos[0][1];
        int numeroAmostraDiametroMinimo = 1;
        for (int i = 1; i < numeroDePregos; i++) {
            if (pregos[i][1] < diametroMinimo) {
                diametroMinimo = pregos[i][1];
                numeroAmostraDiametroMinimo = i + 1;
            }
        }

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, mediaComprimento, "Média do comprimento dos pregos: ", 1);
        JOptionPane.showMessageDialog(null, mediaDiametro, "Média do diâmetro dos pregos: ", 1);
        JOptionPane.showMessageDialog(null, "Amostra mais longa: Prego número " + numeroAmostraComprimentoMaximo + ", Comprimento: " + comprimentoMaximo + "mm", "Amostra mais longa", 1);
        JOptionPane.showMessageDialog(null, "Amostra mais fina: Prego número " + numeroAmostraDiametroMinimo + ", Diâmetro: " + diametroMinimo + "mm", "Amostra mais fina", 1);
    }

    /* 19o) Rescrever o exercício no. 13 desta lista, utilizando métodos com passagem de
    parâmetros;
    */
    public static void exercicio19() {
        String opcao;
        int n = 10;
        int[] vetor = new int[n];
        int cont = 0;

        vetor[0] = 45;
        vetor[1] = 32;
        vetor[2] = 12;
        vetor[3] = 85; 
        vetor[4] = 78;
        vetor[5] = 1;
        vetor[6] = 54; 
        vetor[7] = 2;
        vetor[8] = 38;
        vetor[9] = 64;

        do {
            opcao = JOptionPane.showInputDialog(
                "( + ) : Apresentar o proximo elemento do vetor\n" +
                "( - ) : Apresentar o antigo elemento do vetor\n" +
                "( . ) : Para sair\n" +
                "\n" +
                "Vetor do indice " + cont + ": " + vetor[cont]
            );

            if (opcao.equals("+")) {
                if (cont == 9) {
                    cont = 0;
                } else {
                    cont++;
                }
            }

            if (opcao.equals("-")) {
                if (cont == 0) {
                    cont = 9;
                } else {
                    cont--;
                }
            }
        } while (!opcao.equals("."));
    }

    /* 20o) Rescrever o exercício no. 14 desta lista, utilizando métodos com passagem de
    parâmetros;
    */
    public static void exercicio20() {
        List<MetodosPassagemParametros> lista = new ArrayList<>();

        String opcao;
        int numSecreto = 54;
        int cont = 0;

        do {
            opcao = JOptionPane.showInputDialog(
                "( A ) : Inserir número secreto.\n" + 
                "\n" +
                "( B ) : Jogar.\n" + 
                "\n" +
                "( C ) : Apresentar resultados;\n" + 
                "\n" +
                "( D ) : Sair.\n"        
            );

            switch (opcao) {
                case "A":
                    int input1;
                    input1 = Integer.parseInt(
                        JOptionPane.showInputDialog(
                        "Digite o número secreto."
                        )
                    );

                    if (input1 == numSecreto) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você acertou o número secreto !!!", 
                            "Ganhador !!!", 
                            1);
                    } else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Você não acertou o número secreto.", 
                            "Errou !!!", 
                            1
                        );
                    }
                
                    break;
                
                case "B":
                    int input2;
                    input2 = Integer.parseInt(
                        JOptionPane.showInputDialog(
                        "Digite o número secreto."
                        )
                    );

                    var palpite = new MetodosPassagemParametros(input2);
                    lista.add(palpite);
                    cont++;

                    JOptionPane.showMessageDialog(
                        null, 
                        "Errou !!!\n" +
                        "\n" +
                        "Foram: " + cont + " palpites.", 
                        "Palpites", 
                        1
                    );
                
                    break;
                
                case "C":
                    StringBuilder sb = new StringBuilder();

                    for (MetodosPassagemParametros palp : lista) {
                        sb.append(palp.getPalpites());
                        sb.append(".\n");
                    }

                    JOptionPane.showMessageDialog(
                        null, 
                        sb.toString(), 
                        "Lista de Palpites", 
                        1
                    );
                
                    break;
                default:
                    break;
            }

        } while (!opcao.equals("D"));
    }

    public int palpites;

    public MetodosPassagemParametros(int palpites) {
        this.palpites = palpites;
    }

    public int getPalpites() {
        return palpites;
    }

    public void setPalpites(int palpites) {
        this.palpites = palpites;
    }
}
