package volumen3;

import java.util.*;

public class problema387 {

    public static void main(String[] args) { //PERFECTO - ACCEPTED

        Scanner input = new Scanner(System.in);

        while(true){

            int premios = input.nextInt();
            input.nextLine();

            if(premios == 0)
                break;

            String [] premiados = new String[premios];
            int [] veces = {0,0,0,0,0,0,0,0,0,0};

            for(int i = 0; i < premios; i++){
                premiados[i] = input.next();
                int last = Character.getNumericValue(premiados[i].charAt(4));
                veces[last]++;
            }

            int max = 0;
            int pos = 0;

            for(int i = 0; i < 10; i++){

                if(veces[i] > max) {
                    max = veces[i];
                    pos = i;
                }

            }

            int apariciones = 0;

            for(int i = 0; i < 10; i++){

                if(veces[i] == max) {
                    apariciones++;
                }
            }

            if(apariciones != 1)
                System.out.println("VARIAS");
            else
                System.out.println(pos);

         }
    }
}
