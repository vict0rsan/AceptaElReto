package volumen2;

import java.util.Scanner;

public class problema247 {

    public static void main(String[] args) { //PERFECTO
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Introduce numero de muestras: ");
            int m = input.nextInt();
            if(m==0)
                break;
            int[] datos = new int[m];
            boolean check = true;
            for (int i = 0; i < m; i++) {
                System.out.println("Introduce valor: " + (i + 1));
                datos[i] = input.nextInt();
            }

            for (int j = 0; j < m - 1; j++) {
                if (datos[j + 1] <= datos[j]) {
                    check = false;
                }
            }

            System.out.println(check ? "SI" : "NO");
        } while (true);
    }

}
