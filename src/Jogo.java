import java.util.*;

// TODO Criar funcao que recebe a lista de alternativas das perguntas e embaralha

// Equacao de exemplo: x² – 5x + 6 = 0

public class Jogo {

    static Scanner entrada = new Scanner(System.in);
    static String personagem;

    // TODO Criar um texto de bem vindo para o jogo e incluir na função
    static void bemvindo() {
        // Imprime menssagem de boas vindas
        System.out.println("<Saudacoes de bem vindo aqui>");
    }

    static boolean valida(String modo, String entrada) {
        // Verifica se a entrada do usuario é valida
        String[] opcoes_validas = new String[]{"1", "2", "3", "4"};
        String[] letras_validas = new String[]{"A", "B", "C", "D", "E"};
        String[] sair_validas = new String[]{"S", "N"};
        List<String> lista;
        switch (modo) {
            case "opcao":
                lista = Arrays.asList(opcoes_validas);
                if (lista.contains(entrada)) return true;
            case "alternativa":
                lista = Arrays.asList(letras_validas);
                if (lista.contains(entrada)) return true;
            case "sair":
                lista = Arrays.asList(sair_validas);
                if (lista.contains(entrada)) return true;
            default:
                System.out.println("Entrada Invalida. Tente novamente");
        }
        return false;
    }

    static String pede_opcao() {
        // Exibe o menu e pede uma opcao
        String opcao;
        do {
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("  1 – Instruções\n"
                    + "  2 – Jogar\n"
                    + "  3 – Créditos\n"
                    + "  4 – Sair");
            opcao = entrada.next().toUpperCase();
        } while (!valida("opcao", opcao));
        return opcao;
    }

    static void define_nome_personagem() {
        // Pede e define o nome do personagem
        System.out.println();
        System.out.println("Durante o jogo, você interpretará o papel de ajudante do pirata Barba Verde. Defina o nome" +
                "do seu personagem: ");
        personagem = entrada.next();
    }

    // TODO Incluir a descrição da historia na funcao
    static void historia() {
        // Imprime a historia
        System.out.println("\n\n");
        System.out.println("<Descricao da historia aqui>");
    }

    // TODO Revisar as instrucoes do jogo
    static void instrucoes() {
        // Imprime as instruções do jogo
        System.out.println("\n\n");
        System.out.println("Instruções: ");
        System.out.println("  No jogo você interpretará o papel de um ajudante do pirata barba verde e deve ajuda-lo \n" +
                "resolvendo desafios e acertando as respostas das perguntas chave para chegarem ate o local onde o \n" +
                "tesouro está escondido e, ao final, resolver o desadio principal para que encontrem o tesouro.");
        System.out.println("\n\n");

    }

    static void creditos() {
        // Imprime os creditos do jogo
        System.out.println("Creditos: ");
        System.out.println("  Jogo desenvolvido para a disciplina de PI1 - Analise e desenvolvimento de Sistemas\n" +
                "    Integrantes: \n" +
                "      Bruna Marques\n" +
                "      Mayanni Maia\n" +
                "      Victor Santos\n" +
                "      Vitor Ribeiro\n" +
                "  Centro Universitario SENAC São Paulo");
    }

    static void sair() {
        // Finaliza a execucao do jogo
        String opcao;
        do {
            System.out.println("Tem certeza que deseja sair do jogo? (S ou N)");
            opcao = entrada.next().toUpperCase();
        } while (!valida("sair", opcao));
        switch (opcao) {
            case "S" -> {
                creditos();
                System.out.println("\n\nAté a proxima.");
                System.exit(0);
            }
            case "N" -> System.out.println("Que bom que continuará conosco.");
        }
    }

    // TODO Incluir as perguntas reais na função
    static void get_pergunta(Integer pergunta){
        // Define e retorna um dicionario com os valores de Pergunta:[Lista de alteranativas].
        // Neste retorno, por padrao a primeira alternativa será a correta.
        Dictionary<Integer,ArrayList<String>> perguntas = new Hashtable<>();

        // PERGUNTA 1
        ArrayList<String> pergunta1 = new ArrayList<>();
        pergunta1.add("<PERGUNTA 1>"); // PERGUNTA
        pergunta1.add("Correta"); // ALT CORRETA
        pergunta1.add("Incorreta");
        pergunta1.add("Incorreta");
        pergunta1.add("Incorreta");
        pergunta1.add("Incorreta");

        // PERGUNTA 2
        ArrayList<String> pergunta2 = new ArrayList<>();
        pergunta2.add("<PERGUNTA 2>"); // PERGUNTA
        pergunta2.add("Correta"); // ALT CORRETA
        pergunta2.add("Incorreta");
        pergunta2.add("Incorreta");
        pergunta2.add("Incorreta");
        pergunta2.add("Incorreta");

        // PERGUNTA 3
        ArrayList<String> pergunta3 = new ArrayList<>();
        pergunta3.add("<PERGUNTA 3>"); // PERGUNTA
        pergunta3.add("Correta"); // ALT CORRETA
        pergunta3.add("Incorreta");
        pergunta3.add("Incorreta");
        pergunta3.add("Incorreta");
        pergunta3.add("Incorreta");

        // PERGUNTA 4
        ArrayList<String> pergunta4 = new ArrayList<>();
        pergunta4.add("<PERGUNTA 4>"); // PERGUNTA
        pergunta4.add("Correta"); // ALT CORRETA
        pergunta4.add("Incorreta");
        pergunta4.add("Incorreta");
        pergunta4.add("Incorreta");
        pergunta4.add("Incorreta");

        perguntas.put(1, pergunta1);
        perguntas.put(2, pergunta2);
        perguntas.put(3, pergunta3);
        perguntas.put(4, pergunta4);

        switch (pergunta){
            case 1 -> System.out.println(perguntas.get(1));
            case 2 -> System.out.println(perguntas.get(2));
            case 3 -> System.out.println(perguntas.get(3));
            case 4 -> System.out.println(perguntas.get(4));
            default -> System.out.println("Pergunta nao existe.");
        }

    }

    static void jogar() {
        // Funcao principal do jogo
        historia();
        define_nome_personagem();
        get_pergunta(entrada.nextInt());
    }

    public static void main(String[] args) {
        bemvindo();
        while (true) {
            String opcao = pede_opcao();
            switch (opcao) {
                case "1" -> instrucoes();
                case "2" -> {
                    jogar();
                    String continuar;
                    do {
                        System.out.println("Chegamos ao final da partida. Gostaria de jogar novamente? (S ou N)");
                        continuar = entrada.next().toUpperCase();
                    } while (!valida("sair", continuar));
                    if (continuar.equals("N")) {
                        creditos();
                        System.exit(0);
                    }
                }
                case "3" -> creditos();
                case "4" -> sair();
            }
        }


    }

}