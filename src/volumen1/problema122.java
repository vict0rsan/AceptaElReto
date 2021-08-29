package volumen1;

import java.util.Scanner;

public class problema122 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int pos = 0;
        int kl = 0;
        int tempKl = 0;
        int tempPlanas;
        int planas = 0;
        boolean comen;
        boolean first;

        while (true) {

            comen = false;
            first = false;
            tempPlanas = -1;

            n1 = input.nextInt();

            if (n1 == -1)
                break;

            while (true) {

                n2 = input.nextInt();

                if (n2 == -1)
                    break;

                if (n1 == n2) {
                    comen = true;
                    if (!first) {
                        tempPlanas = 0;
                        first = true;
                        tempKl = pos;
                    }
                    tempPlanas++;
                    if (tempPlanas > planas) {
                        planas = tempPlanas;
                        kl = tempKl;
                    }
                } else
                    first = false;
                n1 = n2;
                pos++;
            }

            if (!comen)
                System.out.println("HOY NO COMEN");
            else
                System.out.println(kl + " " + planas);
        }
    }
}
