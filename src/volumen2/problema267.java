package volumen2;

import java.util.Scanner;

public class problema267 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Introduce lado 1: ");
            int lado1 = input.nextInt();
            System.out.println("Introduce lado 2: ");
            int lado2 = input.nextInt();
            System.out.println("Introduce distancia max: ");
            int dmax = input.nextInt();

            if (lado1 == 0 && lado2 == 0 && dmax == 0) {
                break;
            }

            int vallas = nVallas(lado1, lado2, dmax);
            System.out.println("vallas:" + vallas);

        } while (true);

    }

    public static int nVallas(int lado1, int lado2, int dmax) {
        int vallas = 4;

        if (lado1 / dmax > 0 && lado1 % dmax != 0) {
            vallas += (lado1 / dmax) * 2;
           // System.out.println("No se debe ejecutar si % = 0: " + vallas);
        } else if (lado1 / dmax > 0 && lado1 % dmax == 0) {
            vallas += ((lado1 / dmax) - 1) * 2;
            //System.out.println("Esto deberia de dar 4: " + vallas);
        }

        if (lado2 / dmax > 0 && lado2 % dmax != 0) {
            vallas += (lado1 / dmax) * 2;
           // System.out.println("No se debe ejecutar si % = 0: " + vallas);
        } else if (lado2 / dmax > 0 && lado2 % dmax == 0) {
            vallas += ((lado1 / dmax) - 1) * 2;
            //System.out.println("Esto deberia de dar 4: " + vallas);
        }

        return vallas;
    }
}
