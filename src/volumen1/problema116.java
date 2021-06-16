package volumen1;

import java.util.Scanner;

public class problema116 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce cuantas veces quieres que se repite la oracion 'Hola mundo': ");

        int numero = input.nextInt();

        if(numero >= 0 && numero <=5 ){
        for (int i = 1; i <= numero; i++) {
            System.out.print("Hola mundo.\n");
        }
        }

    }
}
