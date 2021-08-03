package volumen5;
import java.util.*;

public class problema572 { //PERFECTO - COMPILATION ERROR POR USAR LAMBDAS

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int alumnos = input.nextInt();

        for (int i = 0; i < alumnos; i++) {
            List <Double> notas = new ArrayList<>();

            for (int j = 0; j < 5; j++)
                notas.add(input.nextDouble());

            int nueve = (int) notas.stream().filter(number -> number >= 9.0).count();
            int cero = (int) notas.stream().filter(number -> number == 0.0).count();

            if ( nueve >= 1)
                System.out.println("MEDIA");
            else if (cero >= 1)
                System.out.println("SUSPENSO DIRECTO");
            else
                System.out.println("MEDIA");

            notas.clear();
        }
    }
}

