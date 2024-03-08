
public class Avaliativo {
    public static void main(String[] args) {
//1 Questão Letra A,B,C,D

        //Valor de X
        double x = -2;
        // Equação a)
                double expressao_1 = 2*x + 5*x - 10*x - (-x - 20) + 40*x;
                System.out.println("a) Resultado: " + expressao_1);

                // Equação b)
               double expressao_2 = 8*x + 5 + 30/x - 20*x - (x - 5*x - 10*x);
               System.out.println("b) Resultado: " + expressao_2);

        //Expressão C) 100x + 5x + x + x/8 - 85x - 22x
        double expressao_3 = 100 * x + 5 * x + x + x/8 - 85 * x - 22 * x;
        System.out.println("\nResultado C: " +expressao_3);

        //Expressão D) 10/x + 8x - 12x

        double expressao_4 = 10 / x + 8 * x - 12 * x;
        System.out.println("\nResultado D: " +expressao_4);

        //2 Questão:
        float nota_1 = 3f;
        float nota_2 = 5f;
        float nota_3 = 7f;
        float nota_4 = 4f;

        float media_nota = (nota_1 + nota_2 + nota_3 + nota_4)/4;
        System.out.println("\nA média equivale a: " +media_nota);

        //Questão 5:




                //Venda média diária: ((n1+n2+n3) / 3)/25
                //E.min = (VMD X TR)
                //E.max = (L.R x E.min)

                System.out.println("\n---------------------------------------------------------------");
                System.out.println("\tProduto A");

                //Atribuições:
                int m_1 = 250;
                int m_2 = 500;
                int m_3 = 800;
                int m_4 = 1200;

                //Valores fixos:
                int tempo_rep = 6;
                int lote_rep = 85;
                int estoque_atual = 100;

                //Fórmulas e informações do VMD, Estoque minimo, máximo e tomada de decisão
                int vmd = ((m_1 + m_2 + m_3 + m_4)/3)/25;
                System.out.println("\n O VMD equivale a: " + vmd);

                int estoque_minimo = (vmd * tempo_rep);
                System.out.println("\n O Estoque mínimo equivale a: "+estoque_minimo);

                int estoque_max = (lote_rep + estoque_minimo);
                System.out.println("\n O estoque máximo equivale a: "+estoque_max);

                if (estoque_atual > estoque_minimo){
                    System.out.println("\n Compra não necessária.");
                }
                else{
                    System.out.println("\n Compra necessária.");
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("\n");
                System.out.println("\n------------------------------------------------------");
                System.out.println("\n \t Produto B");


                int mes_1 = 700;
                int mes_2 = 900;
                int mes_3 = 1300;
                int mes_4 = 1600;

                //Valores fixos:
                int temp_r_prodb = 8;
                int lote_rep_b = 90;
                int estoque_atual_b = 150;

                //Fórmulas e informações do VMD, Estoque minimo, máximo e tomada de decisão
                int vmd_prodB = ((mes_1 + mes_2 + mes_3 + mes_4)/3)/25;
                System.out.println("\n O VMD equivale a: " + vmd_prodB);

                int estoque_min_B = (vmd_prodB * temp_r_prodb);
                System.out.println("\n O Estoque mínimo equivale a: "+estoque_min_B);

                int estoque_max_B = (lote_rep_b + estoque_min_B);
                System.out.println("\n O estoque máximo equivale a: "+estoque_max_B);

                if (estoque_atual_b > estoque_min_B){
                    System.out.println("\n Compra não necessária.");
                }
                else{
                    System.out.println("\n Compra necessária.");
                }

                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("\n");
                System.out.println("\n------------------------------------------------------");
                System.out.println("\n \t Produto C");

                //Atribuições:
                int mes_1_C = 900;
                int mes_2_C = 1600;
                int mes_3_C = 2100;
                int mes_4_C = 1700;

                //Valores fixos:
                int tempo_rep_C = 9;
                int lote_rep_C = 120;
                int estoque_atual_C = 60;

                //Fórmulas e informações do VMD, Estoque minimo, máximo e tomada de decisão
                int vmd_amd = ((mes_1_C + mes_2_C + mes_3_C + mes_4_C)/3)/25;
                System.out.println("\n O VMD equivale a: " + vmd_amd);

                int estoque_min_C = (vmd_amd * tempo_rep_C);
                System.out.println("\n O Estoque mínimo equivale a: "+estoque_min_C);

                int estoque_max_C = (lote_rep_C + estoque_min_C);
                System.out.println("\n O estoque máximo equivale a: "+estoque_max_C);

                if (estoque_atual_C > estoque_min_C){
                    System.out.println("\n Compra não necessária.");
                }
                else{
                    System.out.println("\n Compra necessária.");
                }

        //4 Questão:

        System.out.println("\n \t Inicio do programa.");
        int opcao = 1;
        if(opcao == 1){
            System.out.println("\n 1. O saldo da sua conta é R$ 5.000");
        } else if (opcao == 2) {
            System.out.println("\n 2. O usuário cadastrado na conta é Lucas Almeida de Souza");
        }
        else {
            System.out.println("\n 3. Você será encaminhado para um atendente.");
        }
        //Resultado:
        System.out.println("\n A opção desejada foi a opção: " +opcao);

        //7 Questão:

        int valor_1 = 40;
        int valor_2 = 20;

        int soma_valores = valor_1 + valor_2;
        int multiplica = valor_1 * valor_2;
        int divisao = valor_1/valor_2;



    }
}