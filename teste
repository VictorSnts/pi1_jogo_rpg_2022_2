import java.util.*;

// Equacao de exemplo: ð‘¥2 + 9ð‘¥ + 20 = 0
// Equacao de exemplo: Ax2 - Bð‘¥  C = 0

public class Jogo {

    static Scanner entrada = new Scanner(System.in);
    static String personagem;
    static Dictionary<Integer,ArrayList<String>> dict_perguntas = define_perguntas();


    // TODO Criar um texto de bem vindo para o jogo e incluir na funÃ§Ã£o
    static void bemvindo() {
        // Imprime menssagem de boas vindas
        System.out.println("<Saudacoes de bem vindo aqui>");
    }

    static boolean valida(String modo, String entrada) {
        // Verifica se a entrada do usuario Ã© valida
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
            System.out.println("Selecione uma das opÃ§Ãµes abaixo:");
            System.out.println("  1 â€“ InstruÃ§Ãµes\n"
                    + "  2 â€“ Jogar\n"
                    + "  3 â€“ CrÃ©ditos\n"
                    + "  4 â€“ Sair");
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

    // TODO Incluir a descriÃ§Ã£o da historia na funcao
    static void historia(Integer part) {
        // Imprime a historia

        System.out.println();
        switch (part){
            case 0:
                personagem = define_nome_personagem();
                System.out.println("INCIO DA HISTORIA: \n" +
                        "Em uma semana tÃ­pica de inverno, um famoso capitÃ£o que jÃ¡ teria dirigido as maiores expediÃ§Ãµes realizadas, conhecido popularmente em sua cidade como Pirata Barba Verde, organizou mais uma grande viagem.\n" +
                        "\n" +
                        "Essa viagem teria como destino o litoral brasileiro, com a finalidade de fazer um reconhecimento geogrÃ¡fico e cultural do Brasil, que era muito pouco conhecido na ItÃ¡lia daquela Ã©poca. A Ãºnica informaÃ§Ã£o que tinham era que o territÃ³rio brasileiro era extremamente grande.\n" +
                        "\n" +
                        "Barba Verde, acompanhado de um de seus ajudantes " + personagem + " e de seu fiel escudeiro, Louro (um papagaio da espÃ©cie ecletus, tÃ£o felpudo quanto a prÃ³pria barba do Pirata Barba Verde), finalizaram os preparativos para a viagem e partiram.\n" +
                        "\n" +
                        "Era uma noite fria de inverno e o tempo nÃ£o estava nada bom. Barba Verde navegava com cautela, prestando muita atenÃ§Ã£o no caminho e nos seus instrumentos de navegaÃ§Ã£o.\n" +
                        "\n" +
                        "Em poucas horas de viagem, a tempestade que os acompanhava desde a partida ficou ainda pior. O vento e a chuva extremamente fortes dificultavam muito a navegaÃ§Ã£o e a interpretaÃ§Ã£o dos instrumentos. Barba Verde, mesmo com tanta experiencia em navegaÃ§Ã£o, acabou, sem perceber, saÃ­do da rota planejada. \n" +
                        "\n" +
                        "Perto do amanhecer, a tempestade teria passado e, estranhamente, o tempo estava bom, o dia estava lindo e perfeito para navegaÃ§Ã£o, entÃ£o o capitÃ£o entÃ£o continuou navegando para direÃ§Ã£o que achava estar correta, atÃ© que avistaram terra firme logo a frente. Isso foi estranho para ele, porque a viagem de ida duraria alguns dias e nÃ£o teria passado nem 15 horas desde a partida, mesmo assim, resolveram ir atÃ© a terra para descansar um pouco apÃ³s a longa e tensa noite que teriam passado e para decidir para qual direÃ§Ã£o seguir para chegarem ao Brasil.\n" +
                        "\n" +
                        "Chegando em terra firme, eles puderam perceber que nÃ£o se tratava de um continente, e sim de uma ilha nÃ£o muito grande. Barba Verde e seu ajudante " + personagem + " se deitaram sob alguns coqueiros para tirar um cochilo antes de discutirem sobre o caminho que seguiriam. Enquanto isso, Louro sobrevoava a ilha empolgado, pois era um local totalmente diferente dos que conhecia na costa europeia.\n" +
                        "\n" +
                        "Poucos minutos depois, Barba Verde foi acordado por Louro, que carregava uma garrafa com um pergaminho dentro. O capitÃ£o, bravo pelo papagaio ter o acordado, quebra a garrafa e decide ver o que estava escrito no pergaminho.\n" +
                        "\n" +
                        "Ao pegÃ¡-lo em suas mÃ£os, consegue ler as seguintes palavras: â€œEste pergaminho estÃ¡ encantado e pode te levar atÃ© o tesouro mais valioso de todos os tempos. Para encontrÃ¡-lo vocÃª precisa resolver alguns desafios matemÃ¡ticos para, ao final, formar uma equaÃ§Ã£o de 2Âº Grau. VocÃª sÃ³ chegarÃ¡ ao local do tesouro quando encontrar o X da equaÃ§Ã£o. SÃ£o <NRO DE DESAFIOS> e eles aparecerÃ£o magicamente. Caso erre a resposta dalgum dos desafios, nÃ£o se preocupe, pois te darei algumas dicas de como resolvÃª-los.â€\n" +
                        "\n" +
                        "ApÃ³s ler o pergaminho, o Pirata Barba Verde ficou animado para encontrar o tesouro, mas ele nÃ£o era muito bom em matemÃ¡tica. Por isso, acordou seu ajudante " + personagem + " e perguntou:" +
                        " \n");

            case 1:
                System.out.println("A primeira coisa que vocÃªs devem fazer Ã© encontrar o ponto de partida." +
                        "\n" +
                        " Pra sua sorte o ponto de partida Ã© entre os dois coqueiros que voces tiravam um cochilo alguns instantes antes. Podemos comeÃ§ar os desafios. " +
                        "\n ");
        }
    }

    // TODO Revisar as instrucoes do jogo
    static void instrucoes() {
        // Imprime as instruÃ§Ãµes do jogo
        System.out.println();
        System.out.println("InstruÃ§Ãµes: ");
        System.out.println("  No jogo vocÃª interpretarÃ¡ o papel de um ajudante do pirata barba verde e deve ajuda-lo " +
                "respondendo as perguntas e resolvendo desafios chave para revelarem as instrucoes que os faram " +
                "chegar ate o local onde o tesouro estÃ¡ escondido e, ao final, resolver o desafio principal para que " +
                "encontrem o tesouro." +
                "\n" +
                " NÃ£o se preoculpe se errar a resposta de algumas das perguntas. Caso isso aconteÃ§a voce terÃ¡ alguma" +
                "referencia para consultar e te auxiliar na resoluÃ§Ã£o, mas tome cuidado. Se voce errar 3 vezes a mesma" +
                "pergunta nunca mais serÃ¡ possivel chegar ate o tesouro." +
                "\n");
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
                "  Centro Universitario SENAC SÃ£o Paulo");
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
                System.out.println("\n\nAtÃ© a proxima.");
                System.exit(0);
            }
            case "N" -> System.out.println("Que bom que continuarÃ¡ conosco.");
        }
    }

    // TODO Incluir as perguntas reais na funÃ§Ã£o
    static Dictionary<Integer, ArrayList<String>> define_perguntas(){
        // Define e retorna um dicionario com os valores de Pergunta:[Lista de alteranativas].
        // Neste retorno, por padrao a primeira alternativa serÃ¡ a correta.
        Dictionary<Integer,ArrayList<String>> perguntas = new Hashtable<>();

        // PERGUNTA 1
        ArrayList<String> pergunta1 = new ArrayList<>();
        pergunta1.add("PERGUNTA 1: \n  O que Ã© a potenciaÃ§Ã£o?"); // PERGUNTA
        pergunta1.add("A potenciaÃ§Ã£o Ã© a operaÃ§Ã£o matemÃ¡tica que representa a multiplicaÃ§Ã£o de fatores iguais."); // ALT CORRETA
        pergunta1.add("A potenciaÃ§Ã£o Ã© a operaÃ§Ã£o matemÃ¡tica que representa a multiplicaÃ§Ã£o de fatores distintos.");
        pergunta1.add("A potenciaÃ§Ã£o Ã© a operaÃ§Ã£o matemÃ¡tica que representa a divisÃ£o de fatores iguais.");
        pergunta1.add("A potenciaÃ§Ã£o Ã© a operaÃ§Ã£o matemÃ¡tica que representa a divisÃ£o de fatores distintos.");
        pergunta1.add("A potenciaÃ§Ã£o Ã© a operaÃ§Ã£o matemÃ¡tica que representa a soma de fatores iguais.");
        pergunta1.add("Opa, voce errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://www.todamateria.com.br/potenciacao/)");
        pergunta1.add("OBA! Voce acertou a resposta! DÃª 10 passos ao sul para revelar o proximo desafio.");

        // PERGUNTA 2
        // TODO Verificar necessidade de alterar a divisao de potencias e alterar instrucoes
        ArrayList<String> pergunta2 = new ArrayList<>();
        pergunta2.add("PERGUNTA 2: \n A primeira coisa que devemos fazer Ã© nos localizar e vocÃªs jÃ¡ fizeram isso. " +
                "Agora o prÃ³ximo passo Ã© resolver a seguinte divisÃ£o de potÃªncias: 2^3/4^1"); // PERGUNTA
        pergunta2.add("2"); // ALT CORRETA
        pergunta2.add("4");
        pergunta2.add("-2");
        pergunta2.add("1");
        pergunta2.add("-4");
        pergunta2.add("Opa, voce errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://edu.gcfglobal.org/pt/algebra/como-dividir-potencias/1/)");
        pergunta2.add("OBA! VocÃª acertou a resposta! DÃª 8 passos ao Leste para revelar o prÃ³ximo desafio.");

        // PERGUNTA 3
        ArrayList<String> pergunta3 = new ArrayList<>();
        pergunta3.add("PERGUNTA 3: \n  Quais das alternativas abaixo representa melhor o que Ã© um sistema numÃ©rico?"); // PERGUNTA
        pergunta3.add("Uma espÃ©cie de linguagem que se adapta de acordo com a cultura e a necessidade dos povos baseada em algarismos e a organizaÃ§Ã£o da sua representaÃ§Ã£o."); // ALT CORRETA
        pergunta3.add("Conjuntos de dispositivos eletrÃ´nicos (hardware) capazes de processar informaÃ§Ãµes de acordo com um programa (software).");
        pergunta3.add("Um dos principais sistemas do corpo humano responsÃ¡veis por fazer o transporte do oxigÃªnio pelo corpo.");
        pergunta3.add("Um software, ou um conjunto de softwares, cujo papel Ã© gerenciar e administrar todos os recursos presentes em um sistema de computador.");
        pergunta3.add("Um conjunto de corpos celestes que gravitam na Ã³rbita de um sol (uma estrela).");
        pergunta3.add("Opa, vocÃª errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://mundoeducacao.uol.com.br/matematica/sistema-numeracao.htm)");
        pergunta3.add("OBA! VocÃª acertou a resposta! DÃª 10 passos ao Norte para revelar o prÃ³ximo desafio.");

        // PERGUNTA 4
        // TODO Verificar necessidade de alterar nro binario, incluir ajuda e alterar instrucoes de acordo com o resultado
        ArrayList<String> pergunta4 = new ArrayList<>();
        pergunta4.add("PERGUNTA 4: \n  Agora para saber quantos passos vocÃª vai dar ao Sul. " +
                "Para isso, vocÃª vai precisar converter o numero binÃ¡rio 0011 em nÃºmero decimal, vocÃª consegue? " +
                "Indique a alternativa correta: "); // PERGUNTA
        pergunta4.add("3"); // ALT CORRETA
        pergunta4.add("2");
        pergunta4.add("1");
        pergunta4.add("4");
        pergunta4.add("5");
        pergunta4.add("Opa, vocÃª errou a resposta. Aqui vai uma referÃªncia para vocÃª se basear na prÃ³xima tentativa: (https://mundoeducacao.uol.com.br/matematica/sistema-numeracao.htm)");
        pergunta4.add("OBA! VocÃª acertou a resposta! DÃª 5 passos ao Norte para revelar o prÃ³ximo desafio.");


        // PERGUNTA 5
        ArrayList<String> pergunta5 = new ArrayList<>();
        pergunta5.add("PERGUNTA 5: \n  Qual das alternativas abaixo representa melhor o que Ã© a operaÃ§Ã£o matemÃ¡tica RadiciaÃ§Ã£o?"); // PERGUNTA
        pergunta5.add("A operaÃ§Ã£o matemÃ¡tica inversa da potenciaÃ§Ã£o."); // ALT CORRETA
        pergunta5.add("A operaÃ§Ã£o matemÃ¡tica inversa da multiplicaÃ§Ã£o.");
        pergunta5.add("A operaÃ§Ã£o matemÃ¡tica inversa da fatoraÃ§Ã£o.");
        pergunta5.add("A operaÃ§Ã£o matemÃ¡tica inversa da diferenciaÃ§Ã£o.");
        pergunta5.add("A operaÃ§Ã£o matemÃ¡tica inversa da divisÃ£o.");
        pergunta5.add("Opa, voce errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://mundoeducacao.uol.com.br/matematica/sistema-numeracao.htm)");
        pergunta5.add("OBA! Voce acertou a resposta! DÃª 45 passos ao sul para revelar o proximo desafio.");

        // PERGUNTA 6
        ArrayList<String> pergunta6 = new ArrayList<>();
        pergunta6.add("PERGUNTA 6: \n  Voce tem uma nova informacao. Essa ilha tem o formato de um quadrado e area de 2025km2." +
                "Usando a RadiciaÃ§Ã£o, calcule e informe a alternativa que contem o valor do tamanho (em quilometros) da faixa de areia de um dos lados da ilha:"); // PERGUNTA
        pergunta6.add("45 Km"); // ALT CORRETA
        pergunta6.add("25 Km");
        pergunta6.add("9 Km");
        pergunta6.add("75 Km");
        pergunta6.add("18 Km");
        pergunta6.add("Opa, voce errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://mundoeducacao.uol.com.br/matematica/sistema-numeracao.htm)");
        pergunta6.add("OBA! Voce acertou a resposta! DÃª 45 passos ao sul para revelar o proximo desafio.");


        // PERGUNTA 7
        ArrayList<String> pergunta7 = new ArrayList<>();
        pergunta7.add("DivisÃ£o de potÃªncia teorico"); // PERGUNTA
        pergunta7.add("2"); // ALT CORRETA
        pergunta7.add("errada");
        pergunta7.add("errada");
        pergunta7.add("errada");
        pergunta7.add("errada");
        pergunta7.add("Opa, voce errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://mundoeducacao.uol.com.br/matematica/sistema-numeracao.htm)");
        pergunta7.add("OBA! Voce acertou a resposta! DÃª 10 passos ao sul para revelar o proximo desafio.");


        // PERGUNTA 8
        ArrayList<String> pergunta8 = new ArrayList<>();
        pergunta8.add("Agora vocÃª precisa se lembrar de todos os passos que vocÃªs deram e colocÃ¡-los na fÃ³rmula de bhaskara." +
                "Louro assoprou pra te ajudar" +
                "A= 2" +
                "B= 3" +
                "C= 3"); // PERGUNTA
                pergunta8.add("2"); // ALT CORRETA
        pergunta8.add("errada");
        pergunta8.add("errada");
        pergunta8.add("errada");
        pergunta8.add("errada");
        pergunta8.add("Opa, voce errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://mundoeducacao.uol.com.br/matematica/sistema-numeracao.htm)");
        pergunta8.add("OBA! Voce acertou a resposta! DÃª 10 passos ao sul para revelar o proximo desafio.");


        // PERGUNTA 9
        ArrayList<String> pergunta9 = new ArrayList<>();
        pergunta9.add("DivisÃ£o de potÃªncia teorico"); // PERGUNTA
        pergunta9.add("2"); // ALT CORRETA
        pergunta9.add("errada");
        pergunta9.add("errada");
        pergunta9.add("errada");
        pergunta9.add("errada");
        pergunta9.add("Opa, voce errou a resposta. Aqui vai uma referencia para voce se basear na proxima tentativa: (https://mundoeducacao.uol.com.br/matematica/sistema-numeracao.htm)");
        pergunta9.add("OBA! Voce acertou a resposta! DÃª 10 passos ao sul para revelar o proximo desafio.");

        perguntas.put(1, pergunta1);
        perguntas.put(2, pergunta2);
        perguntas.put(3, pergunta3);
        perguntas.put(4, pergunta4);
        perguntas.put(5, pergunta5);
        perguntas.put(6, pergunta6);
        perguntas.put(7, pergunta7);
        perguntas.put(8, pergunta8);
        perguntas.put(9, pergunta9);


        return perguntas;
    }

    static boolean verifica_acerto(String letra_resposta, ArrayList<String> alternativas, String correta){

        int index_resposta = -1;
        switch (letra_resposta){
            case "A" -> index_resposta = 0;
            case "B" -> index_resposta = 1;
            case "C" -> index_resposta = 2;
            case "D" -> index_resposta = 3;
            case "E" -> index_resposta = 4;
        }
        String resposta = alternativas.get(index_resposta);

        resposta = resposta.replace("    (A) ", "");
        resposta = resposta.replace("    (B) ", "");
        resposta = resposta.replace("    (C) ", "");
        resposta = resposta.replace("    (D) ", "");
        resposta = resposta.replace("    (E) ", "");

        if (correta.equals(resposta)){
            return true;
        }
        return false;
    }

    static ArrayList<String> embaralha_alternativas(ArrayList<String> alternativas){
        ArrayList<String> new_alternativas = new ArrayList<>();
        Collections.shuffle(alternativas);
        for(int i = 0; i < alternativas.size(); i++) {
            switch (i) {
                case 0:
                    new_alternativas.add("    (A) " + alternativas.get(i));
                    break;
                case 1:
                    new_alternativas.add("    (B) " + alternativas.get(i));
                    break;
                case 2:
                    new_alternativas.add("    (C) " + alternativas.get(i));
                    break;
                case 3:
                    new_alternativas.add("    (D) " + alternativas.get(i));
                    break;
                case 4:
                    new_alternativas.add("    (E) " + alternativas.get(i));
                    break;
            }
        }
        return new_alternativas;

    }

    static boolean faz_pergunta(ArrayList<String> pergunta) {
        String enunciado = "";
        String correta = "";
        ArrayList<String> alternativas = new ArrayList<>();
        String ajuda = "";
        String instrucao = "";

        int index;
        for (index = 0; index <= pergunta.size(); index++) {
            if (index == 0) enunciado = pergunta.get(index);
            else if (index == 1) {
                correta = pergunta.get(index);
                alternativas.add(pergunta.get(index));
            }
            else if ((2 <= index) && (index <= 5)) alternativas.add(pergunta.get(index));
            else if (index == 6) ajuda = pergunta.get(index);
            else if (index == 7) instrucao = pergunta.get(index);
        }

        int tentativas = 3;
        String letra_resposta = "";
        do {
            System.out.println(enunciado);
            ArrayList<String> new_alternativas = embaralha_alternativas(alternativas);
            for(String alternativa : new_alternativas){
                System.out.println(alternativa);
            }
            System.out.println("Informe a alternativa correta: ");
            letra_resposta = entrada.next().toUpperCase();
            if (valida("alternativa", letra_resposta)){

                if (verifica_acerto(letra_resposta, new_alternativas, correta)){
                    System.out.println(instrucao);
                    return true;
                }
                else {
                    if (tentativas == 3){
                        System.out.println();
                        System.out.println(ajuda);
                        System.out.println("Tente novamente! \n");
                    }
                    else if (tentativas == 2){
                        System.out.println("\nVoce errou. Mas calma, voce ainda tem uma chance. Tente novamente.\n");
                    }
                    else {
                        System.out.println("\nInfelizmente voce nao tem mais tentativas. O tesouro nunca mais serÃ¡ encontrado!\n");
                    }
                    tentativas -= 1;
                }
            }
        } while (tentativas > 0);
        return false;
    }

    static void jogar() {
        // Funcao principal do jogo
        instrucoes();
        historia(0);
        System.out.println(personagem + ", voce poderia ajudar o Pirata Barba Verde a resolver os desafios para chegar ao tesouro? (S ou N)");
        String resp;
        do {
            resp = entrada.next().toUpperCase();
        } while (!valida("sair", resp));
        if (resp.equals("N")){
            sair();
        }
        System.out.println("Sabia. Voce Ã© demais. Vamos comeÃ§ar!\n\n");
        historia(2);

        boolean acertou = false;
        acertou = faz_pergunta(dict_perguntas.get(1));
        acertou = faz_pergunta(dict_perguntas.get(2));
        acertou = faz_pergunta(dict_perguntas.get(3));
        acertou = faz_pergunta(dict_perguntas.get(4));
        acertou = faz_pergunta(dict_perguntas.get(5));
        acertou = faz_pergunta(dict_perguntas.get(6));
        if (!acertou) return;


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
