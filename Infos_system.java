import java.util.*; //Para linguagem
import java.util.Date; //Para datas
import java.awt.Toolkit; // ToolKit
import java.awt.Dimension; //Dimensionamento

public class Infos_system {
    public static void main(String[] args) {
        System.out.println("\n Informações do sistema: ");

        System.out.println("\n A linguagem do sistema se encontra em: ");
        Locale nacionalidade = Locale.getDefault();
        System.out.println(nacionalidade.getDisplayLanguage());

        Date horario_sistema = new Date();
        System.out.println("\n A hora do sistema corresponde a: ");
        System.out.println(horario_sistema);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension res = tk.getScreenSize();
        System.out.println("\n A resolução do seu sistema corresponde a: ");
        System.out.println(+res.width + "X" + res.height);

    }
}
