package volumen4;

import java.util.Scanner;

public class problema403 {

    public static void main(String[] args) {
        boolean existe = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce casos de prueba:");
        int casos = input.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Introduce campo metros cuadrados:");
            int m2 = input.nextInt();
            System.out.println("Introduce campos de furbol: ");
            int cp = input.nextInt();

            for (int j = 90; j <= 120; j++) {
                for (int k = 45; k <= 90; k++) {
                    if (j * k == m2) {
                        existe = true;
                    }
                }
            }

            System.out.println(existe ? "SI" : "NO");

        }
    }

}
