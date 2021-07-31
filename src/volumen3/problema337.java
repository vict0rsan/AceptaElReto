package volumen3;
import java.util.Scanner;

public class problema337 {

    public static void main(String[] args) { //PERFECTO - ACCEPTED

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        for(int i = 0; i < casos; i++){

            int [] arriba = new int [6];
            int [] abajo = new int [6];

            for(int j = 0; j < 6; j++)
                arriba[j] = input.nextInt();

            for(int k = 0; k < 6; k++)
                abajo[k] = input.nextInt();

            boolean iguales = true;

            for(int n = 0; n < 6-1; n++){
                if(abajo[n] + arriba[n] != arriba[n+1]+abajo[n+1]){
                    iguales = false;
                    break;
                }
                else{
                    abajo[n] = abajo[n+1];
                    arriba[n] = arriba[n+1];
                }
            }

            System.out.println(iguales ? "SI" : "NO");
        }
    }
}
