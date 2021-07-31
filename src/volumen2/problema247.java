package volumen2;

import java.util.Scanner;

public class problema247 {

    public static void main(String[] args) { //PERFECTO - ACCEPTED

        Scanner input = new Scanner(System.in);

        while (true) {

            int muestras = input.nextInt();

            if(muestras==0)
                break;

            int[] datos = new int[muestras];
            boolean check = true;

            for (int i = 0; i < muestras; i++)
                datos[i] = input.nextInt();


            for (int j = 0; j < muestras - 1; j++) {
                if (datos[j + 1] <= datos[j]) {
                    check = false;
                }
            }

            System.out.println(check ? "SI" : "NO");

        }
    }

}
