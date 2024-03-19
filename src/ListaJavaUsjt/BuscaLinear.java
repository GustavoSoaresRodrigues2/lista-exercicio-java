package ListaJavaUsjt;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaLinear {

    /* 32o) Elaborar um programa, em linguagem Java, capaz de carregar, em um vetor do tipo
    int, 15 números digitados pelo operador, formando uma espécie de base de dados. Após
    isto, o programa deverá solicitar a digitação de outro número, denominado número de
    busca, o qual será localizado no vetor anterior. O programa deverá apresentar, em tela, o
    resultado de uma busca linear, informando o índice do vetor no qual se encontra o número
    de busca (utilizar o tamanho máximo do vetor como terminador da operação, caso o
    número de busca não seja localizado). A busca linear deverá ser um método que se utilize
    de passagem de parâmetros e o vetor não deverá ser variável global do programa.
    */

    public static void exercicio32() {
        Scanner scanner = new Scanner(System.in);

        // Criando vetor para armazenar os números
        int[] vetor = new int[15];

        // Pedindo ao usuário para digitar os números
        System.out.println("Digite 15 números:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Pedindo ao usuário para digitar o número de busca
        System.out.print("Digite o número que deseja buscar: ");
        int numeroBusca = scanner.nextInt();

        // Chamando o método de busca linear
        int indice = buscaLinear(vetor, numeroBusca);

        // Verificando o resultado da busca
        if (indice != -1) {
            System.out.println("O número " + numeroBusca + " foi encontrado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
        }
    }

    // Método para busca linear
    public static int buscaLinear(int[] vetor, int numeroBusca) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBusca) {
                return i; // Retorna o índice onde o número foi encontrado
            }
        }
        return -1; // Retorna -1 se o número não for encontrado no vetor
    }




    /* 33o) Elaborar um programa, em linguagem Java, capaz de carregar uma String, com 15
    caracteres, digitada, em um vetor do tipo char, com 15 posições, formando uma espécie
    de base de dados. Após isto, o programa deverá solicitar a digitação de um caractere,
    denominado caractere de busca, o qual será localizado no vetor anterior. O programa
    deverá apresentar, em tela, o resultado de uma busca linear, informando o índice do vetor
    no qual se encontra o caractere de busca (utilizar o tamanho máximo do vetor como
    terminador da operação, caso o caractere de busca não seja localizado). A busca linear
    deverá ser um método que se utilize de passagem de parâmetros e o vetor não deverá ser
    uma variável global do programa.
    */
    public static void exercicio33() {
            Scanner scanner = new Scanner(System.in);
    
            // Carregar a String em um vetor de char
            char[] vetor = new char[15];
            System.out.println("Digite uma string de 15 caracteres:");
            String inputString = scanner.nextLine();
    
            // Verificar se a string digitada possui 15 caracteres
            if (inputString.length() != 15) {
                System.out.println("A string digitada não possui 15 caracteres. Por favor, tente novamente.");
                return;
            }
    
            // Preencher o vetor com os caracteres da string
            for (int i = 0; i < 15; i++) {
                vetor[i] = inputString.charAt(i);
            }
    
            // Solicitar o caractere de busca
            System.out.println("Digite o caractere que deseja buscar:");
            char caractereBusca = scanner.next().charAt(0);
    
            // Realizar a busca linear
            int indice = buscaLinear(vetor, caractereBusca);
    
            // Exibir o resultado da busca
            if (indice != -1) {
                System.out.println("O caractere " + caractereBusca + " foi encontrado no índice " + indice + ".");
            } else {
                System.out.println("O caractere " + caractereBusca + " não foi encontrado no vetor.");
            }
        }
    
        // Método para realizar busca linear em um vetor de char
        public static int buscaLinear(char[] vetor, char caractereBusca) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == caractereBusca) {
                    return i;
                }
            }
            // Retorna -1 se o caractere não for encontrado
            return -1;
        }
    

    /* 34o) Elaborar um programa, em linguagem Java, capaz de carregar uma String, digitada
    em um vetor do tipo char, com no máximo 15 posições, formando uma espécie de base
    de dados. Após isto, o programa deverá solicitar a digitação de um caractere, denominado
    caractere de busca, o qual será localizado no vetor anterior. O programa deverá
    apresentar, em tela, o resultado de uma busca linear, informando o índice do vetor no qual
    se encontra o caractere de busca (utilizar o tamanho máximo do vetor ou o tamanho
    máximo da String digitada como terminadores da operação, caso o caractere de busca não
    seja localizado). A busca linear deverá ser um método que se utilize de passagem de
    parâmetros e o vetor não deverá ser uma variável global do programa.
    */
    public static void exercicio34() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite a string
        System.out.print("Digite uma string com no máximo 15 caracteres: ");
        String input = scanner.nextLine();

        // Verificar se a string tem mais que 15 caracteres
        if (input.length() > 15) {
            System.out.println("A string excede o limite de 15 caracteres.");
            return;
        }

        // Transformar a string em um vetor de char
        char[] vetor = input.toCharArray();

        // Solicitar ao usuário que digite o caractere de busca
        System.out.print("Digite o caractere de busca: ");
        char busca = scanner.next().charAt(0);

        // Realizar a busca linear
        int resultado = buscaLinear(vetor, busca);

        // Apresentar o resultado
        if (resultado == -1) {
            System.out.println("O caractere de busca não foi encontrado.");
        } else {
            System.out.println("O caractere de busca foi encontrado no índice: " + resultado);
        }
    }

    // Método para busca linear
    public static int buscaLinear2(char[] vetor, char busca) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                return i; // Retorna o índice onde o caractere foi encontrado
            }
        }
        return -1; // Retorna -1 se o caractere não for encontrado
    }

    /* 35o) Elaborar um programa, em linguagem Java, capaz de controlar os dados de uma
    prova de atletismo, onde, via matriz, possamos armazenar, através de digitação, a
    quantidade de corredores inscritos na prova, o número de inscrição de cada um, sua
    posição de chegada e seu respectivo tempo de prova, conforme os mesmos forem
    passando pela linha de chegada. Os atletas inscritos que não ultrapassarem a linha de
    chegada deverão ter cadastrados 0 (zero) para a posição de chegada e tempo de prova. Ao
    término da digitação, o programa deverá realizar a busca da posição de chegada e do
    tempo de prova, para um determinado corredor, dada a digitação de seu número de
    inscrição. Utilizar matriz para armazenamento das informações, porém não sendo globais.
    O número de inscrição deve ser variável do tipo int. O tempo de prova deve ser em
    segundos e armazenado em variável do tipo int.
    */
    public static void exercicio35() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de corredores inscritos na prova:");
        int quantidadeCorredores = scanner.nextInt();

        // Declaração da matriz para armazenar as informações dos corredores
        int[][] dadosCorredores = new int[quantidadeCorredores][3]; // [Nº de inscrição, posição de chegada, tempo de prova]

        // Preenchimento dos dados dos corredores
        for (int i = 0; i < quantidadeCorredores; i++) {
            System.out.println("Digite o número de inscrição do corredor " + (i + 1) + ":");
            dadosCorredores[i][0] = scanner.nextInt();

            System.out.println("Digite a posição de chegada do corredor " + (i + 1) + ":");
            dadosCorredores[i][1] = scanner.nextInt();

            System.out.println("Digite o tempo de prova (em segundos) do corredor " + (i + 1) + ":");
            dadosCorredores[i][2] = scanner.nextInt();
        }

        // Busca de informações de um corredor pelo número de inscrição
        System.out.println("Digite o número de inscrição do corredor para buscar suas informações:");
        int numeroInscricaoBusca = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < quantidadeCorredores; i++) {
            if (dadosCorredores[i][0] == numeroInscricaoBusca) {
                encontrado = true;
                System.out.println("Informações do corredor:");
                System.out.println("Número de inscrição: " + dadosCorredores[i][0]);
                System.out.println("Posição de chegada: " + dadosCorredores[i][1]);
                System.out.println("Tempo de prova (em segundos): " + dadosCorredores[i][2]);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Corredor não encontrado.");
        }

        scanner.close();
    }

    /* 36o) Elaborar um programa, em linguagem Java, que receba, via digitação, a quantidade
    de alunos matriculados em uma universidade e apresente um menu contendo 3
    possibilidades de escolha para o operador, realizando as respectivas funções:
    A) Cadastrar RA de todos os alunos matriculados. (Utilizar um vetor do tipo int
    para o RA, ocupando os mesmos índices do respectivo vetor de NOTA);
    B) Cadastrar NOTA de prova para todos os alunos matriculados. (Utilizar um
    vetor do tipo double para a NOTA, ocupando os mesmos índices do respectivo
    vetor de RA);
    C) Realizar a busca linear e apresentar a NOTA para um determinado RA, a ser
    digitado;
    D) Sair do programa.
    */
    public static void exercicio36() {
    
    public static int[] raAlunos;
    public static double[] notasAlunos;
    public static int quantidadeAlunos;
    public static Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema da universidade!");

        System.out.print("Digite a quantidade de alunos matriculados: ");
        quantidadeAlunos = scanner.nextInt();
        raAlunos = new int[quantidadeAlunos];
        notasAlunos = new double[quantidadeAlunos];

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarRA();
                    break;
                case 2:
                    cadastrarNotas();
                    break;
                case 3:
                    buscarNotaPorRA();
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1) Cadastrar RA dos alunos");
        System.out.println("2) Cadastrar notas dos alunos");
        System.out.println("3) Buscar nota por RA");
        System.out.println("4) Sair do programa");
        System.out.print("Opção: ");
    }

    private static void cadastrarRA() {
        System.out.println("\nDigite o RA de cada aluno:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("RA do aluno " + (i + 1) + ": ");
            raAlunos[i] = scanner.nextInt();
        }
        System.out.println("RA cadastrado com sucesso.");
    }

    private static void cadastrarNotas() {
        System.out.println("\nDigite a nota de cada aluno:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notasAlunos[i] = scanner.nextDouble();
        }
        System.out.println("Notas cadastradas com sucesso.");
    }

    private static void buscarNotaPorRA() {
        System.out.print("\nDigite o RA do aluno que deseja buscar: ");
        int raBusca = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (raAlunos[i] == raBusca) {
                System.out.println("Nota do aluno com RA " + raBusca + ": " + notasAlunos[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("RA não encontrado.");
        }
    }

    /* 37o) Em um serviço de check-in de uma companhia aérea, após a apresentação de seu
    R.G, o passageiro deve receber o primeiro número do assento vago disponível na
    aeronave, afim de realizar sua viagem. Para isto, a companhia aérea conta com um
    programa, realizado em linguagem Java. Esse programa informa ao operador, quando
    solicitado, o número do primeiro assento que estiver vago. Após isto, o operador digita o
    número do R.G. do passageiro, para realizar a reserva do assento. O programa deverá
    informar quando o avião estiver lotado e em que assento encontra-se determinado R.G.
    digitado. Deverão existir opções para cancelar a reserva de um determinado assento e
    para cancelar todas as reservas de assento de uma só vez. Elaborar este programa.
    */
    public static void exercicio37() {
 
class Assento {
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

    /* 38o) Elaborar um programa, em linguagem Java, que utilize apenas métodos iterativos,
    capaz de receber, via teclado, 10 elementos tipo double de um vetor e um outro elemento
    tipo double com o qual será feita uma busca linear no vetor digitado, ao longo de todos
    os seus índices, no sentido do menor índice para o maior índice. O programa deverá
    informar o valor do maior índice do vetor que contém o elemento igual ao valor digitado.
    Ex.:
    Índice: 0 1 2 3 4 5 6 7 8 9
    Elementos Digitados: 7 3 4 5 8 4 7 4 9 8
    Número Digitado: 4 → Resposta: O número 4 está localizado no índice 7 do vetor.
    */
    public static void exercicio38() {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];
        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Digite o elemento a ser buscado:");
        double elementoBuscado = scanner.nextDouble();

        int indice = buscarElemento(vetor, elementoBuscado);
        if (indice != -1) {
            System.out.println("O número " + elementoBuscado + " está localizado no índice " + indice + " do vetor.");
        } else {
            System.out.println("O número " + elementoBuscado + " não foi encontrado no vetor.");
        }
    }

    public static int buscarElemento(double[] vetor, double elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado no vetor
    }
}

