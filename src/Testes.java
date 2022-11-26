public class Testes {
    public static void main(String[] args) {
        System.out.println("Realizando testes..");

        testa_valida("opcao", "9", false);
        testa_valida("opcao", "1", true);
        testa_valida("alternativa", "J", false);
        testa_valida("alternativa", "D", true);
        testa_valida("sair", "C", false);
        testa_valida("sair", "S", true);
        testa_valida("sair", "N", true);


    }

    public static void testa_valida(String modo, String entrada, boolean esperado){
        if (Jogo.valida(modo, entrada) == esperado){
            System.out.println("OK, passou nesse teste.");
        } else {
            System.out.println("Nao passou nesse teste.");
        }

    }

}
