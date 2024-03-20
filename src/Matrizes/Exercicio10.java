/*
    10) Um teatro possui 3000 lugares divididos em 30 fileiras, cada uma com 100 cadeiras.
    Elaborar um programa em linguagem Java, capaz de gerenciar a venda dos ingressos para
    este teatro. Cada lugar poderá estar Livre (0), Reservado (1) ou Vendido (2).

*/
package Matrizes;

import java.util.Scanner;

public class Exercicio10 {
    
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
