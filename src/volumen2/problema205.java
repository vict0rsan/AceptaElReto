package volumen2;

import java.util.Scanner;

public class problema205 {

    public static void main(String[] args) { //PERFECT - ACCEPTED
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < cases; i++) {
            int counter = 0;
            String number = input.nextLine();
            boolean lychrel = false;

            while(Integer.parseInt(number) <= 1000000000){
                number = reverseAndSum(number);
                counter++;

                if(palindrome(number)) {
                    lychrel = true;
                    break;
                }
            }

            if(lychrel)
                System.out.println(counter + " " + number);
            else
                System.out.println("Lychrel?");
        }
    }

    public static boolean palindrome(String number){
        StringBuilder sb = new StringBuilder(number);
        return number.equals(sb.reverse().toString());
    }

    public static String reverseAndSum(String number){
        String reversedNumber = new StringBuilder(number).reverse().toString();
        int numberValue = Integer.parseInt(number);
        int reversedNumberValue = Integer.parseInt(reversedNumber);
        return Integer.toString(numberValue+reversedNumberValue);
    }
}
