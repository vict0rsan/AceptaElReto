package volumen3;

import java.util.Scanner;

public class problema366 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numNiños;

        do {
            System.out.println("Introduce a cuantos niños hay que repartir regalos");

             numNiños = input.nextInt();
            int niños[][] = new int[numNiños][2];

            for (int i = 0; i <= numNiños; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        System.out.println("introduce como se ha portado el niño");
                        niños[i][j] = input.nextInt();
                    } else {
                        System.out.println("Introduce el peso del regalo");
                        niños[i][j] = input.nextInt();
                    }
                    
                }

            }
        } while (numNiños != 0);

        }
       
    
   
    }
