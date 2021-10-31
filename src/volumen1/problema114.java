package volumen1;

import java.util.Scanner;

public class problema114 { //PERFECT - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int number = input.nextInt();
            int lastDigitFactorialNumber = lastDigitFactorial(number);
            System.out.println(lastDigitFactorialNumber);
        }
    }

    public static int lastDigitFactorial(int number) {
        if (number == 0) return 1;
        else if (number <= 2) return number;
        else if (number == 3) return 6;
        else if (number == 4) return 4;
        else return 0;
    }
}

