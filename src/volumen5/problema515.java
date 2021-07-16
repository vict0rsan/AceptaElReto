package volumen5;

import java.util.Scanner;

public class problema515 {  //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            int copas = input.nextInt();

            if(copas == 0)
                break;

            int viajes = 0;
            boolean menor = true;
            boolean mayor = false;

            while(copas > 0){

                if(menor){
                    mayor = true;
                    menor = false;
                    viajes++;
                    copas--;
                }
                else if(mayor){
                    menor = true;
                    mayor = false;

                    if(copas%2==0)
                        copas = copas - 2;
                    else
                        copas--;

                    viajes++;
                }

            }

            System.out.println(viajes);

        }
    }
}
