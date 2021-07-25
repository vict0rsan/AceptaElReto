package volumen4;

import java.util.Scanner;

public class problema424 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            int max = 0;
            int total = 0;

            int movimientos = input.nextInt();

            if(movimientos == 0)
                break;

            int [] ahorros = new int [movimientos];

            for(int i = 0; i < movimientos; i++)
                ahorros[i] = input.nextInt();

            for(int i = 0; i < movimientos; i++){
                total+=ahorros[i];

                if(max < total)
                    max = total;
            }

            System.out.println(total + " " + max);


        }
    }
}
