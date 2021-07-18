package volumen1;

import java.util.Scanner;

public class problema157 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        int [] meses = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i = 0; i < casos; i++){

            int dia = input.nextInt();
            int mes = input.nextInt();

            int diasHastaNocheVieja = 0;

            diasHastaNocheVieja = meses[mes-1]-dia;

            for(int j = mes; j < 12; j++){
                diasHastaNocheVieja+=meses[j];
            }

            System.out.println(diasHastaNocheVieja);

        }
    }
}
