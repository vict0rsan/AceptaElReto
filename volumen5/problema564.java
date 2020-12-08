package volumen5;

import java.util.Scanner;

public class problema564 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la N que quieras calcular: ");
        int casos = input.nextInt();
        int poirot = 0;

        for (int j = 0; j < casos; j++) {
            System.out.println("Introduce la N para 2^n");
            int n = input.nextInt();
            
            for (int i = 3; i < Math.pow(2, n); i++) {
                if ((Math.pow(2,i)-1) % 7 == 0) {
                    poirot++;
                    if((Math.pow(2,i)-1) >= Math.pow(2, n))
                        break;
                    //System.out.println(Math.pow(2,i)-1);
                    //System.out.println(Math.pow(2, n));
                    //System.out.println("poirot = " + poirot);
                }
                
            }
            System.out.println("poirot = " + (poirot-1));
            poirot = 0;
        }

    }
}
