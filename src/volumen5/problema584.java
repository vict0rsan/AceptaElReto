package volumen5;

import java.util.Scanner;

public class problema584 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        for(int i = 0; i < casos; i++){

            int horas = input.nextInt();
            int encendidos = input.nextInt();
            int horasEstimadas = input.nextInt();

            if(encendidos*horasEstimadas > horas)
                System.out.println("HORAS");
            else if(encendidos*horasEstimadas < horas)
                System.out.println("ENCENDIDOS");
            else
                System.out.println("AMBAS");

        }
    }
}
