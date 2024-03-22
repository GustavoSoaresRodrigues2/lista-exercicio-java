/*
    37) Em um serviço de check-in de uma companhia aérea, após a apresentação de seu
    R.G, o passageiro deve receber o primeiro número do assento vago disponível na
    aeronave, afim de realizar sua viagem. Para isto, a companhia aérea conta com um
    programa, realizado em linguagem Java. Esse programa informa ao operador, quando
    solicitado, o número do primeiro assento que estiver vago. Após isto, o operador digita o
    número do R.G. do passageiro, para realizar a reserva do assento. O programa deverá
    informar quando o avião estiver lotado e em que assento encontra-se determinado R.G.
    digitado. Deverão existir opções para cancelar a reserva de um determinado assento e
    para cancelar todas as reservas de assento de uma só vez. Elaborar este programa.
*/
package Busca_Linear;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio37 {
    
    static class Assento {
        private String rg;
        private boolean ocupado;
    
        public Assento() {
            this.ocupado = false;
        }
    
        public String getRG() {
            return rg;
        }
    
        public void reservar(String rg) {
            this.ocupado = true;
            this.rg = rg;
        }
    
        public void cancelarReserva() {
            this.ocupado = false;
            this.rg = null;
        }
    
        public boolean estaOcupado() {
            return ocupado;
        }
    }

    private static ArrayList<Assento> assentos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao serviço de check-in da companhia aérea!");

        // Inicializando os assentos
        for (int i = 0; i < 100; i++) {
            assentos.add(new Assento());
        }

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Verificar próximo assento disponível");
            System.out.println("2. Reservar assento");
            System.out.println("3. Cancelar reserva de um assento");
            System.out.println("4. Cancelar todas as reservas");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    verificarProximoAssentoDisponivel();
                    break;
                case 2:
                    reservarAssento(scanner);
                    break;
                case 3:
                    cancelarReservaAssento(scanner);
                    break;
                case 4:
                    cancelarTodasReservas();
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar nosso serviço de check-in!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void verificarProximoAssentoDisponivel() {
        for (int i = 0; i < assentos.size(); i++) {
            if (!assentos.get(i).estaOcupado()) {
                System.out.println("Próximo assento disponível: " + (i + 1));
                return;
            }
        }
        System.out.println("Todos os assentos estão ocupados.");
    }

    private static void reservarAssento(Scanner scanner) {
        System.out.print("Digite o número do RG do passageiro: ");
        String rg = scanner.next();

        for (int i = 0; i < assentos.size(); i++) {
            if (!assentos.get(i).estaOcupado()) {
                assentos.get(i).reservar(rg);
                System.out.println("Assento " + (i + 1) + " reservado para o passageiro com RG " + rg);
                return;
            }
        }
        System.out.println("Não há assentos disponíveis para reserva.");
    }

    private static void cancelarReservaAssento(Scanner scanner) {
        System.out.print("Digite o número do assento a cancelar a reserva: ");
        int numAssento = scanner.nextInt();

        if (numAssento < 1 || numAssento > assentos.size()) {
            System.out.println("Número de assento inválido.");
            return;
        }

        Assento assento = assentos.get(numAssento - 1);
        if (assento.estaOcupado()) {
            assento.cancelarReserva();
            System.out.println("Reserva do assento " + numAssento + " cancelada com sucesso.");
        } else {
            System.out.println("O assento selecionado não está ocupado.");
        }
    }

    private static void cancelarTodasReservas() {
        for (Assento assento : assentos) {
            assento.cancelarReserva();
        }
        System.out.println("Todas as reservas foram canceladas.");
    }
}
