package volumen1;

import java.util.Arrays;
import java.util.Scanner;

public class problema100 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] num;
        int C = input.nextInt();

        while (C-- != 0) {

            num = input.next().toCharArray();

            if (Integer.parseInt(new String(num)) == 6174) {
                System.out.println( 0 );
                continue;
            }

            int iterations = 1;
            while (iterations < 8) {

                int desc = aMenor(num);
                int asc  = aMayor(num);
                int newNum = desc - asc;

                if (newNum == 6174) {
                    break;
                }

                num = String.valueOf(newNum).toCharArray();
                iterations++;
            }

            System.out.println( iterations );
        }

    }


    public static int aMayor(char [] num) {
        Arrays.sort(num);
        return Integer.parseInt(new String(num));
    }

    public static int aMenor(char [] num) {
        Arrays.sort(num);
        reverse(num);
        int n = Integer.parseInt(new String(num));
        return (n / 1000 == 0) ? rellenaCeros(n) : n;
    }

    public static int rellenaCeros(int num){
        if (num != 0 && num < 1000) return rellenaCeros(num * 10);
        return num;
    }

    public static void reverse(char[] num) {
        for (int i = 0; i < num.length / 2; i++) {
            char temp = num[num.length - i - 1];
            num[num.length - i - 1] = num[i];
            num[i] = temp;
        }
    }
}
