package ListaJavaUsjt;

import java.util.Scanner;

public class Matrizes {

        /* 6o) Elaborar um programa, em linguagem Java, capaz de limpar (colocar -1 em todas as
    suas posições) qualquer tipo de matriz, inteira e positiva e que seja declarada globalmente.
    O programador deverá definir o tamanho da matriz (linhas e colunas), antes de compilar
    o programa.
    */
    public static void exercicio6() {
            //DEFINIR O TAMANHO DA MATRIZ
            static final int LINHAS = 4;
            static final int COLUNAS = 4;
        
            //LIMPAR MATRIZ
            static void limparMatriz(int[][] matriz) {
                for (int i = 0; i < LINHAS; i++) {
                    for (int j = 0; j < COLUNAS; j++) {
                        matriz[i][j] = -1; // Colocando -1 em todas as posições
                    }
                }
            }
        
            // IMPRIMIR MATRIZ
            static void imprimirMatriz(int[][] matriz) {
                for (int i = 0; i < LINHAS; i++) {
                    for (int j = 0; j < COLUNAS; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        
                // INICIALIZAÇÃO DA MATRIZ 
                int[][] matriz = new int[LINHAS][COLUNAS];
        
                // Chamando a função para limpar a matriz
                limparMatriz(matriz);
        
                // Imprimindo a matriz limpa
                System.out.println("Matriz Limpa:");
                imprimirMatriz(matriz);
            }
        }

    /* 7o) Determinar a matriz transposta de uma matriz global qualquer e digitada, através de
    um programa em linguagem Java. Uma matriz é dita transposta quando a matriz original
    tiver suas linhas transformadas em colunas e suas colunas transformadas em linhas.
    */
    public static void exercicio7() {
         Scanner scanner = new Scanner(System.in);
        
        // Pedir ao usuário para inserir o número de linhas e colunas da matriz
        System.out.print("Insira o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Insira o número de colunas da matriz: ");
        int colunas = scanner.nextInt();
        
        // Declarar a matriz
        int[][] matriz = new int[linhas][colunas];
        
        // Preencher a matriz
        System.out.println("Insira os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Imprimir a matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        
        // Calcular e imprimir a matriz transposta
        System.out.println("Matriz transposta:");
        int[][] transposta = calcularTransposta(matriz);
        imprimirMatriz(transposta);
        
        scanner.close();
    }
    
    // Método para calcular a matriz transposta
    public static int[][] calcularTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        int[][] transposta = new int[colunas][linhas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        return transposta;
    }
    
    // Método para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* 8o) Elaborar um programa, em linguagem Java, capaz de informar quando uma matriz
    qualquer é simétrica. Essa matriz deverá ser global e todos os seus elementos digitados.
    Uma matriz é dita simétrica quando ela for igual à sua transposta.
    */
    public static void exercicio8() {
         Scanner scanner = new Scanner(System.in);
    
            // Pedindo ao usuário para inserir o tamanho da matriz
            System.out.print("Digite o número de linhas da matriz: ");
            int linhas = scanner.nextInt();
            System.out.print("Digite o número de colunas da matriz: ");
            int colunas = scanner.nextInt();
    
            // Criando a matriz com base nos valores digitados pelo usuário
            matriz = new int[linhas][colunas];
    
            // Pedindo ao usuário para inserir os elementos da matriz
            System.out.println("Digite os elementos da matriz:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }
    
            // Verificando se a matriz é simétrica
            if (verificarSimetria()) {
                System.out.println("A matriz é simétrica.");
            } else {
                System.out.println("A matriz não é simétrica.");
            }
        }
    
        // Função para verificar se a matriz é simétrica
        static boolean verificarSimetria() {
            // Verificando se o número de linhas é igual ao número de colunas
            if (matriz.length != matriz[0].length) {
                return false;
            }
    
            // Verificando se a matriz é igual à sua transposta
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        return false;
                    }
                }
            }
    
            return true;
        }

    /* 9o) Determinar se uma matriz é identidade (ou unidade), através de um programa em
    linguagem Java. A matriz deverá ser global e todos os seus elementos digitados. Uma
    matriz é dita identidade (ou unidade) quando ela for quadrada (no. de linhas iguais ao no.
    de colunas), tiver todos os elementos de sua diagonal principal (no. da linha igual ao no.
    da coluna) iguais a 1 (um) e todos os demais elementos iguais a 0 (zero).
    */
    public static void exercicio9() {
        Scanner scanner = new Scanner(System.in);

        // Entrada do tamanho da matriz
        System.out.println("Digite o tamanho da matriz quadrada (n x n):");
        int tamanho = scanner.nextInt();

        // Inicializando a matriz com o tamanho fornecido
        matriz = new int[tamanho][tamanho];

        // Entrada dos elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificando se a matriz é uma matriz identidade
        if (verificarIdentidade()) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz NÃO é uma matriz identidade.");
        }

        scanner.close();
    }

    // Método para verificar se a matriz é identidade
    static boolean verificarIdentidade() {
        // Verificando se a matriz é quadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }

        // Verificando se todos os elementos da diagonal principal são iguais a 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                }
                // Verificando se todos os outros elementos são iguais a 0
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        // Se passar por todas as verificações, a matriz é identidade
        return true;
    }

    /* 10o) Um teatro possui 3000 lugares divididos em 30 fileiras, cada uma com 100 cadeiras.
    Elaborar um programa em linguagem Java, capaz de gerenciar a venda dos ingressos para
    este teatro. Cada lugar poderá estar Livre (0), Reservado (1) ou Vendido (2).
    */
    public static void exercicio10() {

    private static final int LIVRE = 0;
    private static final int RESERVADO = 1;
    private static final int VENDIDO = 2;
    private static final int NUMERO_FILEIRAS = 30;
    private static final int CADEIRAS_POR_FILEIRA = 100;
    private static int[][] lugares = new int[NUMERO_FILEIRAS][CADEIRAS_POR_FILEIRA];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Vender ingresso");
            System.out.println("2. Reservar ingresso");
            System.out.println("3. Verificar disponibilidade de lugares");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    venderIngresso();
                    break;
                case 2:
                    reservarIngresso();
                    break;
                case 3:
                    verificarDisponibilidade();
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void venderIngresso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Venda de ingresso:");
        System.out.print("Digite o número da fileira: ");
        int fileira = scanner.nextInt() - 1;
        System.out.print("Digite o número da cadeira: ");
        int cadeira = scanner.nextInt() - 1;

        if (validarLugar(fileira, cadeira)) {
            lugares[fileira][cadeira] = VENDIDO;
            System.out.println("Ingresso vendido com sucesso!");
        } else {
            System.out.println("Lugar indisponível. Por favor, escolha outro lugar.");
        }
    }

    private static void reservarIngresso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Reserva de ingresso:");
        System.out.print("Digite o número da fileira: ");
        int fileira = scanner.nextInt() - 1;
        System.out.print("Digite o número da cadeira: ");
        int cadeira = scanner.nextInt() - 1;

        if (validarLugar(fileira, cadeira)) {
            lugares[fileira][cadeira] = RESERVADO;
            System.out.println("Ingresso reservado com sucesso!");
        } else {
            System.out.println("Lugar indisponível. Por favor, escolha outro lugar.");
        }
    }

    private static void verificarDisponibilidade() {
        int lugaresLivres = 0;
        int lugaresReservados = 0;

        for (int i = 0; i < NUMERO_FILEIRAS; i++) {
            for (int j = 0; j < CADEIRAS_POR_FILEIRA; j++) {
                if (lugares[i][j] == LIVRE) {
                    lugaresLivres++;
                } else if (lugares[i][j] == RESERVADO) {
                    lugaresReservados++;
                }
            }
        }

        System.out.println("Disponibilidade de lugares:");
        System.out.println("Lugares livres: " + lugaresLivres);
        System.out.println("Lugares reservados: " + lugaresReservados);
    }

    private static boolean validarLugar(int fileira, int cadeira) {
        return fileira >= 0 && fileira < NUMERO_FILEIRAS && cadeira >= 0 && cadeira < CADEIRAS_POR_FILEIRA &&
                lugares[fileira][cadeira] == LIVRE;
    }
}


