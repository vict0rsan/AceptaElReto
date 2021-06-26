package volumen3;

import java.util.Scanner;

public class problema366 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numNinos;

        do {
            System.out.println("Introduce a cuantos niños hay que repartir regalos");

             numNinos = input.nextInt();
            int ninos[][] = new int[numNinos][2];

            for (int i = 0; i <= numNinos; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        System.out.println("introduce como se ha portado el niño");
                        ninos[i][j] = input.nextInt();
                    } else {
                        System.out.println("Introduce el peso del regalo");
                        ninos[i][j] = input.nextInt();
                    }
                    
                }

            }
        } while (numNinos != 0);

        }
       
    
   
    }
