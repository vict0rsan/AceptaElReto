package volumen6;

import java.util.*;

public class problema602 { //FUNCIONA BIEN PERO EL COSTE TEMPORAL DE LA FUNCION RECURSIVA ES DEMASIADO ALTO

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int casos = s.nextInt();

        for (int i = 0; i < casos; i++) {

            int centimos = s.nextInt();

            int sum = 0;
            int count = 1;

            while (sum < centimos) {

                sum += centimos(count);
                count++;

            }

            System.out.println(count - 1);
        }

    }

    public static int centimos(int dias) {

        if (dias == 1) {
            return 1;
        } else if (dias == 2) {
            return 1;
        } else {
            return 2 * centimos(dias - 2) + centimos(dias - 1);
        }
    }

}
