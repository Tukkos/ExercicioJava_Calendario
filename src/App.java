import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Holyday confraternizaçãoMundial = new Holyday();
        confraternizaçãoMundial.setDate("01/01/2023");
        confraternizaçãoMundial.setHolydayName("Confraternização mundial");

        Holyday carnaval = new Holyday();
        carnaval.setDate("21/02/2023");
        carnaval.setHolydayName("Carnaval");

        Holyday pascoa = new Holyday();
        pascoa.setDate("17/04/2023");
        pascoa.setHolydayName("Páscoa");

        Holyday tiradentes = new Holyday();
        tiradentes.setDate("21/04/2023");
        tiradentes.setHolydayName("Tiradentes");

        Holyday diaDoTrabalho = new Holyday();
        diaDoTrabalho.setDate("01/05/2023");
        diaDoTrabalho.setHolydayName("Dia do Trabalho");

        Holyday corpusChristi = new Holyday();
        corpusChristi.setDate("08/06/2023");
        corpusChristi.setHolydayName("Corpus Christi");

        Holyday independenciaDoBrasil = new Holyday();
        independenciaDoBrasil.setDate("07/09/2023");
        independenciaDoBrasil.setHolydayName("Independência do Brasil");

        Holyday nossaSenhoraAparecida = new Holyday();
        nossaSenhoraAparecida.setDate("12/10/2023");
        nossaSenhoraAparecida.setHolydayName("Nossa Senhora Aparecida");

        Holyday finados = new Holyday();
        finados.setDate("02/11/2023");
        finados.setHolydayName("Finados");

        Holyday proclamacaoDaRepulbica = new Holyday();
        proclamacaoDaRepulbica.setDate("15/11/2023");
        proclamacaoDaRepulbica.setHolydayName("Proclamação da República");

        Holyday natal = new Holyday();
        natal.setDate("25/12/2023");
        natal.setHolydayName("Natal");


        List<Holyday> holydays = new ArrayList<>();
        holydays.add(confraternizaçãoMundial);
        holydays.add(carnaval);
        holydays.add(pascoa);
        holydays.add(tiradentes);
        holydays.add(diaDoTrabalho);
        holydays.add(corpusChristi);
        holydays.add(independenciaDoBrasil);
        holydays.add(nossaSenhoraAparecida);
        holydays.add(finados);
        holydays.add(proclamacaoDaRepulbica);
        holydays.add(natal);

        Scanner read = new Scanner(System.in);
        System.out.println("Digite a data que deseja procurar o feriado");
        String date = read.nextLine();

        for (int i = 0; i < holydays.size(); i++) {
            if (date.equals(holydays.get(i).getDate()) == true) {
                System.out.println("O feriado do dia " + date + " é: " +holydays.get(i).getHolydayName());
                break;
            }
            if (i == holydays.size() - 1) {
                System.out.println("Não existe feriado com tal data.");
            }
        }
    }
}
