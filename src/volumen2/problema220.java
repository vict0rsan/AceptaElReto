package volumen2;

import java.util.Scanner;

public class problema220 { //INCORRECTO PERO ME SIRVE PARA PRACTICAR CON GIT

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int casosPrueba = input.nextInt();

        for(int i = 0; i < casosPrueba; i++){

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int sum = num1 + num2;

            System.out.println(sum<=31 ? "GANA" : "PIERDE");


        }

    }
}
