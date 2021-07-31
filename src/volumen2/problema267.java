package volumen2;

import java.util.Scanner;

public class problema267 { //PERFCTO - ACCEPTED

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            long lado1 = input.nextLong();
            long lado2 = input.nextLong();
            long dmax = input.nextLong();

            if (lado1 == 0 && lado2 == 0 && dmax == 0) {
                break;
            }

            long vallas = nVallas(lado1, lado2, dmax);

            System.out.println(vallas);
        }
    }

    public static long nVallas(long lado1, long lado2, long dmax) {

        int vallas = 4;

        if(lado1 > dmax || lado2 > dmax){
            if(lado1 > dmax && lado2 > dmax)
                vallas += ((lado1-1)/dmax)*2 + ((lado2-1)/dmax)*2;
            else if(lado1 > dmax)
                vallas += ((lado1-1)/dmax)*2;
            else if(lado2 > dmax)
                vallas += ((lado2-1)/dmax)*2;
        }
        return vallas;
    }
}
