import java.util.List;
import java.util.Scanner;

public class HolydaySearch {
    
    public void searchADate(List<Holyday> holydays) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a data que deseja procurar o feriado");
        String date = read.nextLine();

        for (int i = 0; i < holydays.size(); i++) {
            if (date.equals(holydays.get(i).getDate())) {
                System.out.println("O feriado do dia " + date + " é: " + holydays.get(i).getHolydayName());
                break;
            }
            if (i == holydays.size() - 1) {
                System.out.println("Não existe feriado com tal data.");
            }
        }
    }

    public List<Holyday> returnHolydayList(List<Holyday> holydays) {
        return holydays;
    }
}
