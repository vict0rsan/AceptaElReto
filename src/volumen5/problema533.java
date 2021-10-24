package volumen5;

import java.util.*;

public class problema533 {

    public static void main(String[] args) { //PERFECT - ACCEPTED
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();

        for (int i = 0; i < casos; i++) {

            double sumaKilos = 0;
            boolean objetivo = false;
            int personas = 1;
            int kilosDeseados = input.nextInt();

            while (true) {


                int numeroBotellas = input.nextInt();

                if (numeroBotellas == 0)
                    break;
                else {
                    sumaKilos += numeroBotellas * 0.125;

                    if (sumaKilos >= kilosDeseados) {
                        objetivo = true;
                        input.nextLine();
                        break;
                    }
                    personas++;
                }
            }

            if (objetivo)
                System.out.println(personas);
            if (!objetivo)
                System.out.println("SIGAMOS RECICLANDO");
        }
    }
}
