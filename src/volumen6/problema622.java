package volumen6;

import java.util.Scanner;

public class problema622 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            int examenes = input.nextInt();

            if(examenes == 0)
                break;

            int [] notas = new int[examenes];
            int sumador = 0;

            for(int i = 0; i < examenes; i++){
                notas[i] = input.nextInt();
                sumador+=notas[i];
            }

            int mediaPrometida = input.nextInt();

            int aux = mediaPrometida*(examenes+1) - sumador;

            if(aux > mediaPrometida)
                System.out.println("IMPOSIBLE");
            else if(aux <= mediaPrometida)
                System.out.println(aux);

        }

    }
}
