package volumen1;

import java.util.*;

public class problema161 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            int tamañoMuestra = input.nextInt();

            if(tamañoMuestra == 0)
                break;

            int [] valores = new int [tamañoMuestra];

            for(int i = 0; i < tamañoMuestra; i++){
                valores[i] = input.nextInt();
            }

            Arrays.sort(valores);

            double mediana = 0;
            int medio = tamañoMuestra/2;

            if(tamañoMuestra%2 != 0) {
                mediana = valores[medio];
            }
            else{
                mediana = (valores[medio] + valores[medio-1])/2.0;
            }

            System.out.println((int)Math.round(mediana*2));

        }
    }
}
