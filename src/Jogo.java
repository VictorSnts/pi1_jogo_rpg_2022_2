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

    static String define_nome_personagem() {
        // Pede e define o nome do personagem
        System.out.println();
        System.out.println("Defina o nome do seu personagem: ");
        return entrada.next();
    }

    // TODO Incluir a descrição da historia na funcao
    static void historia(Integer part) {
        // Imprime a historia

        System.out.println();
        personagem = define_nome_personagem();
        switch (part){
            case 0 -> System.out.println("INCIO DA HISTORIA: \n" +
                    "Em uma semana típica de inverno, um famoso capitão que já teria dirigido as maiores expedições realizadas, conhecido popularmente em sua cidade como Pirata Barba Verde, organizou mais uma grande viagem.\n" +
                    "\n" +
                    "Essa viagem teria como destino o litoral brasileiro, com a finalidade de fazer um reconhecimento geográfico e cultural do Brasil, que era muito pouco conhecido na Itália daquela época. A única informação que tinham era que o território brasileiro era extremamente grande.\n" +
                    "\n" +
                    "Barba Verde, acompanhado de um de seus ajudantes <NOME PERSONAGEM> e de seu fiel escudeiro, Louro (um papagaio da espécie ecletus, tão felpudo quanto a própria barba do Pirata Barba Verde), finalizaram os preparativos para a viagem e partiram.\n" +
                    "\n" +
                    "Era uma noite fria de inverno e o tempo não estava nada bom. Barba Verde navegava com cautela, prestando muita atenção no caminho e nos seus instrumentos de navegação.\n" +
                    "\n" +
                    "Em poucas horas de viagem, a tempestade que os acompanhava desde a partida ficou ainda pior.  O vento e a chuva extremamente fortes dificultavam muito a navegação e a interpretação dos instrumentos. Barba Verde, mesmo com tanta experiencia em navegação, acabou, sem perceber, saído da rota planejada. \n" +
                    "\n" +
                    "Perto do amanhecer, a tempestade teria passado e, estranhamente, o tempo estava bom, o dia estava lindo e perfeito para navegação, então o capitão então continuou navegando para direção que achava estar correta, até que avistaram terra firme logo a frente. Isso foi estranho para ele, porque a viagem de ida duraria alguns dias e não teria passado nem 15 horas desde a partida, mesmo assim, resolveram ir até a terra para descansar um pouco após a longa e tensa noite que teriam passado e para decidir para qual direção seguir para chegarem ao Brasil.\n" +
                    "\n" +
                    "Chegando em terra firme, eles puderam perceber que não se tratava de um continente, e sim de uma ilha não muito grande. Barba Verde e seu ajudante <NOME DO PERSONAGEM> se deitaram sob alguns coqueiros para tirar um cochilo antes de discutirem sobre o caminho que seguiriam. Enquanto isso, Louro sobrevoava a ilha empolgado, pois era um local totalmente diferente dos que conhecia na costa europeia.\n" +
                    "\n" +
                    "Poucos minutos depois, Barba Verde foi acordado por Louro, que carregava uma garrafa com um pergaminho dentro. O capitão, bravo pelo papagaio ter o acordado, quebra a garrafa e decide ver o que estava escrito no pergaminho.\n" +
                    "\n" +
                    "Ao pegá-lo em suas mãos, consegue ler as seguintes palavras: “Este pergaminho está encantado e pode te levar até o tesouro mais valioso de todos os tempos. Para encontrá-lo você precisa resolver alguns desafios matemáticos para, ao final, formar uma equação de 2º Grau. Você só chegará ao local do tesouro quando encontrar o X da equação. São <NRO DE DESAFIOS> e eles aparecerão magicamente. Caso erre a resposta de algum dos desafios, não se preocupe, pois te darei algumas dicas de como resolvê-los.”\n" +
                    "\n" +
                    "Após ler o pergaminho, o Pirata Barba Verde ficou animado para encontrar o tesouro, mas ele não era muito bom em matemática. Por isso, acordou seu ajudante <NOME DO PERSONAGEM> e perguntou: \n");
        }
    }

    // TODO Revisar as instrucoes do jogo
    static void instrucoes() {
        // Imprime as instruções do jogo
        System.out.println();
        System.out.println("Instruções: ");
        System.out.println("  No jogo você interpretará o papel de um ajudante do pirata barba verde e deve ajuda-lo \n" +
                "resolvendo desafios e acertando as respostas das perguntas chave para chegarem ate o local onde o \n" +
                "tesouro está escondido e, ao final, resolver o desadio principal para que encontrem o tesouro.");
        System.out.println();

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
    static Dictionary<Integer,ArrayList<String>> define_perguntas(){
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

        return perguntas;
    }

    static void jogar() {
        // Funcao principal do jogo
        instrucoes();
        historia(0);
        /*get_pergunta(1);
        get_pergunta(2);
        get_pergunta(3);
        get_pergunta(4);*/
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