package volumen2;
import java.util.*;

public class problema254 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int esquiadores = input.nextInt();

            if (esquiadores == 0)
                break;

            int sumaMinima = 0;

            int alturas[] = new int[esquiadores];
            int esquis[] = new int[esquiadores];

            for (int i = 0; i < esquiadores; i++)
                alturas[i] = input.nextInt();


            for (int j = 0; j < esquiadores; j++)
                esquis[j] = input.nextInt();

            Arrays.sort(alturas);
            Arrays.sort(esquis);

            for(int k = 0; k < esquiadores; k++){
                int diferencia = Math.abs(alturas[k] - esquis[k]);
                sumaMinima += diferencia;
            }

            System.out.println(sumaMinima);
        }
    }
}
