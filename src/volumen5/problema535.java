package volumen5;
import java.util.*;

public class problema535 {

    public static void main (String [] args){  //PERFECTO

        Scanner input = new Scanner(System.in);

        while(true){

            int tramos = input.nextInt();

            if(tramos == 0)
                break;


            int [] alturas = new int[tramos];

            for(int i = 0; i < tramos; i++){
                alturas[i] = input.nextInt();
            }

            int altura = alturas[tramos-1];
            int volumenTotal = altura * tramos;
            int capacidadMaxima = 0;

            for(int i = 0; i < tramos; i++){
                capacidadMaxima+=(altura-alturas[i]);
            }

            System.out.println(capacidadMaxima);



        }

    }
}
