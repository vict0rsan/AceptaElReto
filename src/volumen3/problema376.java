package volumen3;

import java.util.*;

public class problema376 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {

            int n_datos = s.nextInt();

            if (n_datos == 0) {
                break;
            }

            int contador = 0;

            int[] datos = new int[n_datos];

            for (int i = 0; i < n_datos; i++) {
                datos[i] = s.nextInt();
            }

            for (int i = 1; i < n_datos - 1; i++) {
                if (datos[i] > datos[i - 1] && datos[i] > datos[i + 1]) {
                    contador++;
                }
            }

            if (datos[0] > datos[1] && datos[0] > datos[datos.length - 1]) {
                contador++;
            } else if (datos[n_datos - 1] > datos[n_datos - 2] && datos[n_datos - 1] > datos[0]) {
                contador++;
            }

            System.out.println(contador);

        }
    }

}
