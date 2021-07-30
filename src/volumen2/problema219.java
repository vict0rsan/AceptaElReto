package volumen2;

import java.util.Scanner;

public class problema219 {

    public static void main(String[] args) { //PERFECTP - ACCEPTED

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        for(int i = 0; i < casos; i++){

            int comprados = 0;

            int decimos = input.nextInt();

            for(int j = 0; j < decimos; j++){
                int numero = input.nextInt();

                if(numero%2==0)
                    comprados++;

            }

            System.out.println(comprados);
        }
    }
}
