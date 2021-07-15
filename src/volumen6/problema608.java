package volumen6;

import java.util.Scanner;

public class problema608 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       while(true){

           int datos = input.nextInt();

           if(datos == 0)
               break;

           int [] grados = new int [datos];

           for(int i = 0; i < datos; i++){
               grados[i] = input.nextInt();
           }

           boolean tempAlta = true;
           int contador = 0;

           for(int i = 0; i < datos; i++){

               if(grados[i] <= 4 && tempAlta == true) {
                   contador++;
                   tempAlta = false;
               }
               else if(grados[i] > 6)
                   tempAlta = true;
           }

           System.out.println(contador);
       }
    }
}
