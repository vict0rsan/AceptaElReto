package volumen2;

import java.util.Scanner;

public class problema245 { //MEMORY LIMIT EXCEED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean dalton = true;

        while (true) {

            int personas = input.nextInt();

            if (personas == 0)
                break;

            long alturas[] = new long[personas];

            for (int i = 0; i < personas; i++)
                alturas[i] = input.nextLong();


            for (int i = 0; i < personas - 1; i++) {
                if (alturas[i] - alturas[i + 1] >= 0) {
                    dalton = false;
                    break;
                }
            }

            if (dalton == true)
                System.out.println("DALTON");
            else
                System.out.println("DESCONOCIDOS");
        }
    }
}