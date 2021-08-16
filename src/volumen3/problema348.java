package volumen3;

import java.util.Scanner;

public class problema348 { //PERFECTO - TIME LIMIT EXCEEDED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        for(int i = 0; i < casos; i++){

            int numero = input.nextInt();
            System.out.println(distanciaEntreCapicuas(numero));

        }
    }

    public static int distanciaEntreCapicuas(int numero){
        int contador = 1;

        while(true){

            numero++;
            String numeroString = Integer.toString(numero);

            StringBuilder numeroStringSb = new StringBuilder(numeroString);
            StringBuilder numeroStringSbInverso = numeroStringSb.reverse();
            String numeroStringInverso = numeroStringSbInverso.toString();

            if(numeroString.equals(numeroStringInverso))
                return contador;

            contador++;
        }
    }
}
