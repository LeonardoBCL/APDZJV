public class treino {
    public static void main(String[] args) {


        //Venda média diária: ((n1+n2+n3) / 3)/25
        //E.min = (VMD X TR)
        //E.max = (L.R x E.min)

        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\tProcessador Cyrix");
        System.out.println("\nMês 1 = 500R$, Mês 2 = 600R$, Mês 3 = 1000R$");
        System.out.println("\n---------------------------------------------------------------");
        //Atribuições:
        int mes_1_cyrex = 500;
        int mes_2_cyrex = 600;
        int mes_3_cyrex = 1000;

        //Valores fixos:
        int tempo_rep = 7;
        int lote_rep = 60;
        int estoque_atual = 100;

        //Fórmulas e informações do VMD, Estoque minimo, máximo e tomada de decisão
        int vmd = ((mes_1_cyrex + mes_2_cyrex + mes_3_cyrex)/3)/25;
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
        System.out.println("\n \t Processador Intel Core");
        System.out.println("\nMês 1 = 100,  Mês 2 = 100, Mês 3 = 100");
        System.out.println("\n-------------------------------------------------------");

        int mes_1_intel = 100;
        int mes_2_intel = 100;
        int mes_3_intel = 100;

        //Valores fixos:
        int tempo_rep_intel = 5;
        int lote_rep_intel = 50;
        int estoque_atual_intel = 70;

        //Fórmulas e informações do VMD, Estoque minimo, máximo e tomada de decisão
        int vmd_intel = ((mes_1_intel + mes_2_intel + mes_3_intel)/3)/25;
        System.out.println("\n O VMD equivale a: " + vmd_intel);

        int estoque_minimo_intel = (vmd_intel * tempo_rep_intel);
        System.out.println("\n O Estoque mínimo equivale a: "+estoque_minimo_intel);

        int estoque_max_intel = (lote_rep_intel + estoque_minimo_intel);
        System.out.println("\n O estoque máximo equivale a: "+estoque_max_intel);

        if (estoque_atual_intel > estoque_minimo_intel){
            System.out.println("\n Compra não necessária.");
        }
        else{
            System.out.println("\n Compra necessária.");
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n");
        System.out.println("\n------------------------------------------------------");
        System.out.println("\n \t Processador AMD");
        System.out.println("\nMês 1 = 250,  Mês 2 = 350, Mês 3 = 450");
        System.out.println("\n-------------------------------------------------------");

        //Atribuições:
        int mes_1_amd = 250;
        int mes_2_amd = 350;
        int mes_3_amd = 450;

        //Valores fixos:
        int tempo_rep_amd = 9;
        int lote_rep_amd = 100;
        int estoque_atual_amd = 226;

        //Fórmulas e informações do VMD, Estoque minimo, máximo e tomada de decisão
        int vmd_amd = ((mes_1_amd + mes_2_amd + mes_3_amd)/3)/25;
        System.out.println("\n O VMD equivale a: " + vmd_amd);

        int estoque_minimo_amd = (vmd_amd * tempo_rep_amd);
        System.out.println("\n O Estoque mínimo equivale a: "+estoque_minimo_amd);

        int estoque_max_amd = (lote_rep_amd + estoque_minimo_amd);
        System.out.println("\n O estoque máximo equivale a: "+estoque_max_amd);

        if (estoque_atual_amd > estoque_minimo_amd){
            System.out.println("\n Compra não necessária.");
        }
        else{
            System.out.println("\n Compra necessária.");
        }
    }
}
