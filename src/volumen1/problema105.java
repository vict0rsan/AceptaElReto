package volumen1;

import java.util.*;

public class problema105 { //PERECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double [] lista = new double[6];

        String [] dias = {"MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};

        while(true){

            double martes = input.nextDouble();

            if(martes == -1)
                break;

            lista[0] = martes;

            for(int i = 1; i < 6; i++){
                lista[i] = input.nextDouble();
            }

            double max = 0;
            double min = 1000000000;
            int posMax = 0;
            int posMin = 0;
            int suma = 0;
            String finde = "";

            for(int i = 0; i < 6; i++){

                if(max < lista[i]) {
                    max = lista[i];
                    posMax = i;
                }
                if(min > lista[i]){
                    min = lista[i];
                    posMin = i;
                }

                suma+=lista[i];
            }

            finde = lista[5] > suma/6 ? "SI" : "NO";

            if(max!=min)
                System.out.println(dias[posMax] + " " + dias[posMin] + " " + finde);
            else
                System.out.println("EMPATE");
        }
    }
}