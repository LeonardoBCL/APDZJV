public class Main {
    public static void main(String[] args) {

        // Questao 1 //
        System.out.println("Questao 1: ");
        double x = -2;
        // Equação a)
        double expressao_1 = 2*x + 5*x - 10*x - (-x - 20) + 40*x;
        System.out.println("a) Resultado: " + expressao_1);

        // Equação b)
        double expressao_2 = 8*x + 5 + 30/x - 20*x - (x - 5*x - 10*x);
        System.out.println("b) Resultado: " + expressao_2);

        //Equação c) 100x + 5x + x + x/8 - 85x - 22x
        double expressao_3 = 100 * x + 5 * x + x + x/8 - 85 * x - 22 * x;
        System.out.println("c) Resultado: " +expressao_3);

        //Equação d) 10/x + 8x - 12x
        double expressao_4 = 10 / x + 8 * x - 12 * x;
        System.out.println("d) Resultado: " +expressao_4);

        // Questao 2 //
        System.out.println("\nQuestao 2: ");
        float nota_1 = 3f;
        float nota_2 = 5f;
        float nota_3 = 7f;
        float nota_4 = 4f;

        float media_nota = (nota_1 + nota_2 + nota_3 + nota_4)/4;
        System.out.println("A média equivale a: " +media_nota);

        // Questao 3 //
        System.out.println("\nQuestao 3: ");
        int idade = 16;
        if (idade > 18) {
            System.out.println("Bem-vindo.");
        }else
            System.out.println("Acesso negado.");

        // Questao 4 //

        System.out.println("\nQuestao 4: ");
        int opcao = 1;
        if(opcao == 1){
            System.out.println("1. O saldo da sua conta é R$ 5.000");
        } else if (opcao == 2) {
            System.out.println("2. O usuário cadastrado na conta é Lucas Almeida de Souza");
        }
        else {
            System.out.println("3. Você será encaminhado para um atendente.");
        }
        //Resultado:
        System.out.println("A opção desejada foi a opção: " +opcao);

        // Questao 6 //
        System.out.println("\nQuestao 6: ");
        String conteudo = "Banana, Cajá, Goiaba, Uva, Morango, Pêra, Maçã, Damasco, Melão, Laranja";

        // Dividir a string em um array de frutas usando vírgula como delimitador
        String[] produto = conteudo.split(", ");

        // Imprimir os conteúdos 1, 3 e 7
        System.out.println("Produto 1: " + produto[0]);
        System.out.println("Produto 3: " + produto[2]);
        System.out.println("Produto 7: " + produto[6]);

        // Questao 7 //
        System.out.println("\nQuestao 7: ");
        int valor_1 = 40;
        int valor_2 = 20;

        int soma_valores = valor_1 + valor_2;
        int multiplica = valor_1 * valor_2;
        int divisao = valor_1/valor_2;

        // Questao 8 //
        System.out.println("\nQuestao 8: ");
        String saudacoes = "Seja bem-vindo";
        String[] resultado = saudacoes.split(", ");
        System.out.println("" + resultado[0]);
        System.out.println("" + resultado[1]);
     }
    }
